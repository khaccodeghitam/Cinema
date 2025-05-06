/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.UuDaiDAO;
import DTO.UuDaiDTO;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import DAO.LichChieuDAO;
import DTO.LichChieuDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author ADMIN
 */
public class UuDaiBUS {
    static public ArrayList<UuDaiDTO> dsud;
    static public ArrayList<UuDaiDTO> dsudDD;
    public UuDaiBUS() {
    }
    public void docdsud(){
        UuDaiDAO db=new UuDaiDAO();
        if(dsud==null){
            dsud=new ArrayList<UuDaiDTO>();
        }
        dsud=db.docList();
    }
    
    public void docdsudDD(){
        UuDaiDAO db=new UuDaiDAO();
        if(dsudDD==null){
            dsudDD=new ArrayList<UuDaiDTO>();
        }
        dsudDD=db.docListDayDu();
    }
    public void themdsud(UuDaiDTO ud){
        dsud.add(ud);
        UuDaiDAO db=new UuDaiDAO();
        db.themud(ud);
    }
    public void updatedsud(UuDaiDTO ud){
        for(int i=0;i<dsud.size();i++){
            if(dsud.get(i).getMaUuDai().equals(ud.getMaUuDai())){
                dsud.set(i, ud);
                UuDaiDAO db=new UuDaiDAO();
                db.updateud(ud);
            }
        }
    }
    public void xoaUuDai(String maUuDai) {
        UuDaiDAO dao = new UuDaiDAO();
        dao.xoaUuDai(maUuDai);

        // Cập nhật lại danh sách trong bộ nhớ nếu cần
        if (dsud != null) {
            for (UuDaiDTO ud : dsud) {
                if (ud.maUuDai.equals(maUuDai)) {
                    ud.trangThai = 1;
                    break;
                }
            }
        }
    }
    public ArrayList<UuDaiDTO> timKiem(String keyword) {
        ArrayList<UuDaiDTO> kq = new ArrayList<>();
        for (UuDaiDTO ud : dsud) {
            if (ud.getMaUuDai().toLowerCase().contains(keyword.toLowerCase()) ||
                ud.getTenUuDai().toLowerCase().contains(keyword.toLowerCase())) {
                kq.add(ud);
            }
        }
        return kq;
    }
    
    public ArrayList<UuDaiDTO> timKiemDD(String keyword) {
        ArrayList<UuDaiDTO> kq = new ArrayList<>();
        for (UuDaiDTO ud : dsudDD) {
            if (ud.getMaUuDai().toLowerCase().contains(keyword.toLowerCase()) ||
                ud.getTenUuDai().toLowerCase().contains(keyword.toLowerCase())) {
                kq.add(ud);
            }
        }
        return kq;
    }
    
    public ArrayList<UuDaiDTO> locUD(int n1,int n2){
        ArrayList<UuDaiDTO> kq=new ArrayList<>();
        for(UuDaiDTO ud : dsud){
           if(ud.getPhanTramGiam()>=n1 && ud.getPhanTramGiam()<=n2){
               kq.add(ud);
           } 
        }
        return kq;
    }
    
    public static void importExcel(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                
                if (row != null) {
                    String maUuDai = row.getCell(0).getStringCellValue();
                    String tenUuDai = row.getCell(1).getStringCellValue();
                    int phanTramGiam = (int) row.getCell(2).getNumericCellValue();
                    
                    // Đọc ngày từ Excel và chuyển đổi thành Date
                    Date ngayBatDau = row.getCell(3).getDateCellValue();
                    Date ngayKetThuc = row.getCell(4).getDateCellValue();
                    
                    String dieuKien = row.getCell(5).getStringCellValue();
                    int trangThai = (int) row.getCell(6).getNumericCellValue();

                    UuDaiDTO uuDai = new UuDaiDTO(maUuDai, tenUuDai, phanTramGiam, ngayBatDau, ngayKetThuc, dieuKien, trangThai);
                    
                    if (dsud == null) {
                        dsud = new ArrayList<>();
                    }
                    dsud.add(uuDai);
                }
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void exportExcel(String filePath) {
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("UuDai");

            // Tạo tiêu đề cột
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Mã Ưu Đãi");
            headerRow.createCell(1).setCellValue("Tên Ưu Đãi");
            headerRow.createCell(2).setCellValue("Phần Trăm Giảm");
            headerRow.createCell(3).setCellValue("Ngày Bắt Đầu");
            headerRow.createCell(4).setCellValue("Ngày Kết Thúc");
            headerRow.createCell(5).setCellValue("Điều Kiện");
            headerRow.createCell(6).setCellValue("Trạng Thái");

            // Định dạng ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            int rowNum = 1;
            for (UuDaiDTO ud : dsud) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(ud.getMaUuDai());
                row.createCell(1).setCellValue(ud.getTenUuDai());
                row.createCell(2).setCellValue(ud.getPhanTramGiam());

                // Chuyển đổi Date thành String và ghi vào Excel
                String ngayBatDau = dateFormat.format(ud.getNgayBatDau());
                String ngayKetThuc = dateFormat.format(ud.getNgayKetThuc());

                row.createCell(3).setCellValue(ngayBatDau);
                row.createCell(4).setCellValue(ngayKetThuc);

                row.createCell(5).setCellValue(ud.getDieuKien());
                row.createCell(6).setCellValue(ud.getTrangThai());
            }

            FileOutputStream fileOut = new FileOutputStream(new File(filePath));
            workbook.write(fileOut);

            fileOut.close();
            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
