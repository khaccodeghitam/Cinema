package DTO;

import java.util.Date;

public class HopDongDTO {
    private String maHopDong;
    private String tenPhim;
    private int giaThau;
    private Date ngayKi;
    private int soSuatChieu;
    private int suatDaChieu;
    private String maNhaPhanPhoi;
    private String nguoiKi;
    private int thoiLuong; // Thêm vào để lưu thời lượng từ bảng Phim

    public HopDongDTO() {
    }

    public HopDongDTO(String maHopDong, String tenPhim, int giaThau, Date ngayKi, int soSuatChieu, 
                     int suatDaChieu, String maNhaPhanPhoi, String nguoiKi) {
        this.maHopDong = maHopDong;
        this.tenPhim = tenPhim;
        this.giaThau = giaThau;
        this.ngayKi = ngayKi;
        this.soSuatChieu = soSuatChieu;
        this.suatDaChieu = suatDaChieu;
        this.maNhaPhanPhoi = maNhaPhanPhoi;
        this.nguoiKi = nguoiKi;
    }

    // Getter và Setter
    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getGiaThau() {
        return giaThau;
    }

    public void setGiaThau(int giaThau) {
        this.giaThau = giaThau;
    }

    public Date getNgayKi() {
        return ngayKi;
    }

    public void setNgayKi(Date ngayKi) {
        this.ngayKi = ngayKi;
    }

    public int getSoSuatChieu() {
        return soSuatChieu;
    }

    public void setSoSuatChieu(int soSuatChieu) {
        this.soSuatChieu = soSuatChieu;
    }

    public int getSuatDaChieu() {
        return suatDaChieu;
    }

    public void setSuatDaChieu(int suatDaChieu) {
        this.suatDaChieu = suatDaChieu;
    }

    public String getMaNhaPhanPhoi() {
        return maNhaPhanPhoi;
    }

    public void setMaNhaPhanPhoi(String maNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
    }

    public String getNguoiKi() {
        return nguoiKi;
    }

    public void setNguoiKi(String nguoiKi) {
        this.nguoiKi = nguoiKi;
    }
    
    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
}