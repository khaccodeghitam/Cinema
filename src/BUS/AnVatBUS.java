
package BUS;

import DAO.AnVatDAO;
import DTO.AnVatDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class AnVatBUS {
    public ArrayList<AnVatDTO> danhSachAnVat;
    private AnVatDAO anVatDAO;
    public AnVatBUS() {
    anVatDAO = new AnVatDAO();
    danhSachAnVat = anVatDAO.getAllAnVatDTO(); // Lấy toàn bộ nhân viên từ CSDL
}
    public boolean kiemTraMaTonTai(String maAnVat) {
    for (AnVatDTO nv : danhSachAnVat) {
        if (nv.getMaAnVat().equalsIgnoreCase(maAnVat)) {
            return true; 
        }
    }
    return false; 
}
public boolean themAnVat(AnVatDTO nv) {
    if (kiemTraMaTonTai(nv.getMaAnVat())) {
        System.out.println("Mã nhân viên đã tồn tại!");
        return false;
    }

    try {
        if (anVatDAO.Them(nv)) {
            danhSachAnVat.add(nv);// them nv vao cuoi danhSachAnVat
            return true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
public boolean suaAnVat(AnVatDTO nv){
    // goi xuong DAO de sua trong sql
    if(anVatDAO.Sua(nv)){
        for(int i=0; i<danhSachAnVat.size();i++){
            // neu nv minh nhap vao no equals voi getMaAnVat thi set thanh nv minh sua
            // get(i) la truy xuat phan tu thu i trong danh sach
            if (danhSachAnVat.get(i).getMaAnVat().equals(nv.getMaAnVat())) {
                danhSachAnVat.set(i, nv);
                return true;
        }
        
    }
}
  return false;  
}
public boolean xoaAnVat(String maAnVat) {
    if (anVatDAO.Xoa(maAnVat)) {
        for (AnVatDTO nv : danhSachAnVat) {
            if (nv.getMaAnVat().equals(maAnVat)) {
                nv.setTrangThai(0); // Chuyển trạng thái về 0 (đã nghỉ việc)
                return true;
            }
        }
    }
    return false;
}
//Hàm getDanhSachAnVat() giúp bạn truy cập dữ liệu từ tầng BUS, để có thể hiển thị, tìm kiếm, hoặc thao tác trong tầng giao diện (UI).
public ArrayList<AnVatDTO> getDanhSachAnVat() {
    return danhSachAnVat;
}
public ArrayList<AnVatDTO> timKiemTheoTuKhoa(String tuKhoa) {
    ArrayList<AnVatDTO> ketQua = new ArrayList<>();
    for (AnVatDTO av : danhSachAnVat) {
        if (av.getMaAnVat().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            av.getTenAnVat().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            String.valueOf(av.getSoLuongHienTai()).contains(tuKhoa) ||
            String.valueOf(av.getTrangThai()).contains(tuKhoa)) {
            ketQua.add(av);
        }
    }
    return ketQua;
}
public ArrayList<AnVatDTO> timKiemTheoTuKhoa1(String tuKhoa) {
    ArrayList<AnVatDTO> ketQua = new ArrayList<>();
    
    String tuKhoaLower = tuKhoa.toLowerCase();

    for (AnVatDTO av : danhSachAnVat) {
        boolean match = false;

        if (av.getMaAnVat().toLowerCase().contains(tuKhoaLower) ||
            av.getTenAnVat().toLowerCase().contains(tuKhoaLower) ||
            String.valueOf(av.getSoLuongHienTai()).contains(tuKhoa) ||
            String.valueOf(av.getTrangThai()).contains(tuKhoa)) {
            match = true;
        }

      
         if (String.valueOf(av.getTrangThai()).equals(tuKhoa)) match = true;

        
        if (match) {
            ketQua.add(av);
        }
    }
    return ketQua;
}

public ArrayList<AnVatDTO> timKiemAnVat(String maAnVat, String tenAnVat, String soLuongStr) {
    ArrayList<AnVatDTO> ketQua = new ArrayList<>();
    ArrayList<AnVatDTO> danhSach = this.danhSachAnVat;  // Giả sử danh sách ăn vặt đã có sẵn trong bus

    for (AnVatDTO av : danhSach) {
        boolean match = true;

        if (!maAnVat.isEmpty() && !av.getMaAnVat().toLowerCase().contains(maAnVat.toLowerCase())) {
            match = false;
        }
        if (!tenAnVat.isEmpty() && !av.getTenAnVat().toLowerCase().contains(tenAnVat.toLowerCase())) {
            match = false;
        }
        if (!soLuongStr.isEmpty()) {
            try {
                int soLuong = Integer.parseInt(soLuongStr);
                if (av.getSoLuongHienTai() != soLuong) {
                    match = false;
                }
            } catch (NumberFormatException e) {
                // Bỏ qua nếu không thể chuyển đổi thành số
            }
        }

        if (match) {
            ketQua.add(av);
        }
    }

    return ketQua;
}
public ArrayList<AnVatDTO> timKiemAnVat1(String maAnVat, String tenAnVat, String soLuongStr, String trangThaiStr) {
    ArrayList<AnVatDTO> ketQua = new ArrayList<>();

    // Kiểm tra danh sách các món ăn vặt
    for (AnVatDTO av : danhSachAnVat) {
        boolean match = true;

        // Kiểm tra mã ăn vặt
        if (!maAnVat.isEmpty() && !av.getMaAnVat().toLowerCase().contains(maAnVat.toLowerCase())) {
            match = false;
        }

        // Kiểm tra tên ăn vặt
        if (!tenAnVat.isEmpty() && !av.getTenAnVat().toLowerCase().contains(tenAnVat.toLowerCase())) {
            match = false;
        }

        // Kiểm tra số lượng
        if (!soLuongStr.isEmpty()) {
            try {
                int soLuong = Integer.parseInt(soLuongStr);
                if (av.getSoLuongHienTai() != soLuong) {
                    match = false;
                }
            } catch (NumberFormatException e) {
                // Nếu không thể chuyển đổi thành số, không làm gì (hoặc thông báo lỗi)
            }
        }

        // Kiểm tra trạng thái
        if (!trangThaiStr.isEmpty()) {
            try {
                int trangThai = Integer.parseInt(trangThaiStr);
                if (av.getTrangThai() != trangThai) {
                    match = false;
                }
            } catch (NumberFormatException e) {
             
            }
        }

        // Nếu tất cả các điều kiện đều khớp, thêm món ăn vặt vào kết quả
        if (match) {
            ketQua.add(av);
        }
    }

    return ketQua;
}
public void xuatExcel(String filePath) {
    try {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("AnVat");

        // Tạo dòng tiêu đề
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Mã ăn vặt");
        headerRow.createCell(1).setCellValue("Tên ăn vặt");
        headerRow.createCell(2).setCellValue("Số lượng hiện tại");
        headerRow.createCell(3).setCellValue("Tổng số lượng");
        headerRow.createCell(4).setCellValue("Trạng thái");
        headerRow.createCell(5).setCellValue("Số lượng thêm");

        int rowNum = 1;

        // Duyệt qua danh sách AnVatDTO và xuất dữ liệu vào các dòng trong sheet
        for (AnVatDTO anVat : danhSachAnVat) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(anVat.getMaAnVat());
            row.createCell(1).setCellValue(anVat.getTenAnVat());
            row.createCell(2).setCellValue(anVat.getSoLuongHienTai());
            row.createCell(3).setCellValue(anVat.getTongSoLuong());
            row.createCell(4).setCellValue(anVat.getTrangThai());
            row.createCell(5).setCellValue(anVat.getSoLuongThem());
        }

        // Ghi vào file
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void nhapExcel(String filePath) throws SQLException {
    try {
        // Mở file Excel
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // Đọc sheet đầu tiên

        danhSachAnVat.clear(); // Xóa dữ liệu cũ trong danh sách

        // Duyệt qua các dòng trong sheet, bắt đầu từ dòng thứ 2 (dòng đầu là tiêu đề)
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Bỏ qua dòng tiêu đề

            AnVatDTO anVat = new AnVatDTO();

            // Đọc và set giá trị từ các cột trong dòng
            anVat.setMaAnVat(row.getCell(0).getStringCellValue()); // Mã ăn vặt
            anVat.setTenAnVat(row.getCell(1).getStringCellValue()); // Tên ăn vặt
            anVat.setSoLuongHienTai((int) row.getCell(2).getNumericCellValue()); // Số lượng hiện tại
            anVat.setTongSoLuong((int) row.getCell(3).getNumericCellValue()); // Tổng số lượng
            anVat.setTrangThai((int) row.getCell(4).getNumericCellValue()); // Trạng thái
            anVat.setSoLuongThem((int) row.getCell(5).getNumericCellValue()); // Số lượng thêm

            // Thêm đối tượng ăn vặt vào danh sách
            danhSachAnVat.add(anVat);

            // Lưu vào cơ sở dữ liệu (nếu có)
            anVatDAO.Them(anVat);
        }

        // Đóng workbook và file input stream
        workbook.close();
        fis.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
