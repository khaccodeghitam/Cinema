
package gui;

import DAO.UuDaiDAO;
import BUS.LichChieuBUS;
import BUS.UuDaiBUS;
import DTO.LichChieuDTO;
import DTO.UuDaiDTO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class UudaiGUI extends javax.swing.JPanel {

    
    private JButton selectedButton = null;
    ArrayList<UuDaiDTO> dsUdHientai = new ArrayList<>();
    
    
    public UudaiGUI() {
        initComponents();
        GiaodienUudai.setLayout(new CardLayout());
        GiaodienUudai.add(View, "View");
        GiaodienUudai.add(ThemUudai, "ThemUudai");
        GiaodienUudai.add(Xemtong, "Xemtong");
        
        
        JTableHeader header = tbUudai.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienUudai = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        TimkiemUudai = new javax.swing.JTextField();
        buttonTimkiemPhim = new testlib.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUudai = new javax.swing.JTable();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txTenuudai = new javax.swing.JLabel();
        txPhantramgiam = new javax.swing.JLabel();
        txDieukien = new javax.swing.JLabel();
        truyxuatDieukien = new javax.swing.JTextField();
        truyxuatPhantramgiam = new javax.swing.JTextField();
        truyxuatTenuudai = new javax.swing.JTextField();
        txNgaybd = new javax.swing.JLabel();
        txNgaykt = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLoc = new javax.swing.JButton();
        dateXemUDBD = new com.toedter.calendar.JDateChooser();
        dateUDKT = new com.toedter.calendar.JDateChooser();
        ThemUudai = new javax.swing.JPanel();
        MaPhim = new javax.swing.JLabel();
        txtMauudai = new testlib.RoundedTextField();
        TenPhim = new javax.swing.JLabel();
        txtTenPhim = new testlib.RoundedTextField();
        Phantramgiam = new javax.swing.JLabel();
        txtPhantramgiam = new testlib.RoundedTextField();
        Ngaybd = new javax.swing.JLabel();
        Ngaykt = new javax.swing.JLabel();
        Dieukien = new javax.swing.JLabel();
        txtDieuKien = new testlib.RoundedTextField();
        btnHuybo = new testlib.RoundedButton();
        btnThemuudai = new testlib.RoundedButton();
        dateBD = new com.toedter.calendar.JDateChooser();
        dateKT = new com.toedter.calendar.JDateChooser();
        Xemtong = new javax.swing.JPanel();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

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
                docUuDai(evt);
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
                ThemUudai(evt);
            }
        });

        btnXemtong.setBackground(new java.awt.Color(153, 153, 153));
        btnXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
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
                Xemtong(evt);
                docdsudDD(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(153, 153, 153));
        btnExport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
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
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuatExcel(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(153, 153, 153));
        btnImport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
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
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themExcel(evt);
            }
        });

        GiaodienUudai.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemUudai.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemUudai.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemUudai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemUudai.setText(" Nhập ưu đãi.....");
        TimkiemUudai.setToolTipText("");
        TimkiemUudai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemUudai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemUudaiNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemUudaiLammo(evt);
            }
        });

        buttonTimkiemPhim.setBackground(new java.awt.Color(204, 204, 204));
        buttonTimkiemPhim.setForeground(new java.awt.Color(0, 0, 0));
        buttonTimkiemPhim.setText("Tìm kiếm");
        buttonTimkiemPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        buttonTimkiemPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemUd(evt);
            }
        });

        tbUudai.setAutoCreateRowSorter(true);
        tbUudai.setBackground(new java.awt.Color(153, 153, 153));
        tbUudai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbUudai.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbUudai.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "Mã ưu đãi", "Tên ưu đãi", "Phần trăm giảm", "Ngày bắt đầu", "Ngày kết thúc", "Điều kiện"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUudai.setRowHeight(30);
        tbUudai.setShowVerticalLines(true);
        tbUudai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                truyXuat(evt);
            }
        });
        jScrollPane1.setViewportView(tbUudai);

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUd(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa.setContentAreaFilled(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaud(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txTenuudai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTenuudai.setText("Tên ưu đãi:");

        txPhantramgiam.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txPhantramgiam.setText("% giảm:");

        txDieukien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txDieukien.setText("Điều kiện:");

        truyxuatDieukien.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatDieukien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatDieukien.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatDieukien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatPhantramgiam.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatPhantramgiam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatPhantramgiam.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatPhantramgiam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatTenuudai.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTenuudai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTenuudai.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTenuudai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txNgaybd.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNgaybd.setText("Ngày bắt đầu:");

        txNgaykt.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNgaykt.setText("Ngày kết thúc:");

        jLabel1.setText("From");

        jLabel2.setText("To");

        btnLoc.setText("Loc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                            .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TimkiemUudai, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(123, 123, 123)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnLoc))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txTenuudai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPhantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDieukien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(truyxuatPhantramgiam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(truyxuatTenuudai, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(truyxuatDieukien))))
                .addGap(50, 50, 50)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(txNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateXemUDBD, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(txNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateUDKT, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemUudai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnLoc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenuudai)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(truyxuatTenuudai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNgaybd))
                            .addComponent(dateXemUDBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txPhantramgiam)
                                    .addComponent(truyxuatPhantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNgaykt))
                                .addGap(18, 18, 18)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txDieukien)
                                    .addComponent(truyxuatDieukien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateUDKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        GiaodienUudai.add(View, "View");

        ThemUudai.setBackground(new java.awt.Color(153, 153, 153));

        MaPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        MaPhim.setText("Mã ưu đãi:");

        txtMauudai.setText("Nhập mã ưu đãi");

        TenPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TenPhim.setText("Tên ưu đãi:");

        txtTenPhim.setText("Nhập tên ưu đãi");

        Phantramgiam.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Phantramgiam.setText("Phần trăm giảm:");

        txtPhantramgiam.setText("Nhập phần trăm giảm");

        Ngaybd.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngaybd.setText("Ngày bắt đầu:");

        Ngaykt.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngaykt.setText("Ngày kết thúc:");

        Dieukien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dieukien.setText("Điều kiện:");

        txtDieuKien.setText("Nhập điều kiện");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnHuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuybo(evt);
            }
        });

        btnThemuudai.setBackground(new java.awt.Color(204, 0, 0));
        btnThemuudai.setText("Thêm ưu đãi");
        btnThemuudai.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThemuudai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themUd(evt);
            }
        });

        javax.swing.GroupLayout ThemUudaiLayout = new javax.swing.GroupLayout(ThemUudai);
        ThemUudai.setLayout(ThemUudaiLayout);
        ThemUudaiLayout.setHorizontalGroup(
            ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemUudaiLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dieukien)
                            .addComponent(Ngaykt)
                            .addComponent(Ngaybd)
                            .addComponent(Phantramgiam)
                            .addComponent(TenPhim)
                            .addComponent(MaPhim))
                        .addGap(56, 56, 56)
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDieuKien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhantramgiam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMauudai, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(btnThemuudai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(257, 257, 257))
        );
        ThemUudaiLayout.setVerticalGroup(
            ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemUudaiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MaPhim)
                            .addComponent(txtMauudai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ThemUudaiLayout.createSequentialGroup()
                                .addComponent(TenPhim)
                                .addGap(37, 37, 37)
                                .addComponent(Phantramgiam))
                            .addGroup(ThemUudaiLayout.createSequentialGroup()
                                .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtPhantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(Ngaybd))
                    .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ngaykt)
                    .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dieukien)
                    .addComponent(txtDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemuudai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        GiaodienUudai.add(ThemUudai, "ThemUudai");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập ưu đãi.....");
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
        btnTimkiemTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemDD(evt);
            }
        });

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã ưu đãi", "Tên ưu đãi", "Phần trăm giảm", "Ngày bắt đầu", "Ngày kết thúc", "Điều kiện", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XemtongLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(18, 18, 18))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GiaodienUudai.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(GiaodienUudai, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GiaodienUudai, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemUudaiNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemUudaiNhapchu
        if(TimkiemUudai.getText().equals(" Nhập ưu đãi.....")){
           TimkiemUudai.setText("");
            TimkiemUudai.setForeground(Color.BLACK);
        }
        else
        TimkiemUudai.selectAll();
    }//GEN-LAST:event_TimkiemUudaiNhapchu

    private void TimkiemUudaiLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemUudaiLammo
        if(TimkiemUudai.getText().trim().isEmpty()){
            TimkiemUudai.setText(" Nhập ưu đãi.....");
            TimkiemUudai.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemUudaiLammo

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập ưu đãi.....")){
           txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập ưu đãi.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienUudai.getLayout();
        card.show(GiaodienUudai, "View");
    }//GEN-LAST:event_View

    private void ThemUudai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemUudai
        CardLayout card = (CardLayout) GiaodienUudai.getLayout();
        card.show(GiaodienUudai, "ThemUudai");
    }//GEN-LAST:event_ThemUudai

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienUudai.getLayout();
        card.show(GiaodienUudai, "Xemtong");
    }//GEN-LAST:event_Xemtong

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();

    
        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void docUuDai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docUuDai
        // TODO add your handling code here:
        UuDaiBUS bus=new UuDaiBUS();
        if(UuDaiBUS.dsud!=null){
            
        }else{
            bus.docdsud();
        }
        Vector header=new Vector();
        header.add("ma uu dai");
        header.add("ten uu dai");
        header.add("phan tram giam");
        header.add("ngay bat dau");
        header.add("ngay ket thuc");
        header.add("dieu kien");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel model=new DefaultTableModel(header,0);
        for(UuDaiDTO ud:UuDaiBUS.dsud){
            Vector row=new Vector();
            row.add(ud.maUuDai);
            row.add(ud.tenUuDai);
            row.add(ud.phanTramGiam);
            row.add(sdf.format(ud.ngayBatDau));   // ✅
            row.add(sdf.format(ud.ngayKetThuc));
            row.add(ud.dieuKien);
            model.addRow(row);
        }
        dsUdHientai=bus.dsud;
        tbUudai.setModel(model);
    }//GEN-LAST:event_docUuDai

    private void docdsudDD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docdsudDD
        // TODO add your handling code here:
        UuDaiBUS bus = new UuDaiBUS();
    
        bus.docdsudDD(); 
    

    Vector header = new Vector();
    header.add("ma uu dai");
    header.add("ten uu dai");
    header.add("phan tram giam");
    header.add("ngay bat dau");
    header.add("ngay ket thuc");
    header.add("dieu kien");
    header.add("trang thai");

    DefaultTableModel model = new DefaultTableModel(header, 0);

    // duyệt đúng mảng đã load
    for (UuDaiDTO ud : UuDaiBUS.dsudDD) {
        Vector row = new Vector();
        row.add(ud.maUuDai);
        row.add(ud.tenUuDai);
        row.add(ud.phanTramGiam);
        row.add(ud.ngayBatDau);
        row.add(ud.ngayKetThuc);
        row.add(ud.dieuKien);
        String trangThaiText = (ud.trangThai == 0) ? "Chưa xoá" : "Đã ẩn";
        row.add(trangThaiText);
        model.addRow(row);
    }

    tbXemtong.setModel(model);

    }//GEN-LAST:event_docdsudDD

    private void truyXuat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_truyXuat
        // TODO add your handling code here:
         int i=tbUudai.getSelectedRow();  
        if(i>=0 && i<dsUdHientai.size()){
            UuDaiDTO ud = dsUdHientai.get(i);
            
            truyxuatTenuudai.setText(ud.tenUuDai);
            truyxuatPhantramgiam.setText(String.valueOf(ud.phanTramGiam));
            truyxuatDieukien.setText(ud.dieuKien);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Hoặc "dd/MM/yyyy"
            dateXemUDBD.setDate(ud.ngayBatDau);
            dateUDKT.setDate(ud.ngayKetThuc);
            
        }
    }//GEN-LAST:event_truyXuat

    private void themUd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themUd
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            UuDaiDTO ud = new UuDaiDTO();
            ud.maUuDai = txtMauudai.getText();
            ud.tenUuDai = txtTenPhim.getText();
            ud.phanTramGiam = Integer.parseInt(txtPhantramgiam.getText()); // String -> int

            // --- Ngày bắt đầu và ngày kết thúc lấy từ JDateChooser ---
            if (dateBD.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày bắt đầu!");
                return;
            }
            ud.ngayBatDau = dateBD.getDate(); // Lấy trực tiếp Date

            if (dateKT.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày kết thúc!");
                return;
            }
            java.util.Date now = new java.util.Date(); // Ngày hiện tại
        try {
            // 1. Ngày bắt đầu >= hôm nay
            if (dateBD.getDate().before(sdf.parse(sdf.format(now)))) {
                JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải lớn hơn hoặc bằng ngày hôm nay!");
                return;
            }       } catch (ParseException ex) {
            Logger.getLogger(UudaiGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

// 2. Ngày kết thúc >= ngày bắt đầu
if (dateKT.getDate().before(dateBD.getDate())) {
    JOptionPane.showMessageDialog(null, "Ngày kết thúc phải sau hoặc bằng ngày bắt đầu!");
    return;
}

            ud.ngayKetThuc = dateKT.getDate(); // Lấy trực tiếp Date

            ud.dieuKien = txtDieuKien.getText();

            // --- Gọi bus để thêm ---
            UuDaiBUS bus = new UuDaiBUS();
            bus.themdsud(ud);

            // --- Update lên bảng ---
            DefaultTableModel model = (DefaultTableModel) tbUudai.getModel();
            Vector row = new Vector();
            row.add(ud.maUuDai);
            row.add(ud.tenUuDai);
            row.add(ud.phanTramGiam);
            row.add(sdf.format(ud.ngayBatDau)); 
            row.add(sdf.format(ud.ngayKetThuc));
            row.add(ud.dieuKien);
            model.addRow(row);
            tbUudai.setModel(model);

            JOptionPane.showMessageDialog(null, "Thêm ưu đãi thành công!");

            // --- Reset form ---
            txtMauudai.setText("");
            txtTenPhim.setText("");
            txtPhantramgiam.setText("");
            dateBD.setDate(null);
            dateKT.setDate(null);
            txtDieuKien.setText("");

    }//GEN-LAST:event_themUd

    private void updateUd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUd
        // TODO add your handling code here:
        int i = tbUudai.getSelectedRow();
if (i >= 0) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        UuDaiDTO ud = new UuDaiDTO();
        ud.maUuDai = tbUudai.getValueAt(i, 0).toString(); // Lấy mã từ dòng đang chọn
        ud.tenUuDai = truyxuatTenuudai.getText();
        ud.phanTramGiam = Integer.parseInt(truyxuatPhantramgiam.getText());

        // --- Ngày bắt đầu và ngày kết thúc từ JDateChooser ---
        if (dateXemUDBD.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày bắt đầu!");
            return;
        }
        if (dateUDKT.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày kết thúc!");
            return;
        }

        java.util.Date now = new java.util.Date();

        // Kiểm tra ngày bắt đầu >= hôm nay
        if (dateXemUDBD.getDate().before(sdf.parse(sdf.format(now)))) {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải lớn hơn hoặc bằng hôm nay!");
            return;
        }

        // Kiểm tra ngày kết thúc >= ngày bắt đầu
        if (dateUDKT.getDate().before(dateXemUDBD.getDate())) {
            JOptionPane.showMessageDialog(null, "Ngày kết thúc phải sau hoặc bằng ngày bắt đầu!");
            return;
        }

        // Nếu qua kiểm tra thì gán vào DTO
        ud.ngayBatDau = dateXemUDBD.getDate();
        ud.ngayKetThuc = dateUDKT.getDate();
        ud.dieuKien = truyxuatDieukien.getText();

        // --- Gọi bus cập nhật ---
        UuDaiBUS bus = new UuDaiBUS();
        bus.updatedsud(ud);

        // --- Cập nhật lên table ---
        DefaultTableModel model = (DefaultTableModel) tbUudai.getModel();
        model.setValueAt(ud.tenUuDai, i, 1);
        model.setValueAt(ud.phanTramGiam, i, 2);
        model.setValueAt(sdf.format(ud.ngayBatDau), i, 3);
        model.setValueAt(sdf.format(ud.ngayKetThuc), i, 4);
        model.setValueAt(ud.dieuKien, i, 5);

        tbUudai.setModel(model);

        JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi định dạng! Vui lòng kiểm tra lại dữ liệu.");
        ex.printStackTrace();
    }
} else {
    JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần cập nhật!");
}


    }//GEN-LAST:event_updateUd

    private void btnXoaud(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaud
        // TODO add your handling code here:
        int i = tbUudai.getSelectedRow();
        if (i >= 0) {
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Bạn có chắc chắn muốn xoá ưu đãi này?", 
                "Xác nhận xoá", 
                JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String maUuDai = tbUudai.getValueAt(i, 0).toString();

                UuDaiBUS bus = new UuDaiBUS();
                bus.xoaUuDai(maUuDai); // Cập nhật trạng thái = 1

                JOptionPane.showMessageDialog(null, "Xoá thành công!");

                // Cập nhật lại bảng - giả sử đang ở chế độ XEM thông thường
                bus.docdsud(); // nếu ở XEM TỔNG thì dùng bus.docdsudDD();

                // Làm mới model
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ma uu dai");
                model.addColumn("ten uu dai");
                model.addColumn("phan tram giam");
                model.addColumn("ngay bat dau");
                model.addColumn("ngay ket thuc");
                model.addColumn("dieu kien");
                

                for (UuDaiDTO ud : UuDaiBUS.dsud) {
                    Vector row = new Vector();
                    row.add(ud.maUuDai);
                    row.add(ud.tenUuDai);
                    row.add(ud.phanTramGiam);
                    row.add(ud.ngayBatDau);
                    row.add(ud.ngayKetThuc);
                    row.add(ud.dieuKien);
                    
                    model.addRow(row);
                }

                tbUudai.setModel(model);
            }
}


    }//GEN-LAST:event_btnXoaud

    private void btnTimkiemUd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemUd
        // TODO add your handling code here:
        String key = TimkiemUudai.getText();
        UuDaiBUS bus = new UuDaiBUS();
        ArrayList<UuDaiDTO> dskq;
        if (key.isEmpty()) {
            if (UuDaiBUS.dsud == null) {
                bus.docdsud();
            }
            dskq = UuDaiBUS.dsud;
        } else {
            dskq = bus.timKiem(key);
        }
        DefaultTableModel model = (DefaultTableModel) tbUudai.getModel();
        model.setRowCount(0);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (UuDaiDTO ud : dskq) {
            model.addRow(new Object[]{
                ud.getMaUuDai(),
                ud.getTenUuDai(),
                ud.getPhanTramGiam(),
                sdf.format(ud.getNgayBatDau()),  // Chỉ hiển thị ngày theo định dạng yyyy-MM-dd
                sdf.format(ud.getNgayKetThuc()), // Chỉ hiển thị ngày theo định dạng yyyy-MM-dd
                ud.getDieuKien(),
            });
        }
        dsUdHientai=dskq;

        if (dskq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnTimkiemUd

    private void btnHuybo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuybo
        // TODO add your handling code here:
        txtMauudai.setText("");
        txtTenPhim.setText("");
        txtPhantramgiam.setText("");
        
        txtDieuKien.setText("");
    }//GEN-LAST:event_btnHuybo

    private void btnTimKiemDD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemDD
        // TODO add your handling code here:
        String key = txtTimkiemTong.getText();
        UuDaiBUS bus = new UuDaiBUS();
        ArrayList<UuDaiDTO> dskq;
        if (key.isEmpty()) {
            if (UuDaiBUS.dsud == null) {
                bus.docdsudDD();
            }
            dskq = UuDaiBUS.dsudDD;
        } else {
            dskq = bus.timKiemDD(key);
        }
        DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
        model.setRowCount(0);

        for (UuDaiDTO ud : dskq) {
            model.addRow(new Object[]{
                ud.getMaUuDai(),
                ud.getTenUuDai(),
                ud.getPhanTramGiam(),
                ud.getNgayBatDau(),
                ud.getNgayKetThuc(),
                ud.getDieuKien(), 
                (ud.getTrangThai() == 0) ? "Chưa ẩn" : "Đã ẩn"
            });
        }
        
        if (dskq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnTimKiemDD

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here
        String fromText = txtFrom.getText().trim();
        String toText = txtTo.getText().trim();

        ArrayList<UuDaiDTO> dskq;
        UuDaiBUS bus = new UuDaiBUS();

        // Nếu người dùng không nhập gì => lấy toàn bộ danh sách
        if (fromText.isEmpty() || toText.isEmpty()) {
            if (UuDaiBUS.dsud == null) {
                bus.docdsud();
            }
            dskq = UuDaiBUS.dsud;
        } else {
            // Đã có input → parse sang int
            int n1 = Integer.parseInt(fromText);
            int n2 = Integer.parseInt(toText);
            dskq = bus.locUD(n1, n2); // locUD(int n1, int n2)
        }
        DefaultTableModel model = (DefaultTableModel) tbUudai.getModel();
        model.setRowCount(0);

        for (UuDaiDTO ud : dskq) {
            model.addRow(new Object[]{
                ud.getMaUuDai(),
                ud.getTenUuDai(),
                ud.getPhanTramGiam(),
                ud.getNgayBatDau(),
                ud.getNgayKetThuc(),
                ud.getDieuKien(), 
               
            });
        }
        dsUdHientai=dskq;
        if (dskq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnLocActionPerformed

    private void themExcel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themExcel
        // TODO add your handling code here:
       JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Chọn file Excel");

    // Chỉ lọc những file có định dạng .xlsx
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files", "xlsx"));

    int result = fileChooser.showOpenDialog(this); // `this` là JFrame của bạn

    if (result == JFileChooser.APPROVE_OPTION) {
        // Lấy file người dùng đã chọn
        File file = fileChooser.getSelectedFile();

        try {
            // Gọi phương thức docExcel từ LichChieuBUS để đọc file Excel
            UuDaiBUS bus = new UuDaiBUS();
            bus.importExcel(file.getAbsolutePath()); // Đọc file từ đường dẫn

            // Sau khi đọc xong, lấy danh sách lịch chiếu
            ArrayList<UuDaiDTO> dsUuDai = UuDaiBUS.dsud;

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Đọc file Excel thành công!");

            // (Tùy chọn) Hiển thị kết quả ra bảng hoặc console
            for (UuDaiDTO ud : dsUuDai) {
                System.out.println(ud.getMaUuDai() + " - " + ud.getTenUuDai());
            }

            // (Tùy chọn) Bạn có thể cập nhật bảng hoặc giao diện để hiển thị dữ liệu vừa đọc

        } catch (Exception e) {
            // Xử lý lỗi nếu có
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đọc file Excel: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_themExcel

    private void truyxuatExcel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuatExcel
        // TODO add your handling code here:
      JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
    
    // Cho phép người dùng chọn file và thư mục
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    // Đặt filter cho file Excel
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
    fileChooser.setFileFilter(filter);
    
    // Hiển thị cửa sổ để người dùng chọn
    int userSelection = fileChooser.showSaveDialog(null);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        // Lấy file đã chọn
        File fileToSave = fileChooser.getSelectedFile();
        
        // Kiểm tra nếu người dùng không chọn đuôi file .xlsx thì thêm vào
        String filePath = fileToSave.getAbsolutePath();
        if (!filePath.endsWith(".xlsx")) {
            filePath += ".xlsx";
        }

        // Gọi hàm exportExcel trong BUS
        UuDaiBUS.exportExcel(filePath);
        
        // Thông báo thành công
        JOptionPane.showMessageDialog(null, "Đã xuất thành công ra file: " + filePath);
    } else {
        // Người dùng hủy chọn
        JOptionPane.showMessageDialog(null, "Hủy xuất file.");
    }    
    }//GEN-LAST:event_truyxuatExcel


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dieukien;
    private javax.swing.JPanel GiaodienUudai;
    private javax.swing.JLabel MaPhim;
    private javax.swing.JLabel Ngaybd;
    private javax.swing.JLabel Ngaykt;
    private javax.swing.JLabel Phantramgiam;
    private javax.swing.JLabel TenPhim;
    private javax.swing.JPanel ThemUudai;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JTextField TimkiemUudai;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnThemuudai;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private testlib.RoundedButton buttonTimkiemPhim;
    private com.toedter.calendar.JDateChooser dateBD;
    private com.toedter.calendar.JDateChooser dateKT;
    private com.toedter.calendar.JDateChooser dateUDKT;
    private com.toedter.calendar.JDateChooser dateXemUDBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbUudai;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatDieukien;
    private javax.swing.JTextField truyxuatPhantramgiam;
    private javax.swing.JTextField truyxuatTenuudai;
    private javax.swing.JLabel txDieukien;
    private javax.swing.JLabel txNgaybd;
    private javax.swing.JLabel txNgaykt;
    private javax.swing.JLabel txPhantramgiam;
    private javax.swing.JLabel txTenuudai;
    private testlib.RoundedTextField txtDieuKien;
    private javax.swing.JTextField txtFrom;
    private testlib.RoundedTextField txtMauudai;
    private testlib.RoundedTextField txtPhantramgiam;
    private testlib.RoundedTextField txtTenPhim;
    private javax.swing.JTextField txtTimkiemTong;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
