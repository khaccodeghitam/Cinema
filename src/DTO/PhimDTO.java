package DTO;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PhimDTO {
    private String maPhim;
    private String tenPhim;
    private int thoiLuong;
    private String theLoai;
    private String doTuoi;
    private Date ngayChieu;
     private int suatDaChieu;
    private String trangThai;
//    private byte[] poster;
    // Constructor
     public PhimDTO(String maPhim, String tenPhim, int thoiLuong, String theLoai, String doTuoi, Date ngayChieu) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
        this.doTuoi = doTuoi;
        this.ngayChieu = ngayChieu;
        this.suatDaChieu = 0;
    }

    public PhimDTO() {
    }
    
     public PhimDTO(String maPhim, String tenPhim, int thoiLuong, String theLoai, String doTuoi, 
                  Date ngayChieu, int suatDaChieu, String trangThai) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
        this.doTuoi = doTuoi;
        this.ngayChieu = ngayChieu;
        this.suatDaChieu = suatDaChieu;
        this.trangThai = trangThai;
//        this.poster = poster;
    }
    
    // Getters và Setters
    public String getMaPhim() {
        return maPhim;
    }
    
    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }
    
    public String getTenPhim() {
        return tenPhim;
    }
    
    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }
    
    public int getThoiLuong() {
        return thoiLuong;
    }
    
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    
    public String getTheLoai() {
        return theLoai;
    }
    
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
    public String getDoTuoi() {
        return doTuoi;
    }
    
    public void setDoTuoi(String doTuoi) {
        this.doTuoi = doTuoi;
    }
    
    public Date getNgayChieu() {
        return ngayChieu;
    }
    
    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    
    // Phương thức để lấy ngày dưới dạng chuỗi đã định dạng
    public String getNgayChieuFormatted() {
        if (ngayChieu == null) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(ngayChieu);
    }
    
        public int getSuatDaChieu() {
        return suatDaChieu;
    }
    
    public void setSuatDaChieu(int suatDaChieu) {
        this.suatDaChieu = suatDaChieu;
    }
    
    public String getTrangThai() {
        return trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
//    public byte[] getPoster() {
//        return poster;
//    }
//    
//    public void setPoster(byte[] poster) {
//        this.poster = poster;
//    }

    public boolean isActiveOrUpcoming() {
    // Phim đang chiếu
    if (trangThai == null || trangThai.equals("Đang chiếu")) {
        return true;
    }
    
    // Phim sắp chiếu (ngày chiếu > ngày hiện tại)
    java.util.Date currentDate = new java.util.Date();
    return ngayChieu != null && ngayChieu.after(currentDate);
}
    
}