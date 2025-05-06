package DAO;
import DTO.PhongChieuDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PhongChieuDAO {
    
    // Phương thức lấy tất cả dữ liệu phòng chiếu
    public List<PhongChieuDTO> getAllPhongChieu() {
        List<PhongChieuDTO> danhSachPhongChieu = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "SELECT ma_phong_chieu, suc_chua, loai_chieu, gia_ve, trang_thai FROM PhongChieu";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PhongChieuDTO phongChieu = new PhongChieuDTO();
                phongChieu.setMaPhongChieu(rs.getString("ma_phong_chieu"));
                phongChieu.setSucChua(rs.getInt("suc_chua"));
                phongChieu.setLoaiChieu(rs.getString("loai_chieu"));
                phongChieu.setGiaVe(rs.getInt("gia_ve"));
                phongChieu.setTrangThai(rs.getString("trang_thai"));
                
                danhSachPhongChieu.add(phongChieu);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy dữ liệu từ bảng PhongChieu:");
            e.printStackTrace();
        } finally {
            // Đóng tất cả các tài nguyên
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return danhSachPhongChieu;
    }
    
    public List<String> getAllLoaiChieu() {
        List<String> danhSachLoaiChieu = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            // Lấy các loại chiếu riêng biệt từ cơ sở dữ liệu
            String sql = "SELECT DISTINCT loai_chieu FROM PhongChieu ORDER BY loai_chieu";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                String loaiChieu = rs.getString("loai_chieu");
                if (loaiChieu != null && !loaiChieu.trim().isEmpty()) {
                    danhSachLoaiChieu.add(loaiChieu);
                }
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách loại chiếu:");
            e.printStackTrace();
        } finally {
            // Đóng tất cả các tài nguyên
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return danhSachLoaiChieu;
    }
    
    public boolean updateTrangThaiToNgungHoatDong(String maPhongChieu) {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean success = false;
        
        try {
            conn = DatabaseConnection.getConnection();
            // Sử dụng setString thay vì setNString cho MySQL
            String sql = "UPDATE PhongChieu SET trang_thai = ? WHERE ma_phong_chieu = ?";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, "Ngừng hoạt động");
            stmt.setString(2, maPhongChieu);
            
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật trạng thái phòng chiếu:");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return success;
    }

    // Phương thức tìm kiếm phòng chiếu theo mã
    public List<PhongChieuDTO> findByMaPhong(String maPhong) {
        List<PhongChieuDTO> ketQua = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "SELECT ma_phong_chieu, suc_chua, loai_chieu, gia_ve, trang_thai FROM PhongChieu WHERE ma_phong_chieu LIKE ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + maPhong + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                PhongChieuDTO phongChieu = new PhongChieuDTO();
                phongChieu.setMaPhongChieu(rs.getString("ma_phong_chieu"));
                phongChieu.setSucChua(rs.getInt("suc_chua"));
                phongChieu.setLoaiChieu(rs.getString("loai_chieu"));
                phongChieu.setGiaVe(rs.getInt("gia_ve"));
                phongChieu.setTrangThai(rs.getString("trang_thai"));
                
                ketQua.add(phongChieu);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm phòng chiếu:");
            e.printStackTrace();
        } finally {
            // Đóng tất cả các tài nguyên
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return ketQua;
    }
    
    public boolean updatePhongChieu(String maPhongChieu, int sucChua, String loaiChieu, int giaVe) {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean success = false;
        
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "UPDATE PhongChieu SET suc_chua = ?, loai_chieu = ?, gia_ve = ? WHERE ma_phong_chieu = ?";
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, sucChua);
            stmt.setString(2, loaiChieu); // Đã thay đổi setNString thành setString
            stmt.setInt(3, giaVe);
            stmt.setString(4, maPhongChieu);
            
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật thông tin phòng chiếu:");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return success;
    }
    
    public String getMaxMaPhongChieu() {
        String maxMaPhong = "PC000"; // Giá trị mặc định
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            // Thay đổi từ "SELECT TOP 1" sang "SELECT ... LIMIT 1" cho MySQL
            String sql = "SELECT ma_phong_chieu FROM PhongChieu ORDER BY ma_phong_chieu DESC LIMIT 1";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                maxMaPhong = rs.getString("ma_phong_chieu");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy mã phòng chiếu lớn nhất:");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return maxMaPhong;
    }
    
    // Phương thức tạo mã phòng chiếu mới
    public String generateNewMaPhongChieu() {
        String maxMaPhong = getMaxMaPhongChieu();
        
        // Tách phần số từ mã
        String prefix = "PC";
        String numberPart = maxMaPhong.substring(2); // Lấy phần số sau "PC"
        
        // Tăng số lên 1
        int number = Integer.parseInt(numberPart);
        number++;
        
        // Tạo mã mới với định dạng PCxxx
        String newNumber = String.format("%03d", number); // Đảm bảo có 3 chữ số
        return prefix + newNumber;
    }
    
    // Phương thức thêm phòng chiếu mới
    public boolean addPhongChieu(PhongChieuDTO phongChieu) {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean success = false;
        
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO PhongChieu (ma_phong_chieu, suc_chua, loai_chieu, gia_ve, trang_thai) VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, phongChieu.getMaPhongChieu());
            stmt.setInt(2, phongChieu.getSucChua());
            stmt.setString(3, phongChieu.getLoaiChieu());
            stmt.setInt(4, phongChieu.getGiaVe());
            stmt.setString(5, phongChieu.getTrangThai());
            
            int rowsAffected = stmt.executeUpdate();
            success = (rowsAffected > 0);
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm phòng chiếu:");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return success;
    }
}