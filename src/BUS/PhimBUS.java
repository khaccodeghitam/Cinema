package BUS;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import DAO.PhimDAO;
import DTO.PhimDTO;
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

public boolean nhapFileExcel(JComponent parentComponent) {
    try {
        // Hiển thị hộp thoại chọn file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn file Excel để nhập");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx", "xls"));
        
        int result = fileChooser.showOpenDialog(parentComponent);
        if (result != JFileChooser.APPROVE_OPTION) {
            return false; // Người dùng đã hủy
        }
        
        // Lấy file đã chọn
        File selectedFile = fileChooser.getSelectedFile();
        
        // Đọc workbook từ file
        Workbook workbook;
        try (FileInputStream fis = new FileInputStream(selectedFile)) {
            if (selectedFile.getName().endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fis);
            } else if (selectedFile.getName().endsWith(".xls")) {
                workbook = new HSSFWorkbook(fis);
            } else {
                JOptionPane.showMessageDialog(parentComponent, 
                    "Định dạng file không hỗ trợ. Vui lòng chọn file Excel (.xlsx hoặc .xls)", 
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        // Lấy sheet đầu tiên
        Sheet sheet = workbook.getSheetAt(0);
        if (sheet == null) {
            JOptionPane.showMessageDialog(parentComponent, 
                "Không tìm thấy dữ liệu trong file Excel", 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            workbook.close();
            return false;
        }
        
        // Xác định loại dữ liệu từ tên sheet hoặc header
        String sheetName = sheet.getSheetName();
        boolean isPhimTable = sheetName.equals("Danh Sách Phim");
        
        // Đọc header để xác nhận cấu trúc
        Row headerRow = sheet.getRow(0);
        if (headerRow == null) {
            JOptionPane.showMessageDialog(parentComponent, 
                "Không tìm thấy dòng tiêu đề trong file Excel", 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            workbook.close();
            return false;
        }
        
        // Xác định số cột dữ liệu
        int colCount = headerRow.getLastCellNum();
        if ((isPhimTable && colCount < 6) || (!isPhimTable && colCount < 8)) {
            JOptionPane.showMessageDialog(parentComponent, 
                "Cấu trúc file không hợp lệ. Thiếu cột dữ liệu.", 
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            workbook.close();
            return false;
        }
        
        // Đọc dữ liệu từ các dòng
        int totalRows = 0;
        int successRows = 0;
        
        // Bắt đầu từ dòng 1 (sau header)
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;
            
            totalRows++;
            
            try {
                // Đọc dữ liệu từ các ô
                String maPhim = getCellValueAsString(row.getCell(0));
                String tenPhim = getCellValueAsString(row.getCell(1));
                
                // Xử lý thời lượng - trích xuất số phút từ chuỗi
                String thoiLuongStr = getCellValueAsString(row.getCell(2));
                int thoiLuong = extractMinutes(thoiLuongStr);
                
                String theLoai = getCellValueAsString(row.getCell(3));
                String doTuoi = getCellValueAsString(row.getCell(4));
                
                // Xử lý ngày chiếu
                Date ngayChieu = null;
                Cell ngayChieuCell = row.getCell(5);
                if (ngayChieuCell != null) {
                    if (ngayChieuCell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(ngayChieuCell)) {
                        ngayChieu = ngayChieuCell.getDateCellValue();
                    } else {
                        // Cố gắng parse từ chuỗi nếu không phải định dạng ngày
                        String ngayChieuStr = getCellValueAsString(ngayChieuCell);
                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            ngayChieu = sdf.parse(ngayChieuStr);
                        } catch (ParseException e) {
                            throw new Exception("Định dạng ngày không hợp lệ: " + ngayChieuStr);
                        }
                    }
                }
                
                // Xử lý dữ liệu riêng cho bảng tổng hợp
                int suatDaChieu = 0;
                String trangThai = "Đang chiếu"; // Giá trị mặc định
                
                if (!isPhimTable && colCount >= 8) {
                    // Đọc suất đã chiếu
                    Cell suatCell = row.getCell(6);
                    if (suatCell != null) {
                        if (suatCell.getCellType() == CellType.NUMERIC) {
                            suatDaChieu = (int) suatCell.getNumericCellValue();
                        } else {
                            String suatStr = getCellValueAsString(suatCell);
                            try {
                                suatDaChieu = Integer.parseInt(suatStr);
                            } catch (NumberFormatException e) {
                                // Giữ giá trị mặc định nếu không thể chuyển đổi
                            }
                        }
                    }
                    
                    // Đọc trạng thái
                    trangThai = getCellValueAsString(row.getCell(7));
                }
                
                // Kiểm tra dữ liệu hợp lệ
                if (maPhim.isEmpty() || tenPhim.isEmpty() || thoiLuong <= 0 || 
                    theLoai.isEmpty() || doTuoi.isEmpty() || ngayChieu == null) {
                    throw new Exception("Dữ liệu không đầy đủ hoặc không hợp lệ");
                }
                
                // Tạo đối tượng PhimDTO từ dữ liệu đã đọc
                PhimDTO phim = new PhimDTO(maPhim, tenPhim, thoiLuong, theLoai, doTuoi, ngayChieu, suatDaChieu, trangThai);
                
                // Cập nhật vào cơ sở dữ liệu
                PhimDAO phimDAO = new PhimDAO();
                boolean success;
                
                // Kiểm tra xem mã phim đã tồn tại chưa để quyết định thêm mới hay cập nhật
                if (phimDAO.kiemTraTonTaiPhim(maPhim)) {
                    // Cập nhật phim hiện có
                    success = phimDAO.capNhatPhimDayDu(phim);
                } else {
                    // Thêm phim mới
                    success = phimDAO.themPhim(phim);
                }
                
                if (success) {
                    successRows++;
                }
                
            } catch (Exception e) {
                System.err.println("Lỗi ở dòng " + (i+1) + ": " + e.getMessage());
                // Tiếp tục với dòng tiếp theo
            }
        }
        
        // Đóng workbook sau khi hoàn thành
        workbook.close();
        
        // Hiển thị thông báo kết quả
        String message = "Đã nhập " + successRows + "/" + totalRows + " dòng dữ liệu thành công.";
        if (successRows > 0) {
            JOptionPane.showMessageDialog(parentComponent, 
                message, "Thành công", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(parentComponent, 
                message + "\nKhông có dữ liệu nào được cập nhật.", 
                "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(parentComponent, 
            "Lỗi khi đọc file: " + e.getMessage(), 
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return false;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(parentComponent, 
            "Lỗi không xác định: " + e.getMessage(), 
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return false;
    }
}

/**
 * Trích xuất giá trị chuỗi từ ô trong Excel, xử lý các trường hợp khác nhau của kiểu ô
 */
private String getCellValueAsString(Cell cell) {
    if (cell == null) return "";
    
    switch (cell.getCellType()) {
        case NUMERIC:
            if (DateUtil.isCellDateFormatted(cell)) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                return sdf.format(cell.getDateCellValue());
            } else {
                // Tránh hiển thị dạng khoa học (.0) cho số nguyên
                double value = cell.getNumericCellValue();
                if (value == (long) value) {
                    return String.format("%d", (long) value);
                } else {
                    return String.valueOf(value);
                }
            }
        case BOOLEAN:
            return String.valueOf(cell.getBooleanCellValue());
        case FORMULA:
            try {
                return String.valueOf(cell.getStringCellValue());
            } catch (Exception e) {
                try {
                    return String.valueOf(cell.getNumericCellValue());
                } catch (Exception e2) {
                    return cell.getCellFormula();
                }
            }
        default:
            return cell.toString().trim();
    }
}

/**
 * Trích xuất số phút từ chuỗi thời lượng (ví dụ: "120 phút" -> 120)
 */
private int extractMinutes(String thoiLuongStr) {
    if (thoiLuongStr == null || thoiLuongStr.isEmpty()) {
        return 0;
    }
    
    // Loại bỏ ký tự không phải số
    String numericStr = thoiLuongStr.replaceAll("[^0-9]", "");
    
    if (numericStr.isEmpty()) {
        return 0;
    }
    
    try {
        return Integer.parseInt(numericStr);
    } catch (NumberFormatException e) {
        return 0;
    }
}
    
}