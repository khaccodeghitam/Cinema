
package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;


public class UudaiGUI extends javax.swing.JPanel {

    
    private JButton selectedButton = null;
    
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
        truyxuatNgaykt = new javax.swing.JTextField();
        truyxuatNgaybd = new javax.swing.JTextField();
        ThemUudai = new javax.swing.JPanel();
        MaPhim = new javax.swing.JLabel();
        txtMauudai = new testlib.RoundedTextField();
        TenPhim = new javax.swing.JLabel();
        txtTenPhim = new testlib.RoundedTextField();
        ThoiLuongPhim = new javax.swing.JLabel();
        txtThoiluong = new testlib.RoundedTextField();
        TheloaiPhim = new javax.swing.JLabel();
        txtTheloai = new testlib.RoundedTextField();
        Dotuoi = new javax.swing.JLabel();
        txtTuoi = new testlib.RoundedTextField();
        Ngaychieu = new javax.swing.JLabel();
        txtNgaychieu = new testlib.RoundedTextField();
        btnHuybo = new testlib.RoundedButton();
        btnThemuudai = new testlib.RoundedButton();
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
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
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
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
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
        btnXemtong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2.png"))); // NOI18N
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
            }
        });

        btnExport.setBackground(new java.awt.Color(153, 153, 153));
        btnExport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/export.png"))); // NOI18N
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
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/import.png"))); // NOI18N
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
        ));
        tbUudai.setRowHeight(30);
        tbUudai.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbUudai);

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_i.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa.setContentAreaFilled(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        truyxuatNgaykt.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatNgaykt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatNgaykt.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatNgaykt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatNgaybd.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatNgaybd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatNgaybd.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatNgaybd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                            .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TimkiemUudai, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(txNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(truyxuatNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txNgaybd)))
                        .addGap(19, 19, 19)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txPhantramgiam)
                            .addComponent(truyxuatPhantramgiam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgaykt))
                        .addGap(18, 18, 18)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDieukien)
                            .addComponent(truyxuatDieukien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(truyxuatNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(truyxuatNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        ThoiLuongPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ThoiLuongPhim.setText("Phần trăm giảm:");

        txtThoiluong.setText("Nhập phần trăm giảm");

        TheloaiPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TheloaiPhim.setText("Ngày bắt đầu:");

        txtTheloai.setText("Theo định dạng dd/mm/yyyy");

        Dotuoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dotuoi.setText("Ngày kết thúc:");

        txtTuoi.setText("Theo định dạng dd/mm/yyyy");

        Ngaychieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngaychieu.setText("Điều kiện:");

        txtNgaychieu.setText("Nhập điều kiện");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        btnThemuudai.setBackground(new java.awt.Color(204, 0, 0));
        btnThemuudai.setText("Thêm ưu đãi");
        btnThemuudai.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        javax.swing.GroupLayout ThemUudaiLayout = new javax.swing.GroupLayout(ThemUudai);
        ThemUudai.setLayout(ThemUudaiLayout);
        ThemUudaiLayout.setHorizontalGroup(
            ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemUudaiLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ngaychieu)
                            .addComponent(Dotuoi)
                            .addComponent(TheloaiPhim)
                            .addComponent(ThoiLuongPhim)
                            .addComponent(TenPhim)
                            .addComponent(MaPhim))
                        .addGap(56, 56, 56)
                        .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTheloai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgaychieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtThoiluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMauudai, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(MaPhim)
                    .addComponent(txtMauudai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addComponent(TenPhim)
                        .addGap(37, 37, 37)
                        .addComponent(ThoiLuongPhim))
                    .addGroup(ThemUudaiLayout.createSequentialGroup()
                        .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TheloaiPhim)
                    .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dotuoi)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ThemUudaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ngaychieu)
                    .addComponent(txtNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dotuoi;
    private javax.swing.JPanel GiaodienUudai;
    private javax.swing.JLabel MaPhim;
    private javax.swing.JLabel Ngaychieu;
    private javax.swing.JLabel TenPhim;
    private javax.swing.JLabel TheloaiPhim;
    private javax.swing.JPanel ThemUudai;
    private javax.swing.JLabel ThoiLuongPhim;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JTextField TimkiemUudai;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnThemuudai;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private testlib.RoundedButton buttonTimkiemPhim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbUudai;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatDieukien;
    private javax.swing.JTextField truyxuatNgaybd;
    private javax.swing.JTextField truyxuatNgaykt;
    private javax.swing.JTextField truyxuatPhantramgiam;
    private javax.swing.JTextField truyxuatTenuudai;
    private javax.swing.JLabel txDieukien;
    private javax.swing.JLabel txNgaybd;
    private javax.swing.JLabel txNgaykt;
    private javax.swing.JLabel txPhantramgiam;
    private javax.swing.JLabel txTenuudai;
    private testlib.RoundedTextField txtMauudai;
    private testlib.RoundedTextField txtNgaychieu;
    private testlib.RoundedTextField txtTenPhim;
    private testlib.RoundedTextField txtTheloai;
    private testlib.RoundedTextField txtThoiluong;
    private javax.swing.JTextField txtTimkiemTong;
    private testlib.RoundedTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
