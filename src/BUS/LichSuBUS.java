/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;


import DAO.LichSuDAO;
import DTO.LichSuDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class LichSuBUS {
    private LichSuDAO lichSuDAO;
 public ArrayList<LichSuDTO> danhSachLichSu;
    public LichSuBUS() {
        lichSuDAO = new LichSuDAO();
    }

//    public boolean themLichSu(LichSuDTO lichSu) throws SQLException {
//        return lichSuDAO.Them(lichSu);
//    }
    public boolean themLichSu(LichSuDTO lichSu) {
        try {
            return lichSuDAO.Them(lichSu);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<LichSuDTO> getDanhSachLichSu() {
        return danhSachLichSu;
    }
}

