package DAO;

import DTO.PhimDTO;
import java.sql.*;
import java.util.*;
import java.text.*;

public class PhimDAO {
    private Connection conn;

    public PhimDAO() {
        conn = DatabaseConnection.getConnection();
    }

 public List<PhimDTO> layDanhSachPhim() {
    List<PhimDTO> dsPhim = new ArrayList<>();
    String sql = "SELECT ma_phim, ten_phim, thoi_luong, the_loai, do_tuoi, ngay_chieu, suat_da_chieu, trang_thai, poster FROM Phim";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        while (rs.next()) {
            // Lấy ngày từ ResultSet
            java.util.Date sqlDate = rs.getDate("ngay_chieu");
            java.util.Date utilDate = null;
            if (sqlDate != null) {
                utilDate = new java.util.Date(sqlDate.getTime());
            }
            PhimDTO p = new PhimDTO(
                rs.getString("ma_phim"),
                rs.getString("ten_phim"),
                rs.getInt("thoi_luong"),
                rs.getString("the_loai"),
                rs.getString("do_tuoi"),
                utilDate,
                rs.getInt("suat_da_chieu"),
                rs.getString("trang_thai"),
                rs.getBytes("poster")
            );
            dsPhim.add(p);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return dsPhim;
}
   

   
   public List<PhimDTO> getAllPhim() {
        List<PhimDTO> listPhim = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "SELECT ma_phim, ten_phim, thoi_luong, the_loai, do_tuoi, ngay_chieu, suat_da_chieu, trang_thai, poster FROM Phim";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                String maPhim = rs.getString("ma_phim");
                String tenPhim = rs.getString("ten_phim");
                int thoiLuong = rs.getInt("thoi_luong");
                String theLoai = rs.getString("the_loai");
                String doTuoi = rs.getString("do_tuoi");
                java.util.Date ngayChieu = rs.getDate("ngay_chieu");
                int suatDaChieu = rs.getInt("suat_da_chieu");
                String trangThai = rs.getString("trang_thai");
                byte[] poster = rs.getBytes("poster");
                
                PhimDTO phim = new PhimDTO(maPhim, tenPhim, thoiLuong, theLoai, doTuoi, 
                                          ngayChieu, suatDaChieu, trangThai, poster);
                listPhim.add(phim);
            }
        } catch (SQLException e) {
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
        
        return listPhim;
    }
   
   public boolean capNhatTrangThaiPhim(String maPhim, String trangThai) {
    String sql = "UPDATE Phim SET trang_thai = ? WHERE ma_phim = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, trangThai);
        stmt.setString(2, maPhim);
        int rowsAffected = stmt.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   
      public String taoMaPhimMoi() {
        String maPhimMoi = "P001"; // Mã mặc định nếu không có dữ liệu
        
        String sql = "SELECT TOP 1 ma_phim FROM Phim ORDER BY ma_phim DESC";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            if (rs.next()) {
                String maPhimHienTai = rs.getString("ma_phim");
                // Trích xuất phần số từ mã phim (P001 -> 001)
                String soHienTai = maPhimHienTai.substring(1);
                // Chuyển sang số nguyên và tăng lên 1
                int soMoi = Integer.parseInt(soHienTai) + 1;
                // Định dạng lại thành chuỗi 3 ký tự với số 0 đứng trước nếu cần
                maPhimMoi = "P" + String.format("%03d", soMoi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return maPhimMoi;
    }
    

    public boolean themPhim(PhimDTO phim) {
        String sql = "INSERT INTO Phim (ma_phim, ten_phim, thoi_luong, the_loai, do_tuoi, ngay_chieu, suat_da_chieu, trang_thai, poster) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phim.getMaPhim());
            pstmt.setString(2, phim.getTenPhim());
            pstmt.setInt(3, phim.getThoiLuong());
            pstmt.setString(4, phim.getTheLoai());
            pstmt.setString(5, phim.getDoTuoi());
            
            // Xử lý ngày chiếu
            if (phim.getNgayChieu() != null) {
                pstmt.setDate(6, new java.sql.Date(phim.getNgayChieu().getTime()));
            } else {
                pstmt.setNull(6, java.sql.Types.DATE);
            }
            
            pstmt.setInt(7, 0); // suat_da_chieu mặc định là 0
            pstmt.setString(8, phim.getTrangThai());
            
            // Xử lý poster nếu có
            if (phim.getPoster() != null) {
                pstmt.setBytes(9, phim.getPoster());
            } else {
                pstmt.setNull(9, java.sql.Types.VARBINARY);
            }
            
            int ketQua = pstmt.executeUpdate();
            return ketQua > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean xoaPhim(String maPhim) {
        String sql = "DELETE FROM Phim WHERE ma_phim = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, maPhim);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean capNhatPhim(PhimDTO p) {
        String sql = "UPDATE Phim SET ten_phim = ?, thoi_luong = ?, the_loai = ?, do_tuoi = ?, ngay_chieu = ? WHERE ma_phim = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getTenPhim());
            ps.setInt(2, p.getThoiLuong());
            ps.setString(3, p.getTheLoai());
            ps.setString(4, p.getDoTuoi());
            ps.setDate(5, new java.sql.Date(p.getNgayChieu().getTime()));
            ps.setString(6, p.getMaPhim());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}