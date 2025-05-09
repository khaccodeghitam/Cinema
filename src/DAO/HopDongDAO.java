package DAO;

import DTO.HopDongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HopDongDAO {
    
    // Phương thức lấy danh sách hợp đồng
    public List<HopDongDTO> layDanhSachHopDong() {
        List<HopDongDTO> danhSachHopDong = new ArrayList<>();
        String sql = "SELECT * FROM HopDong";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                HopDongDTO hopDong = new HopDongDTO();
                hopDong.setMaHopDong(rs.getString("ma_hop_dong"));
                hopDong.setTenPhim(rs.getString("ten_phim"));
                hopDong.setGiaThau(rs.getInt("gia_thau"));
                hopDong.setNgayKi(rs.getDate("ngay_ki"));
                hopDong.setSoSuatChieu(rs.getInt("so_suat_chieu"));
                hopDong.setSuatDaChieu(rs.getInt("suat_da_chieu"));
                hopDong.setMaNhaPhanPhoi(rs.getString("ma_nha_phan_phoi"));
                hopDong.setNguoiKi(rs.getString("nguoi_ki"));
                
                danhSachHopDong.add(hopDong);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách hợp đồng: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return danhSachHopDong;
    }
    
    // Phương thức lấy thông tin nhà phân phối
    public Map<String, String> layDanhSachNhaPhanPhoi() {
        Map<String, String> nhaPhanPhoiMap = new HashMap<>();
        String sql = "SELECT ma_nha_phan_phoi, ten_nha_phan_phoi FROM NhaPhanPhoi";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maNhaPhanPhoi = rs.getString("ma_nha_phan_phoi");
                String tenNhaPhanPhoi = rs.getString("ten_nha_phan_phoi");
                nhaPhanPhoiMap.put(maNhaPhanPhoi, tenNhaPhanPhoi);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách nhà phân phối: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nhaPhanPhoiMap;
    }
    
    // Phương thức lấy thông tin nhân viên
    public Map<String, String> layDanhSachNhanVien() {
        Map<String, String> nhanVienMap = new HashMap<>();
        String sql = "SELECT ma_nhan_vien, ten_nhan_vien FROM NhanVien";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String maNhanVien = rs.getString("ma_nhan_vien");
                String tenNhanVien = rs.getString("ten_nhan_vien");
                nhanVienMap.put(maNhanVien, tenNhanVien);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách nhân viên: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nhanVienMap;
    }
    
    // Phương thức lấy danh sách phim kèm thời lượng
    public Map<String, Integer> layThongTinThoiLuongPhim() {
        Map<String, Integer> phimThoiLuongMap = new HashMap<>();
        String sql = "SELECT ten_phim, thoi_luong FROM Phim";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String tenPhim = rs.getString("ten_phim");
                int thoiLuong = rs.getInt("thoi_luong");
                phimThoiLuongMap.put(tenPhim, thoiLuong);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy thông tin thời lượng phim: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return phimThoiLuongMap;
    }
    
    // Phương thức tìm kiếm hợp đồng theo tên phim
    public List<HopDongDTO> timKiemHopDongTheoTenPhim(String tenPhim) {
        List<HopDongDTO> ketQua = new ArrayList<>();
        String sql = "SELECT * FROM HopDong WHERE ten_phim LIKE ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + tenPhim + "%");
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                HopDongDTO hopDong = new HopDongDTO();
                hopDong.setMaHopDong(rs.getString("ma_hop_dong"));
                hopDong.setTenPhim(rs.getString("ten_phim"));
                hopDong.setGiaThau(rs.getInt("gia_thau"));
                hopDong.setNgayKi(rs.getDate("ngay_ki"));
                hopDong.setSoSuatChieu(rs.getInt("so_suat_chieu"));
                hopDong.setSuatDaChieu(rs.getInt("suat_da_chieu"));
                hopDong.setMaNhaPhanPhoi(rs.getString("ma_nha_phan_phoi"));
                hopDong.setNguoiKi(rs.getString("nguoi_ki"));
                
                ketQua.add(hopDong);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm hợp đồng: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return ketQua;
    }
    
    // Phương thức lấy danh sách tên phim từ HopDong
    public List<String> layDanhSachTenPhim() {
        List<String> danhSachTenPhim = new ArrayList<>();
        String sql = "SELECT ten_phim FROM HopDong";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String tenPhim = rs.getString("ten_phim");
                danhSachTenPhim.add(tenPhim);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy danh sách tên phim: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) DatabaseConnection.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return danhSachTenPhim;
    }
    
    public int laySuatDaChieuTheoTenPhim(String tenPhim) {
    String sql = "SELECT suat_da_chieu FROM HopDong WHERE ten_phim = ?";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    int suatDaChieu = 0; // Giá trị mặc định nếu không tìm thấy
    
    try {
        conn = DatabaseConnection.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, tenPhim);
        rs = pstmt.executeQuery();
        
        if (rs.next()) {
            suatDaChieu = rs.getInt("suat_da_chieu");
        }
    } catch (SQLException e) {
        System.out.println("Lỗi khi lấy số suất đã chiếu: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) DatabaseConnection.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    return suatDaChieu;
}
    
    }
