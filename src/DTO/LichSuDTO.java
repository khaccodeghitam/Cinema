
package DTO;

import java.util.Date;

public class LichSuDTO {
    private String maAnVat;
    private String tenAnVat;
    private int soLuongThem;
    private Date thoiGianThem; 

    // Constructor
    public LichSuDTO(String maAnVat, String tenAnVat, int soLuongThem, Date thoiGianThem) {
        this.maAnVat = maAnVat;
        this.tenAnVat = tenAnVat;
        this.soLuongThem = soLuongThem;
        this.thoiGianThem = thoiGianThem;
    }

    // Getters and Setters
    public String getMaAnVat() {
        return maAnVat;
    }

    public void setMaAnVat(String maAnVat) {
        this.maAnVat = maAnVat;
    }

    public String getTenAnVat() {
        return tenAnVat;
    }

    public void setTenAnVat(String tenAnVat) {
        this.tenAnVat = tenAnVat;
    }

    public int getSoLuongThem() {
        return soLuongThem;
    }

    public void setSoLuongThem(int soLuongThem) {
        this.soLuongThem = soLuongThem;
    }

    public Date getThoiGianThem() {
        return thoiGianThem;
    }

    public void setThoiGianThem(Date thoiGianThem) {
        this.thoiGianThem = thoiGianThem;
    }
}

