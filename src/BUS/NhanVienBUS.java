
package BUS;
import DTO.NhanVienDTO;
import DAO.NhanVienDAO;
import java.io.File;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author TRUONG THI NGOC NHI
 */
public class NhanVienBUS {
    public ArrayList<NhanVienDTO> danhSachNhanVien;// tao ra danh sach nv co thuoc tinh 
    private NhanVienDAO nhanVienDAO;
    public NhanVienBUS() {
     nhanVienDAO = new NhanVienDAO();
    danhSachNhanVien = nhanVienDAO.getAllNhanVienDTO(); // Lấy toàn bộ nhân viên từ CSDL
}
    public boolean kiemTraMaTonTai(String maNhanVien) {
    for (NhanVienDTO nv : danhSachNhanVien) {
        if (nv.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
            return true; 
        }
    }
    return false; 
}
public boolean themNhanVien(NhanVienDTO nv) {
    if (kiemTraMaTonTai(nv.getMaNhanVien())) {
        System.out.println("Mã nhân viên đã tồn tại!");
        return false;
    }

    try {
        if (nhanVienDAO.Them(nv)) {
            danhSachNhanVien.add(nv);// them nv vao cuoi danhSachNhanVien
            return true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
public boolean suaNhanVien(NhanVienDTO nv){
    // goi xuong DAO de sua trong sql
    if(nhanVienDAO.Sua(nv)){
        for(int i=0; i<danhSachNhanVien.size();i++){
            // neu nv minh nhap vao no equals voi getMaNhanVien thi set thanh nv minh sua
            // get(i) la truy xuat phan tu thu i trong danh sach
            if (danhSachNhanVien.get(i).getMaNhanVien().equals(nv.getMaNhanVien())) {
                danhSachNhanVien.set(i, nv);
                return true;
        }
        
    }
}
  return false;  
}
public boolean xoaNhanVien(String maNhanVien) {
    if (nhanVienDAO.Xoa(maNhanVien)) {
        for (NhanVienDTO nv : danhSachNhanVien) {
            if (nv.getMaNhanVien().equals(maNhanVien)) {
                nv.setTrangThai(0);
                // Chuyển trạng thái về 0 (đã nghỉ việc)
                   nv.setNgayNghiViec(new java.util.Date());
                return true;
            }
        }
    }
    return false;
}

public ArrayList<NhanVienDTO> getDanhSachNhanVien() {
    return danhSachNhanVien;
}


public ArrayList<NhanVienDTO> timKiemNhanVien(String maNV, String tenNV, String tuoiStr, String gioiTinh) {
    ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
//    ArrayList<NhanVienDTO> danhSach = nhanVienDAO.getAllNhanVienDTO(); 
ArrayList<NhanVienDTO> danhSach = this.danhSachNhanVien;

    for (NhanVienDTO nv : danhSach) {
        boolean match = true;

        if (!maNV.isEmpty() && !nv.getMaNhanVien().toLowerCase().contains(maNV.toLowerCase())) {
            match = false;
        }
        if (!tenNV.isEmpty() && !nv.getTenNhanVien().toLowerCase().contains(tenNV.toLowerCase())) {
            match = false;
        }
        if (!tuoiStr.isEmpty()) {
            try {
                int tuoi = Integer.parseInt(tuoiStr);
                if (nv.getTuoi() != tuoi) {
                    match = false;
                }
            } catch (NumberFormatException e) {
         
            }
        }
        if (!gioiTinh.isEmpty() && !nv.getGioiTinh().equalsIgnoreCase(gioiTinh)) {
            match = false;
        }

        if (match) {
            ketQua.add(nv);
        }
    }

    return ketQua;
}
// tìm kiếm bên bảng xem
public ArrayList<NhanVienDTO> timKiemTheoTuKhoa(String tuKhoa) {
    ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
    for (NhanVienDTO nv : danhSachNhanVien) {
        if (nv.getMaNhanVien().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            nv.getTenNhanVien().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            nv.getGioiTinh().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            String.valueOf(nv.getTuoi()).contains(tuKhoa)) {
            ketQua.add(nv);
        }
    }
    return ketQua;
}
// de khi mình nhấp 2 cái hiện lên thông tiin nênn phải tìm mã trước
public NhanVienDTO timTheoMa(String maNV) {
    for (NhanVienDTO nv : getDanhSachNhanVien()) {
        if (nv.getMaNhanVien().equalsIgnoreCase(maNV)) {
            return nv;
        }
    }
    return null;
}
// tìm kiếm bên bảng xem tổng
public ArrayList<NhanVienDTO> timKiemNhanVien1(String maNV, String tenNV, String tuoiStr, String gioiTinh, String ngayVaoStr, String ngayNghiStr, String trangThaiStr) {
    ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày

    for (NhanVienDTO nv : danhSachNhanVien) {
        boolean match = true;

        if (!maNV.isEmpty() && !nv.getMaNhanVien().toLowerCase().contains(maNV.toLowerCase())) match = false;
        if (!tenNV.isEmpty() && !nv.getTenNhanVien().toLowerCase().contains(tenNV.toLowerCase())) match = false;
        if (!tuoiStr.isEmpty()) {
            try {
                int tuoi = Integer.parseInt(tuoiStr);
                if (nv.getTuoi() != tuoi) match = false;
            } catch (NumberFormatException e) {}
        }
        if (!gioiTinh.isEmpty() && !nv.getGioiTinh().equalsIgnoreCase(gioiTinh)) match = false;

        if (!ngayVaoStr.isEmpty()) {
            try {
                Date ngayVao = sdf.parse(ngayVaoStr);
                if (nv.getNgayVaoCnmm() == null || !sdf.format(nv.getNgayVaoCnmm()).equals(sdf.format(ngayVao))) match = false;
            } catch (ParseException e) {}
        }

        if (!ngayNghiStr.isEmpty()) {
            try {
                Date ngayNghi = sdf.parse(ngayNghiStr);
                if (nv.getNgayNghiViec() == null || !sdf.format(nv.getNgayNghiViec()).equals(sdf.format(ngayNghi))) match = false;
            } catch (ParseException e) {}
        }

        if (!trangThaiStr.isEmpty()) {
            try {
                int trangThai = Integer.parseInt(trangThaiStr);
                if (nv.getTrangThai() != trangThai) match = false;
            } catch (NumberFormatException e) {}
        }

        if (match) ketQua.add(nv);
    }

    return ketQua;
}
// tim kiem cua ben bảng xem tổng
public ArrayList<NhanVienDTO> timKiemTheoTuKhoa1(String tuKhoa) {
    ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
    for (NhanVienDTO nv : danhSachNhanVien) {
        boolean match = false;
        if (nv.getMaNhanVien().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            nv.getTenNhanVien().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            nv.getGioiTinh().toLowerCase().contains(tuKhoa.toLowerCase()) ||
            String.valueOf(nv.getTuoi()).contains(tuKhoa)) {
            match = true;
        }

        // Thêm tìm theo ngày (chuyển Date -> String để so sánh)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (nv.getNgayVaoCnmm() != null && sdf.format(nv.getNgayVaoCnmm()).contains(tuKhoa)) match = true;
        if (nv.getNgayNghiViec() != null && sdf.format(nv.getNgayNghiViec()).contains(tuKhoa)) match = true;

        // Thêm tìm theo trạng thái
        if (String.valueOf(nv.getTrangThai()).equals(tuKhoa)) match = true;

        if (match) ketQua.add(nv);
    }
    return ketQua;
}

public void xuatExcel(String filePath) {
    try {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("NhanVien");

        // Tạo dòng tiêu đề
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Mã nhân viên");
        headerRow.createCell(1).setCellValue("Tên nhân viên");
        headerRow.createCell(2).setCellValue("Tuổi");
        headerRow.createCell(3).setCellValue("Giới tính");
        headerRow.createCell(4).setCellValue("Ngày vào");
        headerRow.createCell(5).setCellValue("Ngày nghỉ");
        headerRow.createCell(6).setCellValue("Trạng thái");
        headerRow.createCell(7).setCellValue("Ngày sinh");
        headerRow.createCell(8).setCellValue("Số điện thoại");
        headerRow.createCell(9).setCellValue("Email");

        int rowNum = 1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (NhanVienDTO nv : danhSachNhanVien) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(nv.getMaNhanVien());
            row.createCell(1).setCellValue(nv.getTenNhanVien());
            row.createCell(2).setCellValue(nv.getTuoi());
            row.createCell(3).setCellValue(nv.getGioiTinh());

            // Ngày vào
            if (nv.getNgayVaoCnmm() != null) {
                row.createCell(4).setCellValue(sdf.format(nv.getNgayVaoCnmm()));
            } else {
                row.createCell(4).setCellValue("");
            }

            // Ngày nghỉ việc
            if (nv.getNgayNghiViec() != null) {
                row.createCell(5).setCellValue(sdf.format(nv.getNgayNghiViec()));
            } else {
                row.createCell(5).setCellValue("");
            }

            row.createCell(6).setCellValue(nv.getTrangThai());

            // Ngày sinh
            if (nv.getNgaySinh() != null) {
                row.createCell(7).setCellValue(sdf.format(nv.getNgaySinh()));
            } else {
                row.createCell(7).setCellValue("");
            }

            // Số điện thoại
            if (nv.getSoDienThoai() != null) {
                row.createCell(8).setCellValue(nv.getSoDienThoai());
            } else {
                row.createCell(8).setCellValue("");
            }

            // Email
            if (nv.getEmail() != null) {
                row.createCell(9).setCellValue(nv.getEmail());
            } else {
                row.createCell(9).setCellValue("");
            }
        }

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
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // đọc sheet đầu tiên

        danhSachNhanVien.clear();

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // bỏ dòng tiêu đề

            NhanVienDTO nv = new NhanVienDTO();
            nv.setMaNhanVien(row.getCell(0).getStringCellValue());
            nv.setTenNhanVien(row.getCell(1).getStringCellValue());
            nv.setTuoi((int) row.getCell(2).getNumericCellValue());
            nv.setGioiTinh(row.getCell(3).getStringCellValue());

            try {
                if (row.getCell(4) != null && row.getCell(4).getCellType() == CellType.NUMERIC) {
                    nv.setNgayVaoCnmm(row.getCell(4).getDateCellValue());
                }
            } catch (Exception e) {
                nv.setNgayVaoCnmm(null);
            }

            try {
                if (row.getCell(5) != null && row.getCell(5).getCellType() == CellType.NUMERIC) {
                    nv.setNgayNghiViec(row.getCell(5).getDateCellValue());
                }
            } catch (Exception e) {
                nv.setNgayNghiViec(null);
            }

            nv.setTrangThai((int) row.getCell(6).getNumericCellValue());

            try {
                if (row.getCell(7) != null && row.getCell(7).getCellType() == CellType.NUMERIC) {
                    nv.setNgaySinh(row.getCell(7).getDateCellValue());
                }
            } catch (Exception e) {
                nv.setNgaySinh(null);
            }

            if (row.getCell(8) != null) {
                nv.setSoDienThoai(row.getCell(8).getStringCellValue());
            }

            if (row.getCell(9) != null) {
                nv.setEmail(row.getCell(9).getStringCellValue());
            }

            danhSachNhanVien.add(nv);
            nhanVienDAO.Them(nv);
        }

        workbook.close();
        fis.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}

