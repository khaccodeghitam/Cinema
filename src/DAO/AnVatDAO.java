
package DAO;

import DTO.AnVatDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

public class AnVatDAO {
     public ArrayList<AnVatDTO> getAllAnVatDTO() {
        ArrayList<AnVatDTO> list = new ArrayList<>();
        try {
            Connection conn = JDBCutil.getConnection();// kết nối sql
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM AnVat";// thực hiện lấy dữ liệu vào bảng
            ResultSet rs = st.executeQuery(sql);

         while (rs.next()) {
        AnVatDTO av = new AnVatDTO(
        rs.getString("ma_an_vat"),
        rs.getString("ten_an_vat"),
        rs.getInt("so_luong_hien_tai"),
        rs.getInt("tong_so_luong"),
        rs.getInt("trang_thai"),
        rs.getInt("so_luong_them")
              
    );
    list.add(av);
}
             JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
     // thêm nhân viên vào bảng
     public boolean Them(AnVatDTO av) throws SQLException{
         boolean result = false;
         try {
            Connection conn = JDBCutil.getConnection();// kết nối sql
            Statement st = conn.createStatement();// tạo statement
            String sql =String.format(
            "INSERT INTO AnVat(ma_an_vat,ten_an_vat,so_luong_hien_tai,tong_so_luong,trang_thai,so_luong_them)"+
              " VALUES ('%s', '%s', '%d', '%d', %d, %d)",
                    av.getMaAnVat(),
                    av.getTenAnVat(),
                    av.getSoLuongHienTai(),
                    av.getTongSoLuong(),
                    av.getTrangThai(),
                    av.getSoLuongThem()
            );
            int rowsAffected = st.executeUpdate(sql);
            result = rowsAffected > 0;

            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
          return result;
    }
     
     public boolean Sua(AnVatDTO av) {
    boolean result = false;
    try {
        Connection conn = JDBCutil.getConnection();
        String sql = "UPDATE AnVat SET ten_an_vat = ?, so_luong_hien_tai = ?, tong_so_luong = ?, trang_thai = ?, so_luong_them = ? WHERE ma_an_vat = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        // Gán giá trị cho các tham số trong câu lệnh SQL
        ps.setString(1, av.getTenAnVat());          
        ps.setInt(2, av.getSoLuongHienTai());       
        ps.setInt(3, av.getTongSoLuong());          
        ps.setInt(4, av.getTrangThai());            
        ps.setInt(5, av.getSoLuongThem());          
        ps.setString(6, av.getMaAnVat());           
        
        // Thực thi câu lệnh cập nhật
        int rowsAffected = ps.executeUpdate();
        result = rowsAffected > 0;
        
        JDBCutil.closeConnection(conn);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return result;
}

     // xoa nhan vien
     public boolean Xoa(String maAnVat) {
    boolean result = false;
    try {
        Connection conn = JDBCutil.getConnection();
        Statement st = conn.createStatement();

        String sql = String.format(
            "UPDATE AnVat SET trang_thai = 0 WHERE ma_an_vat = '%s'",
            maAnVat
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


