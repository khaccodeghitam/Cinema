/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.LichChieuDTO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
/**
 *
 * @author ADMIN
 */
public class LichChieuDAO {
    private ResultSet rs=null;
    private mySQLConnect db = new mySQLConnect();
    Statement st=null;
    Connection con=null;
    public ArrayList<LichChieuDTO> docList(){
        ArrayList<LichChieuDTO> lcList=new ArrayList<>();
        try{
            String sql="SELECT * FROM lichchieu WHERE trang_thai=0";
            rs=db.executeQuery(sql);
            while(rs.next()){
                
                String ma=rs.getString("ma_lich_chieu");
                String ten=rs.getString("ten_phim");
                Date nc=rs.getDate("ngay_chieu");
                Time gc=rs.getTime("gio_chieu");
                String phong_chieu=rs.getString("phong_chieu");
                int tong_ve=rs.getInt("tong_ve");
                int ve_da_ban=rs.getInt("ve_da_ban");
                int tt=rs.getInt("trang_thai");
                LichChieuDTO lc=new LichChieuDTO(ma,ten,nc,gc,phong_chieu,tong_ve,ve_da_ban,tt);
                lcList.add(lc);
            }
            rs.close();
            db.disConnect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lcList;
    }
    public ArrayList<LichChieuDTO> docListDD(){
        ArrayList<LichChieuDTO> lcList=new ArrayList<>();
        try{
            String sql="SELECT * FROM lichchieu";
            rs=db.executeQuery(sql);
            while(rs.next()){
                
                String ma=rs.getString("ma_lich_chieu");
                String ten=rs.getString("ten_phim");
                Date nc=rs.getDate("ngay_chieu");
                Time gc=rs.getTime("gio_chieu");
                String phong_chieu=rs.getString("phong_chieu");
                int tong_ve=rs.getInt("tong_ve");
                int ve_da_ban=rs.getInt("ve_da_ban");
                int tt=rs.getInt("trang_thai");
                LichChieuDTO lc=new LichChieuDTO(ma,ten,nc,gc,phong_chieu,tong_ve,ve_da_ban,tt);
                lcList.add(lc);
            }
            rs.close();
            db.disConnect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lcList;
    }
    
        public ArrayList<String> layDanhSachTenPhim() {
        ArrayList<String> ds = new ArrayList<>();
        try {
            String sql = "SELECT ten_phim FROM phim";
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                ds.add(rs.getString("ten_phim").trim());
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }
        
        public ArrayList<String> layDanhSachPhongPhim(){
            ArrayList<String> ds=new ArrayList<>();
            try{
                String sql="SELECT  ma_phong_chieu FROM phongchieu";
                ResultSet rs = db.executeQuery(sql);
                while (rs.next()) {
                    ds.add(rs.getString("ma_phong_chieu").trim());
                }
                rs.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
            return ds;
        }
    
    public String taoMaLichChieuMoi() {
        String maMoi = "LC001";
        try {
            String sql = "SELECT MAX(ma_lich_chieu) AS max_ma FROM lichchieu";
            ResultSet rs = db.executeQuery(sql);
            if (rs.next()) {
                String maCu = rs.getString("max_ma"); // VD: LC012
                if (maCu != null) {
                    int so = Integer.parseInt(maCu.substring(2));
                    maMoi = String.format("LC%03d", so + 1); // → LC013
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maMoi;
    }
    
    public void themLichChieu(LichChieuDTO lc) {
        try {
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");

            String qry = "INSERT INTO lichchieu (ma_lich_chieu, ten_phim, ngay_chieu, gio_chieu, phong_chieu, tong_ve, trang_thai) VALUES (";
            qry += "'" + lc.ma_lich_chieu + "',";
            qry += "'" + lc.ten_phim.replace("'", "''") + "',";
            qry += "'" + sdfDate.format(lc.ngay_chieu) + "',";
            qry += "'" + sdfTime.format(lc.gio_chieu) + "',";
            qry += "'" + lc.phong_chieu + "',";
            qry += lc.tong_ve + ",";
            qry += "0)";

            db.executeUpdate(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateLichChieu(LichChieuDTO lc) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

            String sql = "UPDATE lichchieu SET ";
            sql += "ten_phim = '" + lc.ten_phim + "', ";
            sql += "phong_chieu = '" + lc.phong_chieu + "', ";
            sql += "ngay_chieu = '" + sdf.format(lc.ngay_chieu) + "', ";
            sql += "gio_chieu = '" + timeFormat.format(lc.gio_chieu) + "' ";
            sql += "WHERE ma_lich_chieu = '" + lc.ma_lich_chieu + "'";

            db.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void xoaLichChieu(String maLichChieu) {
        try {
            String qry = "UPDATE lichchieu SET trang_thai = 1 WHERE ma_lich_chieu = '" + maLichChieu + "'";
            db.executeUpdate(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int laySucChua(String maphong){
        int sc=0;
        try{
            String sql="SELECT suc_chua FROM phongchieu WHERE ma_phong_chieu= '"+ maphong +"'";
            ResultSet rs = db.executeQuery(sql);
                while (rs.next()) {
                    sc = rs.getInt("suc_chua");
                }
                rs.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return sc;
    }
}
