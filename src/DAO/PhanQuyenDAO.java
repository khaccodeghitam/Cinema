package DAO;

import DTO.PhanQuyenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class PhanQuyenDAO {
    private Connection conn = null;
    
    public PhanQuyenDAO() {
        // Constructor
    }
    
    // Phương thức lấy danh sách phân quyền
    public ArrayList<PhanQuyenDTO> getDanhSachPhanQuyen() {
        ArrayList<PhanQuyenDTO> danhSach = new ArrayList<>();
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT DISTINCT ma_phan_quyen, ten_phan_quyen FROM PhanQuyen";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maPhanQuyen = rs.getString("ma_phan_quyen");
                String tenPhanQuyen = rs.getString("ten_phan_quyen");
                
                // Tạo đối tượng PhanQuyenDTO (không cần thêm maChucNang vì chỉ lấy thông tin cơ bản)
                PhanQuyenDTO phanQuyen = new PhanQuyenDTO();
                phanQuyen.setMaPhanQuyen(maPhanQuyen);
                phanQuyen.setTenPhanQuyen(tenPhanQuyen);
                
                danhSach.add(phanQuyen);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy danh sách phân quyền: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return danhSach;
    }
    
    // Phương thức tạo mã phân quyền mới
    public String taoMaPhanQuyenMoi() {
        String maPhanQuyenMoi = "PQ1"; // Mã mặc định nếu chưa có phân quyền nào
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT MAX(CAST(SUBSTRING(ma_phan_quyen, 3) AS UNSIGNED)) AS max_id FROM PhanQuyen";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next() && rs.getString("max_id") != null) {
                int maxId = rs.getInt("max_id");
                maPhanQuyenMoi = "PQ" + (maxId + 1);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi tạo mã phân quyền mới: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return maPhanQuyenMoi;
    }
    
    // Phương thức thêm phân quyền mới với nhiều chức năng
    public boolean themPhanQuyen(String maPhanQuyen, String tenPhanQuyen, ArrayList<String> danhSachMaChucNang) {
        conn = DatabaseConnection.getConnection();
        boolean ketQua = true;
        
        try {
            conn.setAutoCommit(false); // Bắt đầu transaction
            
            String sql = "INSERT INTO PhanQuyen (ma_phan_quyen, ten_phan_quyen, ma_chuc_nang) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            // Thêm từng chức năng vào phân quyền
            for (String maChucNang : danhSachMaChucNang) {
                pstmt.setString(1, maPhanQuyen);
                pstmt.setString(2, tenPhanQuyen);
                pstmt.setString(3, maChucNang);
                
                pstmt.executeUpdate();
            }
            
            conn.commit(); // Hoàn tất transaction
            pstmt.close();
        } catch (SQLException e) {
            ketQua = false;
            try {
                if (conn != null) {
                    conn.rollback(); // Rollback nếu có lỗi
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Lỗi thêm phân quyền: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // Khôi phục auto commit
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DatabaseConnection.closeConnection(conn);
        }
        
        return ketQua;
    }
    
    // Phương thức kiểm tra xem tên phân quyền đã tồn tại chưa
    public boolean kiemTraTenPhanQuyen(String tenPhanQuyen) {
        boolean tonTai = false;
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT COUNT(*) FROM PhanQuyen WHERE ten_phan_quyen = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenPhanQuyen);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                tonTai = true;
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi kiểm tra tên phân quyền: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return tonTai;
    }
    
    // Phương thức lấy mã phân quyền từ tên phân quyền
    public String getMaPhanQuyenByTen(String tenPhanQuyen) {
        String maPhanQuyen = null;
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT DISTINCT ma_phan_quyen FROM PhanQuyen WHERE ten_phan_quyen = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenPhanQuyen);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                maPhanQuyen = rs.getString("ma_phan_quyen");
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy mã phân quyền: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return maPhanQuyen;
    }
    
    // Phương thức lấy danh sách tên chức năng từ mã phân quyền
    public ArrayList<String> getDanhSachTenChucNangByMaPhanQuyen(String maPhanQuyen) {
        ArrayList<String> danhSachTenChucNang = new ArrayList<>();
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT c.ten_chuc_nang FROM PhanQuyen p " +
                         "JOIN ChucNang c ON p.ma_chuc_nang = c.ma_chuc_nang " +
                         "WHERE p.ma_phan_quyen = ?";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, maPhanQuyen);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                danhSachTenChucNang.add(rs.getString("ten_chuc_nang"));
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy danh sách chức năng: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return danhSachTenChucNang;
    }
    
    // Phương thức lấy danh sách phân quyền với map tên -> mã phân quyền
    public Map<String, String> getMapTenMaPhanQuyen() {
        Map<String, String> mapTenMaPhanQuyen = new HashMap<>();
        conn = DatabaseConnection.getConnection();
        
        try {
            String sql = "SELECT DISTINCT ma_phan_quyen, ten_phan_quyen FROM PhanQuyen";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maPhanQuyen = rs.getString("ma_phan_quyen");
                String tenPhanQuyen = rs.getString("ten_phan_quyen");
                mapTenMaPhanQuyen.put(tenPhanQuyen, maPhanQuyen);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi lấy map tên-mã phân quyền: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(conn);
        }
        
        return mapTenMaPhanQuyen;
    }
    
    public String getTenPhanQuyenByMa(String maPhanQuyen) {
    String tenPhanQuyen = null;
    conn = DatabaseConnection.getConnection();
    
    try {
        String sql = "SELECT DISTINCT ten_phan_quyen FROM PhanQuyen WHERE ma_phan_quyen = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, maPhanQuyen);
        
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            tenPhanQuyen = rs.getString("ten_phan_quyen");
        }
        
        rs.close();
        pstmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Lỗi lấy tên phân quyền: " + e.getMessage());
        e.printStackTrace();
    } finally {
        DatabaseConnection.closeConnection(conn);
    }
    
    return tenPhanQuyen;
}
    
public boolean kiemTraPhanQuyenDangSuDung(String maPhanQuyen) {
    conn = DatabaseConnection.getConnection();
    boolean dangSuDung = false;
    
    try {
        String sql = "SELECT COUNT(*) FROM TaiKhoan WHERE ma_phan_quyen = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, maPhanQuyen);
        
        ResultSet rs = pstmt.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            dangSuDung = true;
        }
        
        rs.close();
        pstmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Lỗi kiểm tra phân quyền đang sử dụng: " + e.getMessage());
        e.printStackTrace();
    } finally {
        DatabaseConnection.closeConnection(conn);
    }
    
    return dangSuDung;
}

// Phương thức xóa phân quyền
public boolean xoaPhanQuyen(String maPhanQuyen) {
    conn = DatabaseConnection.getConnection();
    boolean ketQua = false;
    
    try {
        // Bắt đầu transaction
        conn.setAutoCommit(false);
        
        // Xóa tất cả các bản ghi trong bảng PhanQuyen với mã phân quyền tương ứng
        String sql = "DELETE FROM PhanQuyen WHERE ma_phan_quyen = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, maPhanQuyen);
        
        int rowsAffected = pstmt.executeUpdate();
        ketQua = (rowsAffected > 0);
        
        // Hoàn tất transaction
        conn.commit();
        pstmt.close();
    } catch (SQLException e) {
        // Rollback nếu có lỗi
        try {
            if (conn != null) {
                conn.rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null, "Lỗi xóa phân quyền: " + e.getMessage());
        e.printStackTrace();
        ketQua = false;
    } finally {
        try {
            if (conn != null) {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DatabaseConnection.closeConnection(conn);
    }
    
    return ketQua;
}

// Phương thức lấy danh sách chức năng của một phân quyền
public ArrayList<String> getChiTietPhanQuyen(String maPhanQuyen) {
    ArrayList<String> danhSachChucNang = new ArrayList<>();
    conn = DatabaseConnection.getConnection();
    
    try {
        String sql = "SELECT c.ma_chuc_nang, c.ten_chuc_nang FROM PhanQuyen p " +
                     "JOIN ChucNang c ON p.ma_chuc_nang = c.ma_chuc_nang " +
                     "WHERE p.ma_phan_quyen = ?";
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, maPhanQuyen);
        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String maChucNang = rs.getString("ma_chuc_nang");
            String tenChucNang = rs.getString("ten_chuc_nang");
            danhSachChucNang.add(maChucNang + " - " + tenChucNang);
        }
        
        rs.close();
        pstmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Lỗi lấy chi tiết phân quyền: " + e.getMessage());
        e.printStackTrace();
    } finally {
        DatabaseConnection.closeConnection(conn);
    }
    
    return danhSachChucNang;
}    
    
}
