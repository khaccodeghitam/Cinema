package DTO;

public class PhongChieuDTO {
    private String maPhongChieu;
    private int sucChua;
    private String loaiChieu;
    private int giaVe;
    private String trangThai;
    
    public PhongChieuDTO() {
    }
    
    public PhongChieuDTO(String maPhongChieu, int sucChua, String loaiChieu, int giaVe, String trangThai) {
        this.maPhongChieu = maPhongChieu;
        this.sucChua = sucChua;
        this.loaiChieu = loaiChieu;
        this.giaVe = giaVe;
        this.trangThai = trangThai;
    }
    
    // Getters and Setters
    public String getMaPhongChieu() {
        return maPhongChieu;
    }
    
    public void setMaPhongChieu(String maPhongChieu) {
        this.maPhongChieu = maPhongChieu;
    }
    
    public int getSucChua() {
        return sucChua;
    }
    
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }
    
    public String getLoaiChieu() {
        return loaiChieu;
    }
    
    public void setLoaiChieu(String loaiChieu) {
        this.loaiChieu = loaiChieu;
    }
    
    public int getGiaVe() {
        return giaVe;
    }
    
    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }
    
    public String getTrangThai() {
        return trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    @Override
    public String toString() {
        return "PhongChieuDTO{" + "maPhongChieu=" + maPhongChieu + ", sucChua=" + sucChua + 
               ", loaiChieu=" + loaiChieu + ", giaVe=" + giaVe + ", trangThai=" + trangThai + '}';
    }
}