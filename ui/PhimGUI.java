package ui;
        
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;


public class PhimGUI extends javax.swing.JPanel {

    private JButton selectedButton = null;
    
    public PhimGUI() {
        initComponents();
        GiaodienPhim.setLayout(new CardLayout());
        GiaodienPhim.add(View, "View");
        GiaodienPhim.add(ThemPhim, "ThemPhim");
        GiaodienPhim.add(Xemtong, "Xemtong");
        cbDanhsachPhim.setMaximumRowCount(7);
        

        JTableHeader header = tbPhim.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));

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
        ThemPhim = new javax.swing.JPanel();
        DsPhim = new javax.swing.JLabel();
        TenPhim = new javax.swing.JLabel();
        ThoiLuongPhim = new javax.swing.JLabel();
        TheloaiPhim = new javax.swing.JLabel();
        Dotuoi = new javax.swing.JLabel();
        Ngaychieu = new javax.swing.JLabel();
        btnThemPhim = new testlib.RoundedButton();
        btnHuybo = new testlib.RoundedButton();
        txtTuoi = new testlib.RoundedTextField();
        txtTheloai = new testlib.RoundedTextField();
        txtNgaychieu = new testlib.RoundedTextField();
        txtThoiluong = new testlib.RoundedTextField();
        txtTenPhim = new testlib.RoundedTextField();
        MaPhim = new javax.swing.JLabel();
        txtMaPhim = new testlib.RoundedTextField();
        cbDanhsachPhim = new javax.swing.JComboBox<>();
        Xemtong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        Phim.setBackground(new java.awt.Color(153, 153, 153));
        Phim.setPreferredSize(new java.awt.Dimension(1086, 633));

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        btnView.setText("Xem");
        btnView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnView.setContentAreaFilled(false);
        btnView.setDisabledIcon(null);
        btnView.setDisabledSelectedIcon(null);
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
        btnThem.setDisabledIcon(null);
        btnThem.setDisabledSelectedIcon(null);
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
                XemPhim(evt);
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
                {"P01", "SquidGame", "134", "Phiêu lưu", "14", "12/11/1212"},
                {"P02", "Naruto", "114", "Anime", "7", "01/01/1000"},
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
                "Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Độ tuổi", "Ngày công chiếu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbPhim.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbPhim.setInheritsPopupMenu(true);
        tbPhim.setRowHeight(30);
        tbPhim.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbPhim);

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
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
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_i.png"))); // NOI18N
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

        ThemPhim.setBackground(new java.awt.Color(153, 153, 153));

        DsPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        DsPhim.setText("Danh sách phim: ");

        TenPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TenPhim.setText("Tên phim:");

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

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        txtTuoi.setText(" Nhập độ tuổi cho phép xem");

        txtTheloai.setText("Truy xuất thời lượng dựa theo danh sách phim đã bấm");

        txtNgaychieu.setText("Theo định dạng dd/mm/yyyy");

        txtThoiluong.setText("Truy xuất thời lượng dựa theo danh sách phim đã bấm");

        txtTenPhim.setText("Truy xuất tên phim dựa vào danh sách phim đã bấm");

        MaPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        MaPhim.setText("Mã phim");

        txtMaPhim.setText("Nhập mã phim");

        cbDanhsachPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbDanhsachPhim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo dữ liệu phim đã thầu (Hợp đồng)", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));
        cbDanhsachPhim.setBorder(null);

        javax.swing.GroupLayout ThemPhimLayout = new javax.swing.GroupLayout(ThemPhim);
        ThemPhim.setLayout(ThemPhimLayout);
        ThemPhimLayout.setHorizontalGroup(
            ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhimLayout.createSequentialGroup()
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ngaychieu)
                            .addComponent(Dotuoi)
                            .addComponent(TheloaiPhim)
                            .addComponent(ThoiLuongPhim)
                            .addComponent(TenPhim)
                            .addComponent(DsPhim)
                            .addComponent(MaPhim))
                        .addGap(56, 56, 56)
                        .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTheloai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgaychieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtThoiluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDanhsachPhim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        ThemPhimLayout.setVerticalGroup(
            ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhimLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DsPhim)
                    .addComponent(cbDanhsachPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MaPhim)
                    .addComponent(txtMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addComponent(TenPhim)
                        .addGap(37, 37, 37)
                        .addComponent(ThoiLuongPhim))
                    .addGroup(ThemPhimLayout.createSequentialGroup()
                        .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TheloaiPhim)
                    .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dotuoi)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ngaychieu)
                    .addComponent(txtNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        GiaodienPhim.add(ThemPhim, "ThemPhim");

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
                .addComponent(Phim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Phim, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dotuoi;
    private javax.swing.JLabel DsPhim;
    private javax.swing.JPanel GiaodienPhim;
    private javax.swing.JLabel MaPhim;
    private javax.swing.JLabel Ngaychieu;
    private javax.swing.JPanel Phim;
    private javax.swing.JLabel TenPhim;
    private javax.swing.JLabel TheloaiPhim;
    private javax.swing.JPanel ThemPhim;
    private javax.swing.JLabel ThoiLuongPhim;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemPhim;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbPhim;
    private javax.swing.JTable tbXemtong;
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
    private testlib.RoundedTextField txtMaPhim;
    private testlib.RoundedTextField txtNgaychieu;
    private testlib.RoundedTextField txtTenPhim;
    private testlib.RoundedTextField txtTheloai;
    private testlib.RoundedTextField txtThoiluong;
    private javax.swing.JTextField txtTimkiemTong;
    private testlib.RoundedTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
