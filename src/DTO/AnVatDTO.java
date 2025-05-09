
package DTO;


public class AnVatDTO {
    private String maAnVat;
    private String tenAnVat;
    private int soLuongHienTai;
    private int tongSoLuong;
    private int trangThai;
    private int soLuongThem;
  

    public AnVatDTO(String maAnVat, String tenAnVat, int soLuongHienTai, int tongSoLuong, int trangThai, int soLuongThem) {
        this.maAnVat = maAnVat;
        this.tenAnVat = tenAnVat;
        this.soLuongHienTai = soLuongHienTai;
        this.tongSoLuong = tongSoLuong;
         this.trangThai = trangThai;
        this.soLuongThem = soLuongThem;
       
    }

    public AnVatDTO() {
    }

    public String getMaAnVat() {
        return maAnVat;
    }

    public void setMaAnVat(String maAnVat) {
        this.maAnVat = maAnVat;
    }

    public void setTenAnVat(String tenAnVat) {
        this.tenAnVat = tenAnVat;
    }

    public void setSoLuongHienTai(int soLuongHienTai) {
        this.soLuongHienTai = soLuongHienTai;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public void setSoLuongThem(int soLuongThem) {
        this.soLuongThem = soLuongThem;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenAnVat() {
        return tenAnVat;
    }

    public int getSoLuongHienTai() {
        return soLuongHienTai;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }


    public int getSoLuongThem() {
        return soLuongThem;
    }

    public int getTrangThai() {
        return trangThai;
    }
    // Cập nhật tổng số lượng thêm cộng dồn
    public void themSoLuong(int soLuongThem) {
        this.soLuongThem += soLuongThem;
        this.tongSoLuong += soLuongThem; // Cộng dồn vào tổng số lượng
    }
    
}
