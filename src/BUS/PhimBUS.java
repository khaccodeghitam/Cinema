package BUS;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PhimBUS {
    
    /**
     * Xuất dữ liệu từ bảng được hiển thị ra file Excel
     * @param parentComponent Component cha để hiển thị dialog
     * @param table JTable chứa dữ liệu cần xuất
     * @param isPhimTable true nếu là bảng phim, false nếu là bảng tổng hợp
     */
    public void xuatFileExcel(JComponent parentComponent, JTable table, boolean isPhimTable) {
        try {
            // Create a new workbook
            Workbook workbook = new XSSFWorkbook();
            
            // Xác định tên sheet và các cột dựa vào loại bảng
            String sheetName;
            String[] columns;
            
            if (isPhimTable) {
                sheetName = "Danh Sách Phim";
                columns = new String[]{"Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày công chiếu"};
            } else {
                sheetName = "Tổng Hợp Phim";
                columns = new String[]{"Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày chiếu", "Suất đã chiếu", "Trạng thái"};
            }
            
            // Create sheet with appropriate name
            Sheet sheet = workbook.createSheet(sheetName);
            
            // Create header row
            Row headerRow = sheet.createRow(0);
            
            // Create a cell style for the header
            CellStyle headerStyle = workbook.createCellStyle();
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerStyle.setFont(headerFont);
            
            // Create header cells
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerStyle);
            }
            
            // Get data from the table model
            DefaultTableModel model = (DefaultTableModel) table.getModel();
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
            String defaultFileName = isPhimTable ? "DanhSachPhim.xlsx" : "TongHopPhim.xlsx";
            fileChooser.setSelectedFile(new File(defaultFileName));
            
            int result = fileChooser.showSaveDialog(parentComponent);
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
                    JOptionPane.showMessageDialog(parentComponent, 
                        "Xuất file thành công!\nĐường dẫn: " + filePath, 
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            // Close the workbook
            workbook.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parentComponent, 
                "Lỗi khi xuất file: " + e.getMessage(), 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, 
                "Lỗi không xác định: " + e.getMessage(), 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}