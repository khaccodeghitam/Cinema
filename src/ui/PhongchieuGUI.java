
package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;


public class PhongchieuGUI extends javax.swing.JPanel {

    private JButton selectedButton = null;
    
    public PhongchieuGUI() {
        initComponents();
        GiaodienPhongchieu.setLayout(new CardLayout());
        GiaodienPhongchieu.add(View, "View");
        GiaodienPhongchieu.add(ThemPhongchieu, "ThemPhongchieu");
        GiaodienPhongchieu.add(Xemtong, "Xemtong");
        
        
        JTableHeader header = tbPhongchieu.getTableHeader(); 
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
        GiaodienPhongchieu = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        Timkiem = new javax.swing.JLabel();
        TimkiemPhongchieu = new javax.swing.JTextField();
        btnTimkiemPhongchieu = new testlib.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongchieu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txSucchua = new javax.swing.JLabel();
        truyxuatSucchua = new javax.swing.JTextField();
        txGiave = new javax.swing.JLabel();
        truyxuatLoaichieu = new javax.swing.JTextField();
        truyxuatGiave = new javax.swing.JTextField();
        txLoaichieu = new javax.swing.JLabel();
        ThemPhongchieu = new javax.swing.JPanel();
        MaPhong = new javax.swing.JLabel();
        txtSucchua = new testlib.RoundedTextField();
        Succhua = new javax.swing.JLabel();
        txtMaPhong = new testlib.RoundedTextField();
        Loaichieu = new javax.swing.JLabel();
        TheloaiPhim = new javax.swing.JLabel();
        txtTheloai = new testlib.RoundedTextField();
        btnHuybo = new testlib.RoundedButton();
        btnThemPhong = new testlib.RoundedButton();
        cbLoaichieu = new javax.swing.JComboBox<>();
        Xemtong = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
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
                ThemPhongchieu(evt);
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
                XemPhongchieu(evt);
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

        GiaodienPhongchieu.setBackground(new java.awt.Color(153, 153, 153));
        GiaodienPhongchieu.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_i.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa.setContentAreaFilled(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemPhongchieu.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemPhongchieu.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemPhongchieu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemPhongchieu.setText("Nhập mã phòng.....");
        TimkiemPhongchieu.setToolTipText("");
        TimkiemPhongchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemPhongchieu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemPhongchieuNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemPhongchieuLammo(evt);
            }
        });

        btnTimkiemPhongchieu.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemPhongchieu.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemPhongchieu.setText("Tìm kiếm");
        btnTimkiemPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        tbPhongchieu.setAutoCreateRowSorter(true);
        tbPhongchieu.setBackground(new java.awt.Color(153, 153, 153));
        tbPhongchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbPhongchieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbPhongchieu.setRowHeight(30);
        tbPhongchieu.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbPhongchieu);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txSucchua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txSucchua.setText("Sức chứa:");

        truyxuatSucchua.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatSucchua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatSucchua.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatSucchua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txGiave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGiave.setText("Giá vé:");

        truyxuatLoaichieu.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatLoaichieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatLoaichieu.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatLoaichieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatGiave.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatGiave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatGiave.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatGiave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txLoaichieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txLoaichieu.setText("Loại chiếu:");

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truyxuatGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(truyxuatSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txSucchua))
                        .addGap(17, 17, 17)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(truyxuatLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txLoaichieu))
                        .addGap(14, 14, 14)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(truyxuatGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGiave)))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(View, "View");

        ThemPhongchieu.setBackground(new java.awt.Color(153, 153, 153));

        MaPhong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        MaPhong.setText("Mã phòng:");

        txtSucchua.setText(" Nhập sức chứa");

        Succhua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Succhua.setText("Sức chứa:");

        txtMaPhong.setText(" Nhập mã phòng");

        Loaichieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Loaichieu.setText("Loại chiếu:");

        TheloaiPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TheloaiPhim.setText("Giá vé:");

        txtTheloai.setText(" Nhập giá vé");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        btnThemPhong.setBackground(new java.awt.Color(204, 0, 0));
        btnThemPhong.setText("Thêm phòng");
        btnThemPhong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        cbLoaichieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbLoaichieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cơ bản", "Blazer", " ", " " }));
        cbLoaichieu.setBorder(null);

        javax.swing.GroupLayout ThemPhongchieuLayout = new javax.swing.GroupLayout(ThemPhongchieu);
        ThemPhongchieu.setLayout(ThemPhongchieuLayout);
        ThemPhongchieuLayout.setHorizontalGroup(
            ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaPhong)
                            .addComponent(TheloaiPhim)
                            .addComponent(Loaichieu)
                            .addComponent(Succhua))
                        .addGap(41, 41, 41)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        ThemPhongchieuLayout.setVerticalGroup(
            ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MaPhong)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addComponent(Succhua)
                        .addGap(37, 37, 37)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loaichieu)
                            .addComponent(cbLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addComponent(txtSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGap(30, 30, 30)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TheloaiPhim)
                    .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(ThemPhongchieu, "ThemPhongchieu");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbXemtong.setCellSelectionEnabled(true);
        tbXemtong.setRowHeight(30);
        tbXemtong.setShowGrid(false);
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText("Nhập mã phòng.....");
        txtTimkiemTong.setToolTipText("");
        txtTimkiemTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiemTong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemTong(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemTongLammo(evt);
            }
        });

        btnTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemTong.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemTong.setText("Tìm kiếm");
        btnTimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienPhongchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(GiaodienPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void TimkiemPhongchieuNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhongchieuNhapchu
        if(TimkiemPhongchieu.getText().equals("Nhập mã phòng.....")){
            TimkiemPhongchieu.setText("");
            TimkiemPhongchieu.setForeground(Color.BLACK);
        }
        else
        TimkiemPhongchieu.selectAll();
    }//GEN-LAST:event_TimkiemPhongchieuNhapchu

    private void TimkiemPhongchieuLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhongchieuLammo
        if(TimkiemPhongchieu.getText().trim().isEmpty()){
            TimkiemPhongchieu.setText("Nhập mã phòng.....");
            TimkiemPhongchieu.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemPhongchieuLammo

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();


        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "View");
    }//GEN-LAST:event_View

    private void ThemPhongchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemPhongchieu
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "ThemPhongchieu");
    }//GEN-LAST:event_ThemPhongchieu

    private void XemPhongchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemPhongchieu
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "Xemtong");
    }//GEN-LAST:event_XemPhongchieu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText("Nhập mã phòng.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    private void TimkiemTong(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemTong
        if(txtTimkiemTong.getText().equals("Nhập mã phòng.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_TimkiemTong


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiaodienPhongchieu;
    private javax.swing.JLabel Loaichieu;
    private javax.swing.JLabel MaPhong;
    private javax.swing.JLabel Succhua;
    private javax.swing.JLabel TheloaiPhim;
    private javax.swing.JPanel ThemPhongchieu;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemPhongchieu;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnThemPhong;
    private testlib.RoundedButton btnTimkiemPhongchieu;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaichieu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbPhongchieu;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatGiave;
    private javax.swing.JTextField truyxuatLoaichieu;
    private javax.swing.JTextField truyxuatSucchua;
    private javax.swing.JLabel txGiave;
    private javax.swing.JLabel txLoaichieu;
    private javax.swing.JLabel txSucchua;
    private testlib.RoundedTextField txtMaPhong;
    private testlib.RoundedTextField txtSucchua;
    private testlib.RoundedTextField txtTheloai;
    private javax.swing.JTextField txtTimkiemTong;
    // End of variables declaration//GEN-END:variables
}
