/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UuDaiDTO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class UuDaiDAO {
    private ResultSet rs=null;
    private mySQLConnect db = new mySQLConnect();
    Statement st=null;
    Connection con=null;
    public ArrayList<UuDaiDTO> docList(){
        ArrayList<UuDaiDTO> udList=new ArrayList<>();
        try{
            String sql="SELECT * FROM uudai WHERE trang_thai=0";
            rs=db.executeQuery(sql);
            while(rs.next()){
                
                String ma=rs.getString("ma_uu_dai");
                String ten=rs.getString("ten_uu_dai");
                int ptg=rs.getInt("phan_tram_giam");
                Date nbd=rs.getDate("ngay_bat_dau");
                Date nkt=rs.getDate("ngay_ket_thuc");
                String dk=rs.getString("dieu_kien");
                int tt=rs.getInt("trang_thai");
                UuDaiDTO ud=new UuDaiDTO(ma,ten,ptg,nbd,nkt,dk,tt);
                udList.add(ud);
            }
            rs.close();
            db.disConnect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return udList;
    }
    
    public ArrayList<UuDaiDTO> docListDayDu(){
        ArrayList<UuDaiDTO> udList=new ArrayList<>();
        try{
            String sql="SELECT * FROM uudai";
            rs=db.executeQuery(sql);
            while(rs.next()){
                
                String ma=rs.getString("ma_uu_dai");
                String ten=rs.getString("ten_uu_dai");
                int ptg=rs.getInt("phan_tram_giam");
                Date nbd=rs.getDate("ngay_bat_dau");
                Date nkt=rs.getDate("ngay_ket_thuc");
                String dk=rs.getString("dieu_kien");
                int tt=rs.getInt("trang_thai");
                UuDaiDTO ud=new UuDaiDTO(ma,ten,ptg,nbd,nkt,dk,tt);
                udList.add(ud);
            }
            rs.close();
            db.disConnect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return udList;
    }
    public void themud(UuDaiDTO ud){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String qry = "INSERT INTO uudai (ma_uu_dai, ten_uu_dai, phan_tram_giam, ngay_bat_dau, ngay_ket_thuc, dieu_kien, trang_thai) VALUES (";
        qry += "'" + ud.maUuDai + "',";
        qry += "'" + ud.tenUuDai + "',";
        qry += ud.phanTramGiam + ",";
        qry += "'" + sdf.format(ud.ngayBatDau) + "',";
        qry += "'" + sdf.format(ud.ngayKetThuc) + "',";
        qry += "'" + ud.dieuKien + "',";
        qry += "0)";
        db.executeUpdate(qry);
    }
    public void updateud(UuDaiDTO ud) {
    // Khởi tạo câu lệnh SQL
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String qry = "UPDATE uudai SET "
           + "ten_uu_dai = '" + ud.getTenUuDai() + "', "
           + "phan_tram_giam = " + ud.getPhanTramGiam() + ", "
           + "ngay_bat_dau = '" + sdf.format(ud.getNgayBatDau()) + "', "
           + "ngay_ket_thuc = '" + sdf.format(ud.getNgayKetThuc()) + "', "
           + "dieu_kien = '" + ud.getDieuKien() + "' "
           + "WHERE ma_uu_dai = '" + ud.getMaUuDai() + "';";


    // Thực hiện câu lệnh SQL
    db.executeUpdate(qry);
    }
    
    public void xoaUuDai(String maUuDai) {
    try {
        String qry = "UPDATE uudai SET trang_thai = 1 WHERE ma_uu_dai = '" + maUuDai + "'";
        db.executeUpdate(qry);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
