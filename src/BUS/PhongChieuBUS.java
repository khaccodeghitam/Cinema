package BUS;

import DTO.PhongChieuDTO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Component;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PhongChieuBUS {
    
    /**
     * Xuất dữ liệu từ bảng được hiển thị ra file Excel
     * @param parent Component cha để hiển thị dialog
     * @param visibleComponent Component hiện tại đang được hiển thị
     * @param tbPhongchieu Bảng chứa dữ liệu phòng chiếu (view thường)
     * @param tbXemtong Bảng chứa dữ liệu tổng hợp phòng chiếu
     * @param viewComponent Component View để so sánh với visibleComponent
     * @param xemtongComponent Component Xemtong để so sánh với visibleComponent
     */
    public void exportToExcel(Component parent, Component visibleComponent, 
                             JTable tbPhongchieu, JTable tbXemtong,
                             Component viewComponent, Component xemtongComponent) {
        try {
            // Create a new workbook
            Workbook workbook = new XSSFWorkbook();
            
            // Determine which table is currently visible
            JTable activeTable;
            String sheetName;
            String[] columns;
            
            // Check which panel is currently visible
            if (viewComponent.equals(visibleComponent)) {
                activeTable = tbPhongchieu;
                sheetName = "Danh Sách Phòng Chiếu";
                columns = new String[]{"Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé"};
            } else if (xemtongComponent.equals(visibleComponent)) {
                activeTable = tbXemtong;
                sheetName = "Tổng Hợp Phòng Chiếu";
                columns = new String[]{"Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé", "Trạng thái"};
            } else {
                // Default to tbPhongchieu if neither view is visible (shouldn't happen in normal operation)
                activeTable = tbPhongchieu;
                sheetName = "Danh Sách Phòng Chiếu";
                columns = new String[]{"Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé"};
            }
            
            // Create sheet with appropriate name
            Sheet sheet = workbook.createSheet(sheetName);
            
            // Create header row
            Row headerRow = sheet.createRow(0);
            
            // Create a cell style for the header
            CellStyle headerStyle = workbook.createCellStyle();
            org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerStyle.setFont(headerFont);
            
            // Create header cells
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }
            
            // Get data from the active table model
            DefaultTableModel model = (DefaultTableModel) activeTable.getModel();
            int rowCount = model.getRowCount();
            int colCount = Math.min(model.getColumnCount(), columns.length);
            
            // Create data rows
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < colCount; j++) {
                    Object value = model.getValueAt(i, j);
                    Cell cell = row.createCell(j);
                    if (value != null) {
                        cell.setCellValue(value.toString());
                    } else {
                        cell.setCellValue("");
                    }
                }
            }
            
            // Resize all columns to fit the content size
            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }
            
            // Ask user where to save the file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Lưu file Excel");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));
            
            // Set default filename based on the active table
            String defaultFileName = (activeTable == tbPhongchieu) ? "DanhSachPhongChieu.xlsx" : "TongHopPhongChieu.xlsx";
            fileChooser.setSelectedFile(new File(defaultFileName));
            
            int result = fileChooser.showSaveDialog(parent);
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                
                // Add .xlsx extension if not present
                if (!filePath.endsWith(".xlsx")) {
                    filePath += ".xlsx";
                    selectedFile = new File(filePath);
                }
                
                // Write the workbook to the file
                try (FileOutputStream outputStream = new FileOutputStream(selectedFile)) {
                    workbook.write(outputStream);
                    JOptionPane.showMessageDialog(parent, 
                        "Xuất file thành công!\nĐường dẫn: " + filePath, 
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            // Close the workbook
            workbook.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent, 
                "Lỗi khi xuất file: " + e.getMessage(), 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parent, 
                "Lỗi không xác định: " + e.getMessage(), 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}