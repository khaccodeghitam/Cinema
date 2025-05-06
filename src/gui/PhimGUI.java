package gui;

import DAO.PhimDAO;
import DAO.HopDongDAO;
import DTO.PhimDTO;
import log_reg.UI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.text.*;

public class PhimGUI extends javax.swing.JPanel {
private ImageHandler imageHandler;

    private JButton selectedButton = null;
    
    public PhimGUI() {
        initComponents();
        loadPhimToTable();
        
          loadDanhSachTenPhim();

        GiaodienPhim.setLayout(new CardLayout());
        GiaodienPhim.add(View, "View");
        GiaodienPhim.add(ThemPhim, "ThemPhim");
        GiaodienPhim.add(Xemtong, "Xemtong");
        cbDanhsachPhim.setMaximumRowCount(7);
        
 // Initialize the ImageHandler with the display panel
    imageHandler = new ImageHandler(disPoster);
    // Attach click listener to the addImg panel
    imageHandler.attachClickListener(addImg);
    
    addImg.setCursor(new Cursor(Cursor.HAND_CURSOR));
    addImg.setToolTipText("Nhấn để chọn ảnh");
    
    // Add a simple label to guide users
    JLabel addImgLabel = new JLabel("+ Chọn ảnh", SwingConstants.CENTER);
    addImgLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
    addImg.setLayout(new BorderLayout());
    addImg.add(addImgLabel, BorderLayout.CENTER);
        
        JTableHeader header = tbPhim.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
;
    UI.addPlaceHolderEffect(txtThoiluong, "Nhập thời lượng phim theo số phút");
    UI.addPlaceHolderEffect(txtTheloai, "Nhập thể loại phim");
    UI.addPlaceHolderEffect(txtTuoi, "Nhập độ tuổi cho phép xem");
//    UI.addPlaceHolderEffect(txtNgaychieu, "Theo định dạng dd/mm/yyyy");
   
  btnTimkiemTong.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        TimKiemTong(evt);
    }
});

  btnTimkiemPhim.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        TimKiemPhim(evt);
    }
});
  
  tbPhim.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbPhimMouseClicked(evt);
    }
});
  
  btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCapnhatActionPerformed(evt);
    }
});
  
btnXoa.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnXoaActionPerformed(evt);
    }
});
  
btnExport.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExportActionPerformed(evt);
    }
});

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Phim = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienPhim = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        TimkiemPhim = new javax.swing.JTextField();
        btnTimkiemPhim = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhim = new javax.swing.JTable();
        btnCapnhat = new javax.swing.JButton();
        txPhim = new javax.swing.JLabel();
        txThoiluong = new javax.swing.JLabel();
        txTuoi = new javax.swing.JLabel();
        txNgaychieu = new javax.swing.JLabel();
        txTheloai = new javax.swing.JLabel();
        truyxuatPhim = new javax.swing.JTextField();
        truyxuatThoiluong = new javax.swing.JTextField();
        truyxuatTuoi = new javax.swing.JTextField();
        truyxuatNgaychieu = new javax.swing.JTextField();
        truyxuatTheloai = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Xemtong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jSeparator2 = new javax.swing.JSeparator();
        ThemPhim = new javax.swing.JPanel();
        DsPhim = new javax.swing.JLabel();
        ThoiLuongPhim = new javax.swing.JLabel();
        TheloaiPhim = new javax.swing.JLabel();
        Dotuoi = new javax.swing.JLabel();
        Ngaychieu = new javax.swing.JLabel();
        btnThemPhim = new testlib.RoundedButton();
        btnHuybo = new testlib.RoundedButton();
        txtTuoi = new testlib.RoundedTextField();
        txtTheloai = new testlib.RoundedTextField();
        txtThoiluong = new testlib.RoundedTextField();
        cbDanhsachPhim = new javax.swing.JComboBox<>();
        themAnh = new javax.swing.JLabel();
        addImg = new my_component.RoundedPanel();
        disPoster = new javax.swing.JPanel();
        dtCongChieu = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();

        Phim.setBackground(new java.awt.Color(153, 153, 153));
        Phim.setPreferredSize(new java.awt.Dimension(1086, 633));

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
        btnView.setText("Xem");
        btnView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnView.setContentAreaFilled(false);
        btnView.setFocusPainted(false);
        btnView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnThem.setContentAreaFilled(false);
        btnThem.setFocusPainted(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemPhim(evt);
            }
        });

        btnXemtong.setBackground(new java.awt.Color(153, 153, 153));
        btnXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXemtong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view2.png"))); // NOI18N
        btnXemtong.setText("Xem tổng");
        btnXemtong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXemtong.setContentAreaFilled(false);
        btnXemtong.setFocusPainted(false);
        btnXemtong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemtong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXemtong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnXemtong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemPhim(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(153, 153, 153));
        btnExport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/export.png"))); // NOI18N
        btnExport.setText("Export");
        btnExport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExport.setContentAreaFilled(false);
        btnExport.setFocusPainted(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(153, 153, 153));
        btnImport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/import.png"))); // NOI18N
        btnImport.setText("Import");
        btnImport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImport.setContentAreaFilled(false);
        btnImport.setFocusPainted(false);
        btnImport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });

        GiaodienPhim.setBackground(new java.awt.Color(153, 153, 153));
        GiaodienPhim.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemPhim.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemPhim.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemPhim.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemPhim.setText(" Nhập tên phim.....");
        TimkiemPhim.setToolTipText("");
        TimkiemPhim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemPhim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemPhimNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemPhimLammo(evt);
            }
        });

        btnTimkiemPhim.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemPhim.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemPhim.setText("Tìm kiếm");
        btnTimkiemPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        tbPhim.setAutoCreateRowSorter(true);
        tbPhim.setBackground(new java.awt.Color(153, 153, 153));
        tbPhim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày công chiếu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhim.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbPhim.setInheritsPopupMenu(true);
        tbPhim.setRowHeight(30);
        tbPhim.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbPhim);

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txPhim.setText("Tên phim:");

        txThoiluong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txThoiluong.setText("Thời lượng:");

        txTuoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTuoi.setText("Độ tuổi: ");

        txNgaychieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNgaychieu.setText("Ngày chiếu:");

        txTheloai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTheloai.setText("Thể loại:");

        truyxuatPhim.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatPhim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatPhim.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatPhim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatThoiluong.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatThoiluong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatThoiluong.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatThoiluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatTuoi.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTuoi.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTuoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatNgaychieu.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatNgaychieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatNgaychieu.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatNgaychieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatTheloai.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTheloai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTheloai.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTheloai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_i.png"))); // NOI18N
        btnXoa.setText("Ngừng phim");
        btnXoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa.setContentAreaFilled(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(truyxuatTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(truyxuatThoiluong, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(truyxuatPhim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addComponent(txTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addComponent(txNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(truyxuatNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPhim)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(truyxuatPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTuoi)
                                .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong)
                            .addComponent(truyxuatThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgaychieu)
                            .addComponent(truyxuatNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTheloai)
                            .addComponent(truyxuatTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapnhat)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        GiaodienPhim.add(View, "View");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày chiếu", "Suất đã chiếu", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbXemtong.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbXemtong.setInheritsPopupMenu(true);
        tbXemtong.setRowHeight(30);
        tbXemtong.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbXemtong);

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập tên phim.....");
        txtTimkiemTong.setToolTipText("");
        txtTimkiemTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiemTong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemTongNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemTongLammo(evt);
            }
        });

        btnTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemTong.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemTong.setText("Tìm kiếm");
        btnTimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 565, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XemtongLayout.createSequentialGroup()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GiaodienPhim.add(Xemtong, "XemTong");

        ThemPhim.setBackground(new java.awt.Color(153, 153, 153));

        DsPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        DsPhim.setText("Danh sách phim: ");

        ThoiLuongPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ThoiLuongPhim.setText("Thời lượng");

        TheloaiPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TheloaiPhim.setText("Thể loại: ");

        Dotuoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dotuoi.setText("Độ tuổi:");

        Ngaychieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngaychieu.setText("Ngày công chiếu: ");

        btnThemPhim.setBackground(new java.awt.Color(204, 0, 0));
        btnThemPhim.setText("Thêm phim");
        btnThemPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThemPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhimActionPerformed(evt);
            }
        });

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        txtTuoi.setText(" Nhập độ tuổi cho phép xem");

        txtTheloai.setText("Truy xuất thời lượng dựa theo danh sách phim đã bấm");

        txtThoiluong.setText("Truy xuất thời lượng dựa theo danh sách phim đã bấm");

        cbDanhsachPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbDanhsachPhim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo dữ liệu phim đã thầu (Hợp đồng)", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));
        cbDanhsachPhim.setBorder(null);

        themAnh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        themAnh.setText("Thêm ảnh:");

        addImg.setBackground(new java.awt.Color(204, 204, 204));
        addImg.setForeground(new java.awt.Color(0, 0, 0));
        addImg.setOpaque(true);

        javax.swing.GroupLayout addImgLayout = new javax.swing.GroupLayout(addImg);
        addImg.setLayout(addImgLayout);
        addImgLayout.setHorizontalGroup(
            addImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        addImgLayout.setVerticalGroup(
            addImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        disPoster.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout disPosterLayout = new javax.swing.GroupLayout(disPoster);
        disPoster.setLayout(disPosterLayout);
        disPosterLayout.setHorizontalGroup(
            disPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        disPosterLayout.setVerticalGroup(
            disPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        dtCongChieu.setBackground(new java.awt.Color(204, 204, 204));
        dtCongChieu.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ThemPhimLayout = new javax.swing.GroupLayout(ThemPhim);
        ThemPhim.setLayout(ThemPhimLayout);
        ThemPhimLayout.setHorizontalGroup(
            ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhimLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(themAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ngaychieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dotuoi)
                    .addComponent(TheloaiPhim)
                    .addComponent(ThoiLuongPhim)
                    .addComponent(DsPhim))
                .addGap(56, 56, 56)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTheloai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtThoiluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDanhsachPhim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtCongChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(disPoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(ThemPhimLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThemPhimLayout.setVerticalGroup(
            ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhimLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DsPhim)
                    .addComponent(cbDanhsachPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(disPoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ThoiLuongPhim)
                            .addComponent(txtThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TheloaiPhim)
                            .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ThemPhimLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Dotuoi))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemPhimLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ngaychieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtCongChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(themAnh)
                            .addComponent(addImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );

        GiaodienPhim.add(ThemPhim, "ThemPhim");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PhimLayout = new javax.swing.GroupLayout(Phim);
        Phim.setLayout(PhimLayout);
        PhimLayout.setHorizontalGroup(
            PhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PhimLayout.createSequentialGroup()
                .addGroup(PhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PhimLayout.setVerticalGroup(
            PhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GiaodienPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnThem.getAccessibleContext().setAccessibleName("ThemPhim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Phim, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Phim, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();
        
        // Determine which table is currently visible
        CardLayout cardLayout = (CardLayout) GiaodienPhim.getLayout();
        JTable activeTable;
        String sheetName;
        String[] columns;
        
        // Check which panel is currently visible
        if (View.isVisible()) {
            activeTable = tbPhim;
            sheetName = "Danh Sách Phim";
            columns = new String[]{"Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày công chiếu"};
        } else if (Xemtong.isVisible()) {
            activeTable = tbXemtong;
            sheetName = "Tổng Hợp Phim";
            columns = new String[]{"Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày chiếu", "Suất đã chiếu", "Trạng thái"};
        } else {
            // Default to tbPhim if neither view is visible (shouldn't happen in normal operation)
            activeTable = tbPhim;
            sheetName = "Danh Sách Phim";
            columns = new String[]{"Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày công chiếu"};
        }
        
        // Create sheet with appropriate name
        Sheet sheet = workbook.createSheet(sheetName);
        
        // Create header row
        Row headerRow = sheet.createRow(0);
        
        // Create a cell style for the header
        CellStyle headerStyle = workbook.createCellStyle();
        org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);
        
        // Create header cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerStyle);
        }
        
        // Get data from the active table model
        DefaultTableModel model = (DefaultTableModel) activeTable.getModel();
        int rowCount = model.getRowCount();
        int colCount = Math.min(model.getColumnCount(), columns.length);
        
        // Create data rows
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < colCount; j++) {
                Object value = model.getValueAt(i, j);
                Cell cell = row.createCell(j);
                if (value != null) {
                    cell.setCellValue(value.toString());
                } else {
                    cell.setCellValue("");
                }
            }
        }
        
        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        
        // Ask user where to save the file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu file Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));
        
        // Set default filename based on the active table
        String defaultFileName = (activeTable == tbPhim) ? "DanhSachPhim.xlsx" : "TongHopPhim.xlsx";
        fileChooser.setSelectedFile(new File(defaultFileName));
        
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            
            // Add .xlsx extension if not present
            if (!filePath.endsWith(".xlsx")) {
                filePath += ".xlsx";
                selectedFile = new File(filePath);
            }
            
            // Write the workbook to the file
            try (FileOutputStream outputStream = new FileOutputStream(selectedFile)) {
                workbook.write(outputStream);
                JOptionPane.showMessageDialog(this, 
                    "Xuất file thành công!\nĐường dẫn: " + filePath, 
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        // Close the workbook
        workbook.close();
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, 
            "Lỗi khi xuất file: " + e.getMessage(), 
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Lỗi không xác định: " + e.getMessage(), 
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = tbPhim.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phim cần cập nhật", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try {
        // Lấy mã phim từ hàng được chọn
        String maPhim = tbPhim.getValueAt(selectedRow, 0).toString();
        
        // Lấy giá trị từ các trường truy xuất
        String thoiLuongText = truyxuatThoiluong.getText().trim();
        String theLoai = truyxuatTheloai.getText().trim();
        String doTuoi = truyxuatTuoi.getText().trim();
        String ngayChieuText = truyxuatNgaychieu.getText().trim();
        
        // Kiểm tra giá trị không được để trống
        if (theLoai.isEmpty() || doTuoi.isEmpty() || ngayChieuText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Chuyển đổi thời lượng sang số nguyên
        int thoiLuong;
        if (thoiLuongText.contains("phút")) {
            thoiLuongText = thoiLuongText.replace("phút", "").trim();
        }
        
        try {
            thoiLuong = Integer.parseInt(thoiLuongText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Thời lượng phải là số nguyên", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Chuyển đổi chuỗi ngày thành đối tượng Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date ngayChieu;
        try {
            ngayChieu = sdf.parse(ngayChieuText);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng dd-MM-yyyy", 
                                          "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Lấy tên phim từ trường truy xuất (không cho phép chỉnh sửa)
        String tenPhim = truyxuatPhim.getText();
        
        // Tạo đối tượng PhimDTO mới
        PhimDTO phimCapNhat = new PhimDTO(maPhim, tenPhim, thoiLuong, theLoai, doTuoi, ngayChieu);
        
        // Thực hiện cập nhật trong cơ sở dữ liệu
        PhimDAO phimDAO = new PhimDAO();
        boolean ketQua = phimDAO.capNhatPhim(phimCapNhat);
        
        if (ketQua) {
            // Nếu cập nhật thành công, cập nhật lại dữ liệu trên bảng
            loadPhimToTable();
            JOptionPane.showMessageDialog(this, "Cập nhật phim thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật phim thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    
    private void tbPhimMouseClicked(java.awt.event.MouseEvent evt) {
    // Lấy vị trí hàng được chọn
    int selectedRow = tbPhim.getSelectedRow();
    
    if (selectedRow >= 0) {
        // Lấy dữ liệu từ hàng được chọn
        String tenPhim = tbPhim.getValueAt(selectedRow, 1).toString();
        String thoiLuong = tbPhim.getValueAt(selectedRow, 2).toString();
        String theLoai = tbPhim.getValueAt(selectedRow, 3).toString();
        String doTuoi = tbPhim.getValueAt(selectedRow, 4).toString();
        String ngayChieu = tbPhim.getValueAt(selectedRow, 5).toString();
        
        // Hiển thị dữ liệu lên các trường truy xuất
        truyxuatPhim.setText(tenPhim);
        truyxuatThoiluong.setText(thoiLuong);
        truyxuatTheloai.setText(theLoai);
        truyxuatTuoi.setText(doTuoi);
        truyxuatNgaychieu.setText(ngayChieu);
        
        // Đặt trường truyxuatPhim thành read-only để không cho phép sửa đổi
        truyxuatPhim.setEditable(false);
        
        // Các trường khác có thể cho phép chỉnh sửa (hoặc không, tùy theo yêu cầu)
        truyxuatThoiluong.setEditable(true);
        truyxuatTheloai.setEditable(true);
        truyxuatTuoi.setEditable(true);
        truyxuatNgaychieu.setEditable(true);
    }
}

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
    // Kiểm tra xem người dùng đã chọn hàng nào chưa
    int selectedRow = tbPhim.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một phim để ngừng chiếu.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Lấy mã phim từ hàng được chọn
    String maPhim = tbPhim.getValueAt(selectedRow, 0).toString();
    
    // Xác nhận trước khi ngừng chiếu
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Bạn có chắc chắn muốn ngừng chiếu phim này?", 
        "Xác nhận ngừng chiếu", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Cập nhật trạng thái phim trong cơ sở dữ liệu
        PhimDAO dao = new PhimDAO();
        boolean success = dao.capNhatTrangThaiPhim(maPhim, "Đã chiếu");
        
        if (success) {
            // Xóa hàng khỏi bảng
            DefaultTableModel model = (DefaultTableModel) tbPhim.getModel();
            model.removeRow(selectedRow);
            
            // Xóa thông tin ở các trường truy xuất
            clearTruyXuatFields();
            
            JOptionPane.showMessageDialog(this, "Ngừng chiếu phim thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể ngừng chiếu phim. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Phương thức để xóa thông tin trong các trường truy xuất
private void clearTruyXuatFields() {
    truyxuatPhim.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatThoiluong.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatTheloai.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatTuoi.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatNgaychieu.setText(" Truy xuất khi nhấp vào table trên");
}
    
    // Phương thức xử lý sự kiện khi nhấn nút tìm kiếm
private void TimKiemPhim(java.awt.event.ActionEvent evt) {
    String searchTerm = TimkiemPhim.getText().trim();
    boolean isEmpty = searchTerm.isEmpty() || searchTerm.equals("Nhập tên phim.....") || searchTerm.equals(" Nhập tên phim.....");
    
    if (isEmpty) {
        loadPhimToTable();
        return;
    }
    
    PhimDAO dao = new PhimDAO();
    java.util.List<PhimDTO> listPhim = dao.layDanhSachPhim();
    
    DefaultTableModel model = (DefaultTableModel) tbPhim.getModel();
    model.setRowCount(0); // Xóa dữ liệu cũ
    
    for (PhimDTO phim : listPhim) {
        if (phim.getTenPhim().toLowerCase().contains(searchTerm.toLowerCase()) && 
            phim.isActiveOrUpcoming()) {
            model.addRow(new Object[] {
                phim.getMaPhim(),
                phim.getTenPhim(),
                phim.getThoiLuong() + " phút",
                phim.getTheLoai(),
                phim.getDoTuoi(),
                phim.getNgayChieuFormatted()
            });
        }
    }
}




    private void TimKiemTong(java.awt.event.ActionEvent evt) {                                        
   String keyword = txtTimkiemTong.getText().trim().toLowerCase();
    
    // Kiểm tra cả trường hợp rỗng và placeholder text
    if (keyword.isEmpty() || keyword.equals("nhập tên phim.....") || keyword.equals(" nhập tên phim.....")) {
        loadPhimToXemTongTable();
        return;
    }
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); // Xóa dữ liệu hiện tại
    
    PhimDAO phimDAO = new PhimDAO();
    java.util.List<PhimDTO> listPhim = phimDAO.getAllPhim();
    
    for (PhimDTO phim : listPhim) {
        // Tìm kiếm theo tên phim hoặc thể loại
        if (phim.getTenPhim().toLowerCase().contains(keyword) || 
            phim.getTheLoai().toLowerCase().contains(keyword)) {
            Object[] row = {
                phim.getMaPhim(),
                phim.getTenPhim(),
                phim.getThoiLuong() + " phút",
                phim.getTheLoai(),
                phim.getDoTuoi(),
                phim.getNgayChieuFormatted(),
                phim.getSuatDaChieu(),
                phim.getTrangThai()
            };
            model.addRow(row);
        }
    }
}
    
    private void loadPhimToXemTongTable() {
    try {
        PhimDAO phimDAO = new PhimDAO();
        java.util.List<PhimDTO> listPhim = phimDAO.getAllPhim();
        
        DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
        model.setRowCount(0); // Xóa tất cả dữ liệu hiện tại trên bảng
        
        for (PhimDTO phim : listPhim) {
            Object[] row = {
                phim.getMaPhim(),
                phim.getTenPhim(),
                phim.getThoiLuong() + " phút",
                phim.getTheLoai(),
                phim.getDoTuoi(),
                phim.getNgayChieuFormatted(),
                phim.getSuatDaChieu(),
                phim.getTrangThai()
            };
            model.addRow(row);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu phim: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    private void loadDanhSachTenPhim() {
    HopDongDAO hopDongDAO = new HopDongDAO();
    java.util.List<String> tenPhimList = hopDongDAO.layDanhSachTenPhim();

    
    // Xóa các mục cũ trong ComboBox
    cbDanhsachPhim.removeAllItems();
    
    // Thêm các tên phim vào ComboBox
    for (String tenPhim : tenPhimList) {
        cbDanhsachPhim.addItem(tenPhim);
    }
    
    // Nếu không có tên phim nào, thêm một thông báo
    if (tenPhimList.isEmpty()) {
        cbDanhsachPhim.addItem("Không có phim nào trong cơ sở dữ liệu");
    }
}
    
   private void loadPhimToTable() {
    DefaultTableModel model = (DefaultTableModel) tbPhim.getModel();
    model.setRowCount(0); // Xóa dữ liệu cũ
    
    PhimDAO dao = new PhimDAO();
    java.util.List<PhimDTO> listPhim = dao.layDanhSachPhim();
    
   for (PhimDTO phim : listPhim) {
        if (phim.isActiveOrUpcoming()) {
            model.addRow(new Object[] {
                phim.getMaPhim(),
                phim.getTenPhim(),
                phim.getThoiLuong() + " phút",
                phim.getTheLoai(),
                phim.getDoTuoi(),
                phim.getNgayChieuFormatted()
            });
        }
    }
       
}

   
    
    private void TimkiemPhimNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhimNhapchu
        if(TimkiemPhim.getText().equals(" Nhập tên phim.....")){
            TimkiemPhim.setText("");
            TimkiemPhim.setForeground(Color.BLACK);
        }
        else
        TimkiemPhim.selectAll();
    }//GEN-LAST:event_TimkiemPhimNhapchu

    
    private void TimkiemPhimLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhimLammo
        if(TimkiemPhim.getText().trim().isEmpty()){
            TimkiemPhim.setText(" Nhập tên phim.....");
            TimkiemPhim.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemPhimLammo

    private void ThemPhim(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemPhim
        CardLayout card = (CardLayout) GiaodienPhim.getLayout();
        card.show(GiaodienPhim, "ThemPhim");
        
        
    }//GEN-LAST:event_ThemPhim

    private void XemPhim(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemPhim
        CardLayout card = (CardLayout) GiaodienPhim.getLayout();
        card.show(GiaodienPhim, "Xemtong");
            loadPhimToXemTongTable();

    }//GEN-LAST:event_XemPhim

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
    JButton clickedButton = (JButton) evt.getSource();

    
    if (selectedButton != null && selectedButton != clickedButton) {
        selectedButton.setBorder(UIManager.getBorder("Button.border"));
    }

    selectedButton = clickedButton;
    selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienPhim.getLayout();
        card.show(GiaodienPhim, "View");
    }//GEN-LAST:event_View

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập tên phim.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập tên phim.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    
    
    private void resetForm() {
    txtThoiluong.setText("Nhập thời lượng phim theo số phút");
    txtTheloai.setText("Nhập thể loại phim");
    txtTuoi.setText("Nhập độ tuổi cho phép xem");
    dtCongChieu.setDate(null);
    
    // Reset ảnh poster
    disPoster.removeAll();
    disPoster.revalidate();
    disPoster.repaint();
    
    // Tạo lại đối tượng ImageHandler
    imageHandler = new ImageHandler(disPoster);
    imageHandler.attachClickListener(addImg);
    
    // Reset lại giao diện addImg
    addImg.removeAll();
    JLabel addImgLabel = new JLabel("+ Chọn ảnh", SwingConstants.CENTER);
    addImgLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
    addImg.setLayout(new BorderLayout());
    addImg.add(addImgLabel, BorderLayout.CENTER);
    addImg.revalidate();
    addImg.repaint();
}
    
    private void btnThemPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhimActionPerformed
       // Kiểm tra dữ liệu nhập vào
    String tenPhim = cbDanhsachPhim.getSelectedItem().toString();
    
    // Kiểm tra tên phim đã chọn
    if (tenPhim.equals("Không có phim nào trong cơ sở dữ liệu") || tenPhim.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Vui lòng chọn tên phim từ danh sách!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Lấy thời lượng
    int thoiLuong;
    try {
        thoiLuong = Integer.parseInt(txtThoiluong.getText().trim());
        if (thoiLuong <= 0) {
            JOptionPane.showMessageDialog(this,
                "Thời lượng phim phải lớn hơn 0!",
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
            "Thời lượng phải là số nguyên!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Lấy thể loại
    String theLoai = txtTheloai.getText().trim();
    if (theLoai.isEmpty() || theLoai.equals("Nhập thể loại phim")) {
        JOptionPane.showMessageDialog(this,
            "Vui lòng nhập thể loại phim!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Lấy độ tuổi
    String doTuoi = txtTuoi.getText().trim();
    if (doTuoi.isEmpty() || doTuoi.equals("Nhập độ tuổi cho phép xem")) {
        JOptionPane.showMessageDialog(this,
            "Vui lòng nhập độ tuổi cho phép xem!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Lấy ngày chiếu từ JDateChooser
    Date ngayChieu = dtCongChieu.getDate();
    if (ngayChieu == null) {
        JOptionPane.showMessageDialog(this,
            "Vui lòng chọn ngày công chiếu!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Kiểm tra ngày chiếu không được nhỏ hơn ngày hiện tại
    Date ngayHienTai = new Date();
    // Đặt giờ, phút, giây, mili giây về 0 để so sánh chỉ ngày
    Calendar cal = Calendar.getInstance();
    cal.setTime(ngayHienTai);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    ngayHienTai = cal.getTime();
    
    // Tương tự cho ngày chiếu
    cal.setTime(ngayChieu);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    ngayChieu = cal.getTime();
    
    if (ngayChieu.before(ngayHienTai)) {
        JOptionPane.showMessageDialog(this,
            "Ngày công chiếu không thể trước ngày hiện tại!",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Xác định trạng thái phim dựa trên ngày chiếu
    String trangThai;
    if (ngayChieu.equals(ngayHienTai)) {
        trangThai = "Đang chiếu";
    } else {
        trangThai = "Sắp chiếu";
    }
    
    // Xử lý ảnh poster - Sử dụng ImageHandler của bạn
    byte[] posterData = null;
    BufferedImage selectedImage = imageHandler.getSelectedImage();
    
    if (selectedImage != null) {
        try {
            // Chuyển BufferedImage thành byte array
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            javax.imageio.ImageIO.write(selectedImage, "jpg", baos);
            baos.flush();
            posterData = baos.toByteArray();
            baos.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(this,
                "Lỗi khi xử lý ảnh: " + e.getMessage(),
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    // Tạo mã phim mới
    PhimDAO phimDAO = new PhimDAO();
    String maPhimMoi = phimDAO.taoMaPhimMoi();
    
    // Tạo đối tượng PhimDTO mới
    PhimDTO phimMoi = new PhimDTO(
        maPhimMoi, tenPhim, thoiLuong, theLoai, doTuoi, 
        ngayChieu, 0, trangThai, posterData
    );
    
    // Thêm phim vào CSDL
    boolean themThanhCong = phimDAO.themPhim(phimMoi);
    
    if (themThanhCong) {
        JOptionPane.showMessageDialog(this,
            "Thêm phim thành công!",
            "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        
        // Làm mới bảng phim
        loadPhimToTable();
        
        // Reset các trường nhập liệu
        resetForm();
    } else {
        JOptionPane.showMessageDialog(this,
            "Thêm phim thất bại! Vui lòng kiểm tra lại dữ liệu.",
            "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnThemPhimActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dotuoi;
    private javax.swing.JLabel DsPhim;
    private javax.swing.JPanel GiaodienPhim;
    private javax.swing.JLabel Ngaychieu;
    private javax.swing.JPanel Phim;
    private javax.swing.JLabel TheloaiPhim;
    private javax.swing.JPanel ThemPhim;
    private javax.swing.JLabel ThoiLuongPhim;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemPhim;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private my_component.RoundedPanel addImg;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnThemPhim;
    private testlib.RoundedButton btnTimkiemPhim;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbDanhsachPhim;
    private javax.swing.JPanel disPoster;
    private com.toedter.calendar.JDateChooser dtCongChieu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbPhim;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JLabel themAnh;
    private javax.swing.JTextField truyxuatNgaychieu;
    private javax.swing.JTextField truyxuatPhim;
    private javax.swing.JTextField truyxuatTheloai;
    private javax.swing.JTextField truyxuatThoiluong;
    private javax.swing.JTextField truyxuatTuoi;
    private javax.swing.JLabel txNgaychieu;
    private javax.swing.JLabel txPhim;
    private javax.swing.JLabel txTheloai;
    private javax.swing.JLabel txThoiluong;
    private javax.swing.JLabel txTuoi;
    private testlib.RoundedTextField txtTheloai;
    private testlib.RoundedTextField txtThoiluong;
    private javax.swing.JTextField txtTimkiemTong;
    private testlib.RoundedTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
