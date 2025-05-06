/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

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
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ADMIN
 */
public class LichChieuBUS {
    static public ArrayList<LichChieuDTO> dslc;
    static public ArrayList<LichChieuDTO> dslcDD;

    public LichChieuBUS() {
        
    }
    
    public void docdslc(){
        LichChieuDAO db=new LichChieuDAO();
        if(dslc==null){
            dslc=new ArrayList<LichChieuDTO>();
        }
        dslc=db.docList();
    }
    
    public void docdslcDD(){
        LichChieuDAO db=new LichChieuDAO();
        if(dslcDD==null){
            dslcDD=new ArrayList<LichChieuDTO>();
        }
        dslcDD=db.docListDD();
    }
    
    public void themdsud(LichChieuDTO lc){
        if (dslc == null) {
            dslc = new ArrayList<>();
        }
        dslc.add(lc);
        LichChieuDAO db = new LichChieuDAO();
        db.themLichChieu(lc);
    }
    
    public void updatedsud(LichChieuDTO lc){
        if (dslc == null) {
            dslc = new ArrayList<>(); // Tránh NullPointerException nếu chưa khởi tạo
        }

        for (int i = 0; i < dslc.size(); i++) {
            if (dslc.get(i).getMa_lich_chieu().equals(lc.getMa_lich_chieu())) {
                dslc.set(i, lc);
                break; // Tìm thấy rồi thì không cần duyệt tiếp
            }
        }

        LichChieuDAO db = new LichChieuDAO();
        db.updateLichChieu(lc);
    }
    
    public void xoaLichChieu(String malichChieu) {
        LichChieuDAO dao = new LichChieuDAO();
        dao.xoaLichChieu(malichChieu);

        // Cập nhật lại danh sách trong bộ nhớ nếu cần
        if (dslc != null) {
            for (LichChieuDTO lc : dslc) {
                if (lc.ma_lich_chieu.equals(malichChieu)) {
                    lc.trang_thai = 1;
                    break;
                }
            }
        }
    }
    
     public ArrayList<LichChieuDTO> timKiem(String keyword) {
        ArrayList<LichChieuDTO>kq = new ArrayList<>();
        for (LichChieuDTO lc : dslc) {
            if (lc.getMa_lich_chieu().toLowerCase().contains(keyword.toLowerCase()) ||
                lc.getTen_phim().toLowerCase().contains(keyword.toLowerCase()) ||
                lc.getPhong_chieu().toLowerCase().contains(keyword.toLowerCase())    ) {
                kq.add(lc);
            }
        }
        return kq;
    }
     
     public ArrayList<LichChieuDTO> timKiemDD(String keyword) {
        ArrayList<LichChieuDTO>kq = new ArrayList<>();
        for (LichChieuDTO lc : dslcDD) {
            if (lc.getMa_lich_chieu().toLowerCase().contains(keyword.toLowerCase()) ||
                lc.getTen_phim().toLowerCase().contains(keyword.toLowerCase()) ||
                lc.getPhong_chieu().toLowerCase().contains(keyword.toLowerCase())    ) {
                kq.add(lc);
            }
        }
        return kq;
    }
     
     public static void docExcel(String filePath) {
    try {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        if (dslc == null) {
            dslc = new ArrayList<>();
        }

        LichChieuDAO dao = new LichChieuDAO(); // Tao DAO nè
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);

            if (row != null) {
                String maLichChieu = getStringCellValue(row.getCell(0), evaluator);
                String tenPhim = getStringCellValue(row.getCell(1), evaluator);
                Date ngayChieu = row.getCell(2) != null ? row.getCell(2).getDateCellValue() : null;
                Time gioChieu = row.getCell(3) != null ? new Time(row.getCell(3).getDateCellValue().getTime()) : null;
                String phongChieu = getStringCellValue(row.getCell(4), evaluator);
                int tongVe = (int) (row.getCell(5) != null ? row.getCell(5).getNumericCellValue() : 0);
                int veDaBan = (int) (row.getCell(6) != null ? row.getCell(6).getNumericCellValue() : 0);
                int trangThai = (int) (row.getCell(7) != null ? row.getCell(7).getNumericCellValue() : 0);

                LichChieuDTO lichChieu = new LichChieuDTO(maLichChieu, tenPhim, ngayChieu, gioChieu, phongChieu, tongVe, veDaBan, trangThai);

                dslc.add(lichChieu);   // Thêm vào danh sách trong RAM

                dao.themLichChieu(lichChieu);  // Đồng thời lưu vào database luôn
            }
        }

        workbook.close();
        fis.close();
        
        System.out.println("Đọc file excel và thêm vào database thành công !");
    } catch (IOException e) {
        e.printStackTrace();
    }


}
     public static void exportExcel(String filePath) {
    try {
        if (dslc == null || dslc.isEmpty()) {
            System.out.println("Danh sách lịch chiếu rỗng, không thể export.");
            return;
        }

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("LichChieu");

        // Tạo dòng tiêu đề
        Row header = sheet.createRow(0);
        String[] titles = {"Mã lịch chiếu", "Tên phim", "Ngày chiếu", "Giờ chiếu", "Phòng chiếu", "Tổng vé", "Vé đã bán", "Trạng thái"};

        for (int i = 0; i < titles.length; i++) {
            Cell cell = header.createCell(i);
            cell.setCellValue(titles[i]);
        }

        // Style cho ngày và giờ
        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd"));

        CellStyle timeCellStyle = workbook.createCellStyle();
        timeCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("HH:mm:ss"));

        // Đổ dữ liệu
        int rowNum = 1;
        for (LichChieuDTO lc : dslc) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(lc.getMa_lich_chieu());
            row.createCell(1).setCellValue(lc.getTen_phim());

            Cell cellNgayChieu = row.createCell(2);
            if (lc.getNgay_chieu() != null) {
                cellNgayChieu.setCellValue(lc.getNgay_chieu());
                cellNgayChieu.setCellStyle(dateCellStyle);
            }

            Cell cellGioChieu = row.createCell(3);
            if (lc.getGio_chieu() != null) {
                cellGioChieu.setCellValue(lc.getGio_chieu());
                cellGioChieu.setCellStyle(timeCellStyle);
            }

            row.createCell(4).setCellValue(lc.getPhong_chieu());
            row.createCell(5).setCellValue(lc.getTong_ve());
            row.createCell(6).setCellValue(lc.getVe_da_ban());
            row.createCell(7).setCellValue(lc.getTrang_thai());
        }

        // Ghi workbook ra file
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("Export Excel thành công: " + filePath);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


// Hàm hỗ trợ đọc String từ Cell, có thêm xử lý FORMULA
private static String getStringCellValue(Cell cell, FormulaEvaluator evaluator) {
    if (cell == null) {
        return "";
    }

    if (cell.getCellType() == CellType.FORMULA) {
        CellValue cellValue = evaluator.evaluate(cell);
        switch (cellValue.getCellType()) {
            case STRING:
                return cellValue.getStringValue();
            case NUMERIC:
                return String.valueOf(cellValue.getNumberValue());
            case BOOLEAN:
                return String.valueOf(cellValue.getBooleanValue());
            default:
                return "";
        }
    }

    switch (cell.getCellType()) {
        case STRING:
            return cell.getStringCellValue();
        case NUMERIC:
            return String.valueOf(cell.getNumericCellValue());
        case BOOLEAN:
            return String.valueOf(cell.getBooleanCellValue());
        case BLANK:
            return "";
        default:
            return "";
    }
}

    public int laySucChua(String maPhong) {
        LichChieuDAO dao = new LichChieuDAO();
        return dao.laySucChua(maPhong);
    }
    
}
