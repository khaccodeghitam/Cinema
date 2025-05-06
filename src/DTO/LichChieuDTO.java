
package DTO;


import java.util.Date;
import java.sql.Time;
/**
 *
 * @author ADMIN
 */
public class LichChieuDTO {
    public String ma_lich_chieu;
    
    public String ten_phim;
    public Date ngay_chieu;
    public Time gio_chieu;
    public String phong_chieu;
    public int tong_ve;
    public int ve_da_ban;
    public int ve_trong;
    public int trang_thai;

    public LichChieuDTO() {
    }
    
    
    
    public LichChieuDTO(String ma_lich_chieu, String ten_phim, Date ngay_chieu, Time gio_chieu, String phong_chieu, int tong_ve, int ve_da_ban, int ve_trong, int trang_thai) {
        this.ma_lich_chieu = ma_lich_chieu;
        this.ten_phim = ten_phim;
        this.ngay_chieu = ngay_chieu;
        this.gio_chieu = gio_chieu;
        this.phong_chieu = phong_chieu;
        this.tong_ve = tong_ve;
        this.ve_da_ban = ve_da_ban;
        this.ve_trong = ve_trong;
        this.trang_thai = trang_thai;
    }
    
    public LichChieuDTO(String ma_lich_chieu, String ten_phim, Date ngay_chieu, Time gio_chieu, String phong_chieu, int tong_ve, int ve_da_ban, int trang_thai) {
        this.ma_lich_chieu = ma_lich_chieu;
        this.ten_phim = ten_phim;
        this.ngay_chieu = ngay_chieu;
        this.gio_chieu = gio_chieu;
        this.phong_chieu = phong_chieu;
        this.tong_ve = tong_ve;
        this.ve_da_ban = ve_da_ban;
        this.trang_thai = trang_thai;
    }

    

    public int getVe_trong() {
        return ve_trong;
    }

    public void setVe_trong(int ve_trong) {
        this.ve_trong = ve_trong;
    }

    
    
    public String getMa_lich_chieu() {
        return ma_lich_chieu;
    }

    public void setMa_lich_chieu(String ma_lich_chieu) {
        this.ma_lich_chieu = ma_lich_chieu;
    }

    public String getTen_phim() {
        return ten_phim;
    }

    public void setTen_phim(String ten_phim) {
        this.ten_phim = ten_phim;
    }

    public Date getNgay_chieu() {
        return ngay_chieu;
    }

    public void setNgay_chieu(Date ngay_chieu) {
        this.ngay_chieu = ngay_chieu;
    }

    public Time getGio_chieu() {
        return gio_chieu;
    }

    public void setGio_chieu(Time gio_chieu) {
        this.gio_chieu = gio_chieu;
    }

    public String getPhong_chieu() {
        return phong_chieu;
    }

    public void setPhong_chieu(String phong_chieu) {
        this.phong_chieu = phong_chieu;
    }

    public int getTong_ve() {
        return tong_ve;
    }

    public void setTong_ve(int tong_ve) {
        this.tong_ve = tong_ve;
    }

    public int getVe_da_ban() {
        return ve_da_ban;
    }

    public void setVe_da_ban(int ve_da_ban) {
        this.ve_da_ban = ve_da_ban;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }
    
}
