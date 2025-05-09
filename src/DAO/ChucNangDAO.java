package DAO;

import DTO.ChucNangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChucNangDAO {
    private Connection conn = null;
    
    public ChucNangDAO() {
        // Constructor
    }
    
    // Phương thức lấy danh sách chức năng
    public ArrayList<ChucNangDTO> getDanhSachChucNang() {
        ArrayList<ChucNangDTO> danhSach = new ArrayList<>();
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT * FROM ChucNang";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maChucNang = rs.getString("ma_chuc_nang");
                String tenChucNang = rs.getString("ten_chuc_nang");
                
                ChucNangDTO chucNang = new ChucNangDTO(maChucNang, tenChucNang);
                danhSach.add(chucNang);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy danh sách chức năng: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return danhSach;
    }
    
    // Phương thức lấy mã chức năng từ tên chức năng
    public String getMaChucNangByTen(String tenChucNang) {
        String maChucNang = null;
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT ma_chuc_nang FROM ChucNang WHERE ten_chuc_nang = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenChucNang);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                maChucNang = rs.getString("ma_chuc_nang");
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy mã chức năng: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return maChucNang;
    }
}
