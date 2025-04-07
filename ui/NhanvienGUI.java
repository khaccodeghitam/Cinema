
package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;


public class NhanvienGUI extends javax.swing.JPanel {

    private JButton selectedButton = null;
    
    public NhanvienGUI() {
        initComponents();
        GiaodienNhanvien.setLayout(new CardLayout());
        GiaodienNhanvien.add(View, "View");
        GiaodienNhanvien.add(Xemtong, "Xemtong");
        
        JTableHeader header = tbNhanvien.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienNhanvien = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        TimkiemNhanvien = new javax.swing.JTextField();
        btnTimkiem = new testlib.RoundedButton();
        btnCapnhat = new javax.swing.JButton();
        btnSathai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanvien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        txManv = new javax.swing.JLabel();
        truyxuatManv = new javax.swing.JTextField();
        txTennv = new javax.swing.JLabel();
        truyxuatTennv = new javax.swing.JTextField();
        txTuoi = new javax.swing.JLabel();
        truyxuatTuoi = new javax.swing.JTextField();
        txGioitinh = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Xemtong = new javax.swing.JPanel();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });

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

        GiaodienNhanvien.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemNhanvien.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemNhanvien.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemNhanvien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemNhanvien.setText(" Nhập nhân viên.....");
        TimkiemNhanvien.setToolTipText("");
        TimkiemNhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemNhanvien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemNhanvienNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemNhanvienLammo(evt);
            }
        });

        btnTimkiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSathai.setBackground(new java.awt.Color(153, 153, 153));
        btnSathai.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnSathai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_i.png"))); // NOI18N
        btnSathai.setText("Sa thải");
        btnSathai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSathai.setContentAreaFilled(false);
        btnSathai.setFocusPainted(false);
        btnSathai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSathai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tbNhanvien.setAutoCreateRowSorter(true);
        tbNhanvien.setBackground(new java.awt.Color(153, 153, 153));
        tbNhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbNhanvien.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbNhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã nhân viên", "Tên nhân viên", "Tuổi", "Giới tính"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNhanvien.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbNhanvien);

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnThem.setContentAreaFilled(false);
        btnThem.setFocusPainted(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txManv.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txManv.setText("Mã nv:");

        truyxuatManv.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatManv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatManv.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatManv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txTennv.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTennv.setText("Tên nv:");

        truyxuatTennv.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTennv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTennv.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTennv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txTuoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTuoi.setText("Độ tuổi: ");

        truyxuatTuoi.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTuoi.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTuoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txGioitinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGioitinh.setText("Giới tính:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Và thêm trực tiếp nhân viên ở trang này luôn");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txManv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txTennv, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(truyxuatTennv, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(truyxuatManv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txGioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(35, 35, 35)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSathai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txManv)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(truyxuatManv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTuoi)
                                .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTennv)
                            .addComponent(truyxuatTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGioitinh)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSathai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        GiaodienNhanvien.add(View, "View");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập nhân viên.....");
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
                "Mã nhân viên", "Tên nhân viên", "Tuổi", "Giới tính", "Ngày vào làm", "Ngày nghỉ việc", "Trạng thái"
            }
        ));
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
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GiaodienNhanvien.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GiaodienNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void TimkiemNhanvienNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemNhanvienNhapchu
        if(TimkiemNhanvien.getText().equals(" Nhập nhân viên.....")){
            TimkiemNhanvien.setText("");
            TimkiemNhanvien.setForeground(Color.BLACK);
        }
        else
        TimkiemNhanvien.selectAll();
    }//GEN-LAST:event_TimkiemNhanvienNhapchu

    private void TimkiemNhanvienLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemNhanvienLammo
        if(TimkiemNhanvien.getText().trim().isEmpty()){
            TimkiemNhanvien.setText(" Nhập nhân viên.....");
            TimkiemNhanvien.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemNhanvienLammo

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();

        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienNhanvien.getLayout();
        card.show(GiaodienNhanvien, "View");
    }//GEN-LAST:event_View

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienNhanvien.getLayout();
        card.show(GiaodienNhanvien, "Xemtong");
    }//GEN-LAST:event_Xemtong

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập nhân viên.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập nhân viên.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiaodienNhanvien;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemNhanvien;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSathai;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnTimkiem;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbNhanvien;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatManv;
    private javax.swing.JTextField truyxuatTennv;
    private javax.swing.JTextField truyxuatTuoi;
    private javax.swing.JLabel txGioitinh;
    private javax.swing.JLabel txManv;
    private javax.swing.JLabel txTennv;
    private javax.swing.JLabel txTuoi;
    private javax.swing.JTextField txtTimkiemTong;
    // End of variables declaration//GEN-END:variables
}
