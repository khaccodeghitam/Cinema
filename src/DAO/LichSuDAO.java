/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.LichSuDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LichSuDAO {

    // Lấy toàn bộ lịch sử
    public ArrayList<LichSuDTO> getAllLichSu() {
        ArrayList<LichSuDTO> list = new ArrayList<>();
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM lichsu"; 
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                LichSuDTO ls = new LichSuDTO(
                    rs.getString("maAnVat"),
                    rs.getString("tenAnVat"),
                    rs.getInt("soLuongThem"),
                    rs.getTimestamp("thoiGianThem") // dùng Timestamp cũng được vì nó kế thừa Date
                );
                list.add(ls);
            }
            JDBCutil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Thêm mới một lịch sử
    public boolean Them(LichSuDTO ls) throws SQLException {
        boolean result = false;
        try {
            Connection conn = JDBCutil.getConnection();
            Statement st = conn.createStatement();
            String sql = String.format(
                "INSERT INTO lichsu(maAnVat, tenAnVat, soLuongThem, thoiGianThem) " +
                "VALUES ('%s', '%s', %d, '%tF %<tT')",
                ls.getMaAnVat(),
                ls.getTenAnVat(),
                ls.getSoLuongThem(),
                ls.getThoiGianThem()
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