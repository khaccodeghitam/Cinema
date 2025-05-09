
package DAO;

import DTO.NhanVienDTO;
import java.sql.*;
import java.util.ArrayList;

public class NhanVienDAO {

    // Lấy danh sách nhân viên từ CSDL
    public ArrayList<NhanVienDTO> getAllNhanVienDTO() {
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO(
                    rs.getString("ma_nhan_vien"),
                    rs.getString("ten_nhan_vien"),
                    rs.getInt("tuoi"),
                    rs.getString("gioi_tinh"),
                    rs.getDate("ngay_vao_cnmm"),
                    rs.getDate("ngay_nghi_viec"),
                    rs.getInt("trang_thai"),
                    rs.getDate("ngay_sinh"),
                    rs.getString("so_dien_thoai"),
                    rs.getString("email")
                );
                list.add(nv);
            }

            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Thêm nhân viên
    public boolean Them(NhanVienDTO nv) throws SQLException {
        boolean result = false;
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();

            String ngayVao = (nv.getNgayVaoCnmm() != null) ? "'" + new java.sql.Date(nv.getNgayVaoCnmm().getTime()) + "'" : "null";
            String ngayNghi = (nv.getNgayNghiViec() != null) ? "'" + new java.sql.Date(nv.getNgayNghiViec().getTime()) + "'" : "null";
            String ngaySinh = (nv.getNgaySinh() != null) ? "'" + new java.sql.Date(nv.getNgaySinh().getTime()) + "'" : "null";

            String sql = String.format(
                "INSERT INTO NhanVien (ma_nhan_vien, ten_nhan_vien, tuoi, gioi_tinh, ngay_vao_cnmm, ngay_nghi_viec, trang_thai, ngay_sinh, so_dien_thoai, email) " +
                "VALUES ('%s', '%s', %d, '%s', %s, %s, %d, %s, '%s', '%s')",
                nv.getMaNhanVien(),
                nv.getTenNhanVien(),
                nv.getTuoi(),
                nv.getGioiTinh(),
                ngayVao,
                ngayNghi,
                nv.getTrangThai(),
                ngaySinh,
                nv.getSoDienThoai(),
                nv.getEmail()
            );

            int rowsAffected = st.executeUpdate(sql);
            result = rowsAffected > 0;

            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Sửa nhân viên
    public boolean Sua(NhanVienDTO nv) {
        boolean result = false;
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();

            String ngayVao = (nv.getNgayVaoCnmm() != null) ? "'" + new java.sql.Date(nv.getNgayVaoCnmm().getTime()) + "'" : "null";
            String ngayNghi = (nv.getNgayNghiViec() != null) ? "'" + new java.sql.Date(nv.getNgayNghiViec().getTime()) + "'" : "null";
            String ngaySinh = (nv.getNgaySinh() != null) ? "'" + new java.sql.Date(nv.getNgaySinh().getTime()) + "'" : "null";

            String sql = String.format(
                "UPDATE NhanVien SET ten_nhan_vien = '%s', tuoi = %d, gioi_tinh = '%s', " +
                "ngay_vao_cnmm = %s, ngay_nghi_viec = %s, trang_thai = %d, " +
                "ngay_sinh = %s, so_dien_thoai = '%s', email = '%s' " +
                "WHERE ma_nhan_vien = '%s'",
                nv.getTenNhanVien(),
                nv.getTuoi(),
                nv.getGioiTinh(),
                ngayVao,
                ngayNghi,
                nv.getTrangThai(),
                ngaySinh,
                nv.getSoDienThoai(),
                nv.getEmail(),
                nv.getMaNhanVien()
            );

            int rowsAffected = st.executeUpdate(sql);
            result = rowsAffected > 0;

            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Xóa (cập nhật trạng thái về 0)
    public boolean Xoa(String maNhanVien) {
        boolean result = false;
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();

            String sql = String.format(
                "UPDATE NhanVien SET trang_thai = 0 WHERE ma_nhan_vien = '%s'",
                maNhanVien
            );

            int rowsAffected = st.executeUpdate(sql);
            result = rowsAffected > 0;

            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
