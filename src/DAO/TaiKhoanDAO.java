package DAO;

import DTO.TaiKhoanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class TaiKhoanDAO {
    private Connection conn = null;
    
    public TaiKhoanDAO() {
        // Constructor
    }
    
    // Phương thức tạo mã tài khoản ngẫu nhiên (6 số, bắt đầu từ 100000)
    public String taoMaTaiKhoan() {
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000); // Số từ 100000 đến 999999
        return String.valueOf(randomNumber);
    }
    
    // Phương thức kiểm tra tên đăng nhập đã tồn tại hay chưa
    public boolean kiemTraTenDangNhap(String tenDangNhap) {
        conn = DatabaseConnection.getConnection();
        boolean tonTai = false;
        
        try {
            String sql = "SELECT * FROM TaiKhoan WHERE ten_dang_nhap = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenDangNhap);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                tonTai = true;
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi kiểm tra tên đăng nhập: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return tonTai;
    }
    
    public boolean themTaiKhoan(TaiKhoanDTO taiKhoan) {
        conn = DatabaseConnection.getConnection();
        boolean ketQua = false;
        
        try {
            String sql = "INSERT INTO TaiKhoan (ma_tai_khoan, ten_dang_nhap, mat_khau, ma_phan_quyen, ma_nhan_vien) " +
                       "VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, taiKhoan.getMaTaiKhoan());
            pstmt.setString(2, taiKhoan.getTenDangNhap());
            pstmt.setString(3, taiKhoan.getMatKhau()); // Mặc định sẽ là "123456789" theo cài đặt SQL
            
            // Xử lý trường ma_phan_quyen có thể null
            if (taiKhoan.getMaPhanQuyen() == null) {
                pstmt.setNull(4, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(4, taiKhoan.getMaPhanQuyen());
            }
            
            // Sử dụng trực tiếp maNhanVien là String
            pstmt.setString(5, taiKhoan.getMaNhanVien());
            
            int rowsAffected = pstmt.executeUpdate();
            ketQua = (rowsAffected > 0);
            
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm tài khoản: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return ketQua;
    }
    
    // Phương thức cập nhật tài khoản
    public boolean capNhatTaiKhoan(TaiKhoanDTO taiKhoan) {
        conn = DatabaseConnection.getConnection();
        boolean ketQua = false;
        
        try {
            String sql = "UPDATE TaiKhoan SET ten_dang_nhap = ?, ma_phan_quyen = ?, ma_nhan_vien = ? " +
                       "WHERE ma_tai_khoan = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, taiKhoan.getTenDangNhap());
            
            // Xử lý trường ma_phan_quyen có thể null
            if (taiKhoan.getMaPhanQuyen() == null) {
                pstmt.setNull(2, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(2, taiKhoan.getMaPhanQuyen());
            }
            
            pstmt.setString(3, taiKhoan.getMaNhanVien());
            pstmt.setString(4, taiKhoan.getMaTaiKhoan());
            
            int rowsAffected = pstmt.executeUpdate();
            ketQua = (rowsAffected > 0);
            
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật tài khoản: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return ketQua;
    }
    
    // Phương thức xóa tài khoản
    public boolean xoaTaiKhoan(String maTaiKhoan) {
        conn = DatabaseConnection.getConnection();
        boolean ketQua = false;
        
        try {
            String sql = "DELETE FROM TaiKhoan WHERE ma_tai_khoan = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, maTaiKhoan);
            
            int rowsAffected = pstmt.executeUpdate();
            ketQua = (rowsAffected > 0);
            
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa tài khoản: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return ketQua;
    }
    
    // Phương thức tìm tài khoản theo mã tài khoản
    public TaiKhoanDTO timTheoMa(String maTaiKhoan) {
        conn = DatabaseConnection.getConnection();
        TaiKhoanDTO taiKhoan = null;
        
        try {
            String sql = "SELECT * FROM TaiKhoan WHERE ma_tai_khoan = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, maTaiKhoan);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String maTK = rs.getString("ma_tai_khoan");
                String tenDangNhap = rs.getString("ten_dang_nhap");
                String matKhau = rs.getString("mat_khau");
                String maPhanQuyen = rs.getString("ma_phan_quyen");
                String maNhanVien = rs.getString("ma_nhan_vien");
                
                taiKhoan = new TaiKhoanDTO(maTK, tenDangNhap, matKhau, maPhanQuyen, maNhanVien);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi tìm tài khoản: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return taiKhoan;
    }
    
    // Phương thức lấy danh sách tài khoản
    public ArrayList<TaiKhoanDTO> getDanhSachTaiKhoan() {
        ArrayList<TaiKhoanDTO> danhSach = new ArrayList<>();
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT * FROM TaiKhoan";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maTaiKhoan = rs.getString("ma_tai_khoan");
                String tenDangNhap = rs.getString("ten_dang_nhap");
                String matKhau = rs.getString("mat_khau");
                String maPhanQuyen = rs.getString("ma_phan_quyen");
                String maNhanVien = rs.getString("ma_nhan_vien");
                
                TaiKhoanDTO taiKhoan = new TaiKhoanDTO(
                    maTaiKhoan, 
                    tenDangNhap, 
                    matKhau, 
                    maPhanQuyen, 
                    maNhanVien
                );
                danhSach.add(taiKhoan);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy danh sách tài khoản: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return danhSach;
    }
}
