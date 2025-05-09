/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class PhanQuyenDTO {
    private String maPhanQuyen;
    private String tenPhanQuyen;
    private String maChucNang;

    public PhanQuyenDTO() {
    }

    public PhanQuyenDTO(String maPhanQuyen, String tenPhanQuyen, String maChucNang) {
        this.maPhanQuyen = maPhanQuyen;
        this.tenPhanQuyen = tenPhanQuyen;
        this.maChucNang = maChucNang;
    }

    public String getMaPhanQuyen() {
        return maPhanQuyen;
    }

    public void setMaPhanQuyen(String maPhanQuyen) {
        this.maPhanQuyen = maPhanQuyen;
    }

    public String getTenPhanQuyen() {
        return tenPhanQuyen;
    }

    public void setTenPhanQuyen(String tenPhanQuyen) {
        this.tenPhanQuyen = tenPhanQuyen;
    }

    public String getMaChucNang() {
        return maChucNang;
    }

    public void setMaChucNang(String maChucNang) {
        this.maChucNang = maChucNang;
    }
}