package DTO;

public class TaiKhoanDTO {
    private String maTaiKhoan;
    private String tenDangNhap;
    private String matKhau;
    private String maPhanQuyen;
    private String maNhanVien;
    private String sdt;
    
    // Constructor đầy đủ
    public TaiKhoanDTO(String maTaiKhoan, String tenDangNhap, String matKhau, String maPhanQuyen, String maNhanVien, String sdt) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maPhanQuyen = maPhanQuyen;
        this.maNhanVien = maNhanVien;
        this.sdt = sdt;
    }
    
    // Constructor với maNhanVien (trường hợp tài khoản nhân viên)
    public TaiKhoanDTO(String maTaiKhoan, String tenDangNhap, String matKhau, String maPhanQuyen, String maNhanVien) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maPhanQuyen = maPhanQuyen;
        this.maNhanVien = maNhanVien;
        this.sdt = null;
    }
    
public boolean laNhanVien() {
    return maNhanVien != null && sdt == null;
}

public boolean laDocGia() {
    return sdt != null && maNhanVien == null;
}

    
    // Getters và Setters
    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }
    
    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }
    
    public String getTenDangNhap() {
        return tenDangNhap;
    }
    
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }
    
    public String getMatKhau() {
        return matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public String getMaPhanQuyen() {
        return maPhanQuyen;
    }
    
    public void setMaPhanQuyen(String maPhanQuyen) {
        this.maPhanQuyen = maPhanQuyen;
    }
    
    public String getMaNhanVien() {
        return maNhanVien;
    }
    
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
    public String getSdt() {
        return sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}