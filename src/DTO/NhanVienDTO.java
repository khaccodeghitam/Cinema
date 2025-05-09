package DTO;
//
//import java.util.Date;
//
///**
// *
// * @author TRUONG THI NGOC NHI
// */
//public class NhanVienDTO {
//    private String maNhanVien;
//    private String tenNhanVien;
//    private int tuoi;
//    private String gioiTinh;
//    private Date ngayVao;
//    private Date ngayNghi;
//    private int trangThai;
//
//    public NhanVienDTO() {}
//
//    public NhanVienDTO(String maNhanVien, String tenNhanVien, int tuoi,String gioiTinh,Date ngayVao,Date ngayNghi,int trangThai) {
//        this.maNhanVien = maNhanVien;
//        this.tenNhanVien = tenNhanVien;
//        this.tuoi = tuoi;
//        this.gioiTinh = gioiTinh;
//        this.ngayVao= ngayVao;
//        this.ngayNghi = ngayNghi;
//        this.trangThai=trangThai;
//    }
//
//    public String getMaNhanVien() {
//        return maNhanVien;
//    }
//
//    public void setMaNhanVien(String maNhanVien) {
//        this.maNhanVien = maNhanVien;
//    }
//
//    public String getTenNhanVien() {
//        return tenNhanVien;
//    }
//
//    public void setTenNhanVien(String tenNhanVien) {
//        this.tenNhanVien = tenNhanVien;
//    }
//
//    public int getTuoi() {
//        return tuoi;
//    }
//    
//    public void setTrangThai(int trangThai) {
//        this.trangThai = trangThai;
//    }
//    public int getTrangThai() {
//        return trangThai;
//    }
//
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//    public String getGioiTinh() {
//    return gioiTinh;
//}
//
//    public void setGioiTinh(String gioiTinh) {
//    this.gioiTinh = gioiTinh;
//}
//
//public Date getNgayVao() {
//    return ngayVao;
//}
//
//public void setNgayVao(Date ngayVao) {
//    this.ngayVao = ngayVao;
//}
//
//public Date getNgayNghi() {
//    return ngayNghi;
//}
//
//public void setNgayNghi(Date ngayNghi) {
//    this.ngayNghi = ngayNghi;
//}
//
//    @Override
//public String toString() {
//    return "Mã: " + maNhanVien
//         + ", Tên: " + tenNhanVien
//         + ", Tuổi: " + tuoi
//         + ", Giới tính: " + gioiTinh
//         + ", Ngày vào: " + ngayVao
//         + ", Ngày nghỉ: " + ngayNghi;
//}
//
//
//}
   import java.util.Date;

public class NhanVienDTO {
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoi;
    private String gioiTinh;
    private Date ngayVaoCnmm;
    private Date ngayNghiViec;
    private int trangThai;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;

    // Constructor đầy đủ
    public NhanVienDTO(String maNhanVien, String tenNhanVien, int tuoi, String gioiTinh,
                       Date ngayVaoCnmm, Date ngayNghiViec, int trangThai,
                       Date ngaySinh, String soDienThoai, String email) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.ngayVaoCnmm = ngayVaoCnmm;
        this.ngayNghiViec = ngayNghiViec;
        this.trangThai = trangThai;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }
  public NhanVienDTO() {}
    // Getter và Setter
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgayVaoCnmm() {
        return ngayVaoCnmm;
    }

    public void setNgayVaoCnmm(Date ngayVaoCnmm) {
        this.ngayVaoCnmm = ngayVaoCnmm;
    }

    public Date getNgayNghiViec() {
        return ngayNghiViec;
    }

    public void setNgayNghiViec(Date ngayNghiViec) {
        this.ngayNghiViec = ngayNghiViec;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


