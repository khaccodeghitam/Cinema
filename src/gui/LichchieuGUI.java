/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import DAO.LichChieuDAO;
import DTO.PhimDTO;
import BUS.LichChieuBUS;
import DTO.LichChieuDTO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class LichchieuGUI extends javax.swing.JPanel {
    ArrayList<LichChieuDTO> dslcHientai = new ArrayList<>();
    private JButton selectedButton = null;
    private LichChieuDAO dao;
    public LichchieuGUI() {
        initComponents();
        GiaodienLichchieu.setLayout(new CardLayout());
        GiaodienLichchieu.add(View, "View");
        GiaodienLichchieu.add(ThemLichchieu, "ThemLichchieu");
        GiaodienLichchieu.add(Xemtong, "Xemtong");
        truyxuatTenphim.setMaximumRowCount(5);
        truyxuatPhongchieu.setMaximumRowCount(5);
        cbTenphim.setMaximumRowCount(7);
        cbPhongchieu.setMaximumRowCount(7);
        
        JTableHeader header = tbLichchieu.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        truyxuatTenphim.setEnabled(false);
        truyxuatPhongchieu.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChonTime = new com.raven.swing.TimePicker();
        ChonlaiGiochieu = new com.raven.swing.TimePicker();
        Lichchieu = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienLichchieu = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        Timkiem = new javax.swing.JLabel();
        TimkiemLichchieu = new javax.swing.JTextField();
        btnTimkiemLichchieu = new testlib.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLichchieu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txTenphim = new javax.swing.JLabel();
        txNgaychieu = new javax.swing.JLabel();
        txGiochieu = new javax.swing.JLabel();
        truyxuatGiochieu = new javax.swing.JTextField();
        txPhongchieu = new javax.swing.JLabel();
        truyxuatTenphim = new javax.swing.JComboBox<>();
        truyxuatPhongchieu = new javax.swing.JComboBox<>();
        dateLcXem = new com.toedter.calendar.JDateChooser();
        ThemLichchieu = new javax.swing.JPanel();
        DsPhim = new javax.swing.JLabel();
        cbTenphim = new javax.swing.JComboBox<>();
        dsPhong = new javax.swing.JLabel();
        Ngaychieu = new javax.swing.JLabel();
        Giochieu = new javax.swing.JLabel();
        txtGiochieu = new testlib.RoundedTextField();
        Tongve = new javax.swing.JLabel();
        txtTongve = new testlib.RoundedTextField();
        HuyThem = new testlib.RoundedButton();
        Themlich = new testlib.RoundedButton();
        cbPhongchieu = new javax.swing.JComboBox<>();
        dateLC = new com.toedter.calendar.JDateChooser();
        Xemtong = new javax.swing.JPanel();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        ChonTime.setForeground(new java.awt.Color(153, 153, 153));
        ChonTime.setDisplayText(txtGiochieu);
        ChonTime.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        ChonlaiGiochieu.setForeground(new java.awt.Color(153, 153, 153));
        ChonlaiGiochieu.setDisplayText(truyxuatGiochieu);
        ChonlaiGiochieu.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        Lichchieu.setBackground(new java.awt.Color(204, 204, 204));

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
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
                BtnView(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
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
                ThemLichchieu(evt);
                loadTPvaPC(evt);
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
                BtnXemTongLC(evt);
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
                xuatExcel(evt);
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

        GiaodienLichchieu.setBackground(new java.awt.Color(153, 153, 153));
        GiaodienLichchieu.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(204, 204, 204));

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
                btnCapNhatLC(evt);
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
                btnXoa(evt);
            }
        });

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemLichchieu.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemLichchieu.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemLichchieu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemLichchieu.setText(" Nhập lịch chiếu.....");
        TimkiemLichchieu.setToolTipText("");
        TimkiemLichchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemLichchieu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemLichchieuNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemLichchieuLammo(evt);
            }
        });

        btnTimkiemLichchieu.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemLichchieu.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemLichchieu.setText("Tìm kiếm");
        btnTimkiemLichchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTimkiemLichchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbLichchieu.setAutoCreateRowSorter(true);
        tbLichchieu.setBackground(new java.awt.Color(204, 204, 204));
        tbLichchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbLichchieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã lịch chiếu", "Mã phim", "Tên phim", "Ngày chiếu", "Giờ chiếu", "Phòng chiếu", "Tổng vé", "Vé trống", "Vé đã mua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLichchieu.setShowVerticalLines(true);
        tbLichchieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                truyXuat(evt);
            }
        });
        jScrollPane1.setViewportView(tbLichchieu);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txTenphim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTenphim.setText("Tên phim:");

        txNgaychieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNgaychieu.setText("Ngày chiếu:");

        txGiochieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGiochieu.setText("Giờ chiếu:");

        truyxuatGiochieu.setBackground(new java.awt.Color(242, 242, 242));
        truyxuatGiochieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatGiochieu.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatGiochieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        truyxuatGiochieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Chonlaigiochieu(evt);
            }
        });

        txPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txPhongchieu.setText("Phòng chiếu:");

        truyxuatTenphim.setBackground(new java.awt.Color(242, 242, 242));
        truyxuatTenphim.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        truyxuatTenphim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất khi nhấp vào table trên", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9", "10", " " }));
        truyxuatTenphim.setBorder(null);

        truyxuatPhongchieu.setBackground(new java.awt.Color(242, 242, 242));
        truyxuatPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        truyxuatPhongchieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất khi nhấp vào table trên", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9", "10" }));
        truyxuatPhongchieu.setBorder(null);

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addComponent(txTenphim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(truyxuatTenphim, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addComponent(txPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(truyxuatPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txGiochieu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(truyxuatGiochieu, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addComponent(dateLcXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(33, 33, 33)
                                .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txTenphim)
                                .addComponent(truyxuatTenphim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txPhongchieu)
                                .addComponent(truyxuatPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txNgaychieu)
                            .addComponent(dateLcXem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txGiochieu)
                            .addComponent(truyxuatGiochieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        GiaodienLichchieu.add(View, "View");

        ThemLichchieu.setBackground(new java.awt.Color(204, 204, 204));

        DsPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        DsPhim.setText("Danh sách phim: ");

        cbTenphim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbTenphim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo dữ liệu Phim", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));
        cbTenphim.setBorder(null);
        cbTenphim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenphimActionPerformed(evt);
            }
        });

        dsPhong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        dsPhong.setText("Danh sách phòng:");

        Ngaychieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngaychieu.setText("Ngày chiếu:");

        Giochieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Giochieu.setText("Giờ chiếu:");

        txtGiochieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moGDchon(evt);
            }
        });

        Tongve.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Tongve.setText("Tổng vé:");

        txtTongve.setText("Truy xuất \"sức chứa\" theo phòng");

        HuyThem.setText("Hủy bỏ");
        HuyThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        HuyThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuy(evt);
            }
        });

        Themlich.setBackground(new java.awt.Color(204, 0, 0));
        Themlich.setText("Thêm lịch");
        Themlich.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Themlich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLC(evt);
            }
        });

        cbPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbPhongchieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo dữ liệu Phòng chiếu", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout ThemLichchieuLayout = new javax.swing.GroupLayout(ThemLichchieu);
        ThemLichchieu.setLayout(ThemLichchieuLayout);
        ThemLichchieuLayout.setHorizontalGroup(
            ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemLichchieuLayout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThemLichchieuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HuyThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(Themlich, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThemLichchieuLayout.createSequentialGroup()
                        .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tongve)
                            .addComponent(Giochieu)
                            .addComponent(Ngaychieu)
                            .addComponent(DsPhim)
                            .addComponent(dsPhong))
                        .addGap(56, 56, 56)
                        .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGiochieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTenphim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(145, 145, 145))
        );
        ThemLichchieuLayout.setVerticalGroup(
            ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemLichchieuLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DsPhim)
                    .addComponent(cbTenphim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dsPhong)
                    .addComponent(cbPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ThemLichchieuLayout.createSequentialGroup()
                        .addComponent(Ngaychieu)
                        .addGap(37, 37, 37)
                        .addComponent(Giochieu))
                    .addGroup(ThemLichchieuLayout.createSequentialGroup()
                        .addComponent(dateLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGiochieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tongve)
                    .addComponent(txtTongve, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(ThemLichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HuyThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Themlich, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        GiaodienLichchieu.add(ThemLichchieu, "ThemLichchieu");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập lịch chiếu.....");
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
                btnTimKiemTong(evt);
            }
        });

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
                "Mã lịch", "Tên phim", "Ngày chiếu", "Giờ chiếu", "Phòng chiếu", "Tổng vé", "Vé đã bán", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbXemtong.setRowHeight(30);
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GiaodienLichchieu.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout LichchieuLayout = new javax.swing.GroupLayout(Lichchieu);
        Lichchieu.setLayout(LichchieuLayout);
        LichchieuLayout.setHorizontalGroup(
            LichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LichchieuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(LichchieuLayout.createSequentialGroup()
                .addGroup(LichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienLichchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LichchieuLayout.setVerticalGroup(
            LichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichchieuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LichchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(GiaodienLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lichchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lichchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemLichchieuNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemLichchieuNhapchu
        if(TimkiemLichchieu.getText().equals(" Nhập lịch chiếu.....")){
            TimkiemLichchieu.setText("");
            TimkiemLichchieu.setForeground(Color.BLACK);
        }
        else
        TimkiemLichchieu.selectAll();
    }//GEN-LAST:event_TimkiemLichchieuNhapchu

    private void TimkiemLichchieuLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemLichchieuLammo
        if(TimkiemLichchieu.getText().trim().isEmpty()){
            TimkiemLichchieu.setText(" Nhập lịch chiếu.....");
            TimkiemLichchieu.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemLichchieuLammo

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();


       if (selectedButton != null && selectedButton != clickedButton) {
           selectedButton.setBorder(UIManager.getBorder("Button.border"));
       }

       selectedButton = clickedButton;
       selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienLichchieu.getLayout();
        card.show(GiaodienLichchieu, "View");
    }//GEN-LAST:event_View

    private void ThemLichchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemLichchieu
        CardLayout card = (CardLayout) GiaodienLichchieu.getLayout();
        card.show(GiaodienLichchieu, "ThemLichchieu");
    }//GEN-LAST:event_ThemLichchieu

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienLichchieu.getLayout();
        card.show(GiaodienLichchieu, "Xemtong");
    }//GEN-LAST:event_Xemtong

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập lịch chiếu.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập lịch chiếu.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo
    public void loadComboBoxData() {
        LichChieuDAO dao = new LichChieuDAO();
        ArrayList<String> danhSachTenPhim = dao.layDanhSachTenPhim();
        ArrayList<String> danhSachPhongPhim = dao.layDanhSachPhongPhim();

        truyxuatTenphim.removeAllItems();
        for (String phim : danhSachTenPhim) {
            truyxuatTenphim.addItem(phim);
        }

        truyxuatPhongchieu.removeAllItems();
        for (String phong : danhSachPhongPhim) {
            truyxuatPhongchieu.addItem(phong);
        }
}

    private void BtnView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnView
        // TODO add your handling code here:
        LichChieuBUS bus=new LichChieuBUS();
        loadComboBoxData();
        if(LichChieuBUS.dslc!=null){
            
        }else{
            bus.docdslc();
        }
        Vector header=new Vector();
        header.add("ma lich chieu");
        header.add("ten phim");
        header.add("ngay chieu");
        header.add("gio chieu");
        header.add("phong chieu");
        header.add("tong ve");
        header.add("ve da ban"); 
        header.add("ve con lai"); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        DefaultTableModel model=new DefaultTableModel(header,0);
        for(LichChieuDTO lc:LichChieuBUS.dslc){
            Vector row=new Vector();
            row.add(lc.ma_lich_chieu);

            row.add(lc.ten_phim);
            row.add(sdf.format(lc.ngay_chieu));
            row.add(timeFormat.format(lc.gio_chieu));
            row.add(lc.phong_chieu);
            row.add(lc.tong_ve);
            row.add(lc.ve_da_ban);
            row.add(lc.tong_ve-lc.ve_da_ban);
            model.addRow(row);
        }
        dslcHientai = bus.dslc;
        tbLichchieu.setModel(model);
    }//GEN-LAST:event_BtnView

    private void BtnXemTongLC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXemTongLC
        // TODO add your handling code here:
        LichChieuBUS bus = new LichChieuBUS();
        bus.docdslcDD();
        Vector header = new Vector();
        header.add("ma lich chieu");
        header.add("ten phim");
        header.add("ngay chieu");
        header.add("gio chieu");
        header.add("phong chieu");
        header.add("tong ve");
        header.add("ve da ban"); 
        header.add("ve trong");
        header.add("trang thai");
        DefaultTableModel model = new DefaultTableModel(header, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        // duyệt đúng mảng đã load
        for (LichChieuDTO lc : LichChieuBUS.dslcDD) {
            Vector row = new Vector();
            row.add(lc.ma_lich_chieu);
            row.add(lc.ten_phim);
            row.add(sdf.format(lc.ngay_chieu));
            row.add(timeFormat.format(lc.gio_chieu));
            row.add(lc.phong_chieu);
            row.add(lc.tong_ve);
            row.add(lc.ve_da_ban);
            row.add(lc.ve_trong=lc.tong_ve-lc.ve_da_ban);
            String trangThaiText = (lc.trang_thai == 0) ? "Chưa xoá" : "Đã ẩn";
            row.add(trangThaiText);
            model.addRow(row);
        }

        tbXemtong.setModel(model);


    }//GEN-LAST:event_BtnXemTongLC

    private void truyXuat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_truyXuat
        // TODO add your handling code here:
        int i = tbLichchieu.getSelectedRow();

        if (i >= 0 && i < dslcHientai.size()) {
            LichChieuDTO lc = dslcHientai.get(i);
            truyxuatTenphim.setSelectedItem(lc.ten_phim.trim());
            truyxuatPhongchieu.setSelectedItem(lc.phong_chieu.trim());

            // Ngày chiếu: vì truyxuatNgayChieu là JDateChooser
            dateLcXem.setDate(lc.ngay_chieu);

            // Giờ chiếu
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            truyxuatGiochieu.setText(timeFormat.format(lc.gio_chieu));
        }

    }//GEN-LAST:event_truyXuat
    
    private void btnThemLC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLC
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        LichChieuDAO dao = new LichChieuDAO();
        LichChieuBUS bus = new LichChieuBUS();
        LichChieuDTO lc = new LichChieuDTO();
        lc.ma_lich_chieu = dao.taoMaLichChieuMoi();
        lc.ten_phim = cbTenphim.getSelectedItem().toString().trim();
        lc.phong_chieu = cbPhongchieu.getSelectedItem().toString().trim();
        lc.tong_ve = Integer.parseInt(txtTongve.getText().trim());



        
        // Kiểm tra ngày chiếu
        if (dateLC.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày chiếu!");
            return;
        }

        lc.ngay_chieu = dateLC.getDate();

        // Lấy ngày hiện tại (chỉ tính ngày, bỏ giờ)
        java.util.Date now = new java.util.Date();
        String nowStr = sdf.format(now);
        String selectedDateStr = sdf.format(lc.ngay_chieu);

        try {
            java.util.Date nowDateOnly = sdf.parse(nowStr);
            java.util.Date selectedDateOnly = sdf.parse(selectedDateStr);

            if (selectedDateOnly.before(nowDateOnly)) {
                JOptionPane.showMessageDialog(null, "Ngày chiếu phải từ hôm nay trở đi!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Kiểm tra giờ chiếu
        java.util.Date utilDateGioChieu;
        try {
            utilDateGioChieu = timeFormat.parse(txtGiochieu.getText().trim());
            lc.gio_chieu = new java.sql.Time(utilDateGioChieu.getTime());
        } catch (java.text.ParseException pe) {
            JOptionPane.showMessageDialog(null, "Giờ phải đúng định dạng hh:mm");
            return;
        }

        // Nếu ngày chiếu = ngày hôm nay, thì kiểm tra giờ
        if (selectedDateStr.equals(nowStr)) {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            int currentHour = cal.get(java.util.Calendar.HOUR_OF_DAY);
            int currentMinute = cal.get(java.util.Calendar.MINUTE);

            java.util.Calendar gioChieuCal = java.util.Calendar.getInstance();
            gioChieuCal.setTime(utilDateGioChieu);

            if (gioChieuCal.get(java.util.Calendar.HOUR_OF_DAY) < currentHour ||
                (gioChieuCal.get(java.util.Calendar.HOUR_OF_DAY) == currentHour &&
                 gioChieuCal.get(java.util.Calendar.MINUTE) < currentMinute)) {
                JOptionPane.showMessageDialog(null, "Giờ chiếu phải lớn hơn giờ hiện tại nếu chiếu trong ngày hôm nay!");
                return;
            }
        }

        // === Kiểm tra trùng lịch trong dslc ===
        for (LichChieuDTO lcDaCo : bus.dslc) {
            if (lc.phong_chieu.equals(lcDaCo.phong_chieu)
                && sdf.format(lc.ngay_chieu).equals(sdf.format(lcDaCo.ngay_chieu))) {

                long khoangCachMillis = Math.abs(lc.gio_chieu.getTime() - lcDaCo.gio_chieu.getTime());
                long khoangCachGio = khoangCachMillis / (1000 * 60 * 60);

                if (khoangCachGio < 3) {
                    JOptionPane.showMessageDialog(null, "Giờ chiếu phải cách nhau ít nhất 3 tiếng nếu cùng phòng và ngày!");
                    return;
                }
            }
        }

        // Thêm vào danh sách và database
        bus.themdsud(lc);

        // Cập nhật table
        DefaultTableModel model = (DefaultTableModel) tbLichchieu.getModel();
        Vector row = new Vector();
        row.add(lc.ma_lich_chieu);
        row.add(lc.ten_phim);
        row.add(sdf.format(lc.ngay_chieu));
        row.add(timeFormat.format(lc.gio_chieu));
        row.add(lc.phong_chieu);
        row.add(lc.tong_ve);
        row.add(lc.tong_ve - lc.ve_da_ban);
        model.addRow(row);
        tbLichchieu.setModel(model);

        JOptionPane.showMessageDialog(null, "Thêm lịch chiếu thành công!");

        txtTongve.setText("");
        txtGiochieu.setText("");

    }//GEN-LAST:event_btnThemLC

    private void loadTPvaPC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTPvaPC
        // TODO add your handling code here:
        LichChieuDAO dao = new LichChieuDAO();
        ArrayList<String> danhSachTenPhim = dao.layDanhSachTenPhim();
        ArrayList<String> danhSachPhongPhim = dao.layDanhSachPhongPhim();
        cbPhongchieu.removeAllItems();
        for(String ma : danhSachPhongPhim){
            cbPhongchieu.addItem(ma);
        }
        
        cbPhongchieu.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedMaPhong = (String) cbPhongchieu.getSelectedItem();
        if (selectedMaPhong != null) {
            // Gọi DAO để lấy sức chứa
            LichChieuDAO pcDAO = new LichChieuDAO(); // Mày phải có DAO này
            int sucChua = pcDAO.laySucChua(selectedMaPhong); // Giả sử có hàm này
            txtTongve.setText(String.valueOf(sucChua));
        }
    }
});
        
        cbTenphim.removeAllItems(); // Xóa item cũ
        for (String p : danhSachTenPhim) {
            cbTenphim.addItem(p);
        }
        
    }//GEN-LAST:event_loadTPvaPC

    private void btnHuy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuy
        // TODO add your handling code here:
        txtTongve.setText("");
        
        txtGiochieu.setText("");
    }//GEN-LAST:event_btnHuy

    private void btnCapNhatLC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatLC
        // TODO add your handling code here:
        int i = tbLichchieu.getSelectedRow();
        if (i >= 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

            LichChieuDTO lc = new LichChieuDTO();
            lc.ma_lich_chieu = tbLichchieu.getValueAt(i, 0).toString();

            Object selectedPhim = truyxuatTenphim.getSelectedItem();
            Object selectedPhong = truyxuatPhongchieu.getSelectedItem();
            if (selectedPhim == null || selectedPhong == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn Tên phim và Phòng chiếu hợp lệ!");
                return;
            }

            lc.ten_phim = selectedPhim.toString().trim();
            lc.phong_chieu = selectedPhong.toString().trim();

            // Ngày chiếu lấy từ JDateChooser
            if (dateLcXem.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày chiếu hợp lệ!");
                return;
            }
            lc.ngay_chieu = dateLcXem.getDate();

            // Kiểm tra ngày chiếu phải >= hôm nay
            java.util.Date now = new java.util.Date();
            String nowStr = sdf.format(now);
            String selectedDateStr = sdf.format(lc.ngay_chieu);

            try {
                java.util.Date nowDateOnly = sdf.parse(nowStr);
                java.util.Date selectedDateOnly = sdf.parse(selectedDateStr);

                if (selectedDateOnly.before(nowDateOnly)) {
                    JOptionPane.showMessageDialog(null, "Ngày chiếu phải từ hôm nay trở đi!");
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            // Giờ chiếu
            java.util.Date utilDateGioChieu;
            try {
                utilDateGioChieu = timeFormat.parse(truyxuatGiochieu.getText().trim());
                lc.gio_chieu = new java.sql.Time(utilDateGioChieu.getTime());
            } catch (java.text.ParseException pe) {
                JOptionPane.showMessageDialog(null, "Giờ chiếu không hợp lệ (HH:mm)");
                return;
            }

            // Nếu ngày chiếu là hôm nay thì kiểm tra giờ
            if (selectedDateStr.equals(nowStr)) {
                java.util.Calendar cal = java.util.Calendar.getInstance();
                int currentHour = cal.get(java.util.Calendar.HOUR_OF_DAY);
                int currentMinute = cal.get(java.util.Calendar.MINUTE);

                java.util.Calendar gioChieuCal = java.util.Calendar.getInstance();
                gioChieuCal.setTime(utilDateGioChieu);

                if (gioChieuCal.get(java.util.Calendar.HOUR_OF_DAY) < currentHour ||
                    (gioChieuCal.get(java.util.Calendar.HOUR_OF_DAY) == currentHour &&
                     gioChieuCal.get(java.util.Calendar.MINUTE) < currentMinute)) {
                    JOptionPane.showMessageDialog(null, "Giờ chiếu phải lớn hơn giờ hiện tại nếu chiếu trong ngày hôm nay!");
                    return;
                }
            }

            // 💥 Kiểm tra trùng lịch trước khi cập nhật
            for (LichChieuDTO lichChieuKhac : dslcHientai) {
                if (lichChieuKhac.getMa_lich_chieu().equals(lc.ma_lich_chieu)) {
                    continue; // Bỏ qua chính nó
                }
                if (lichChieuKhac.getPhong_chieu().trim().equals(lc.phong_chieu.trim()) &&
                    sdf.format(lichChieuKhac.getNgay_chieu()).equals(sdf.format(lc.ngay_chieu))) {
                    long millisDiff = Math.abs(lc.gio_chieu.getTime() - lichChieuKhac.getGio_chieu().getTime());
                    long hoursDiff = millisDiff / (1000 * 60 * 60);

                    if (hoursDiff < 3) {
                        JOptionPane.showMessageDialog(null, "Giờ chiếu phải cách nhau ít nhất 3 tiếng với lịch chiếu khác trong cùng phòng!");
                        return;
                    }
                }
            }

            // Cập nhật vào database và list
            LichChieuBUS bus = new LichChieuBUS();
            bus.updatedsud(lc);

            DefaultTableModel model = (DefaultTableModel) tbLichchieu.getModel();
            model.setValueAt(lc.ten_phim, i, 1);
            model.setValueAt(sdf.format(lc.ngay_chieu), i, 2);
            model.setValueAt(timeFormat.format(lc.gio_chieu), i, 3);
            model.setValueAt(lc.phong_chieu, i, 4);

            JOptionPane.showMessageDialog(null, "Cập nhật lịch chiếu thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần cập nhật!");
        }

        
    }//GEN-LAST:event_btnCapNhatLC

    private void btnXoa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa
        // TODO add your handling code here:
        int i = tbLichchieu.getSelectedRow();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

        if(i>=0){
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Bạn có chắc chắn muốn xoá ưu đãi này?", 
                "Xác nhận xoá", 
                JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){
                String maLC=tbLichchieu.getValueAt(i, 0).toString();
                LichChieuBUS bus = new LichChieuBUS();
                bus.xoaLichChieu(maLC); // Cập nhật trạng thái = 1

                JOptionPane.showMessageDialog(null, "Xoá thành công!");

                // Cập nhật lại bảng - giả sử đang ở chế độ XEM thông thường
                bus.docdslc(); // nếu ở XEM TỔNG thì dùng bus.docdsudDD();

                // Làm mới model
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ma lich chieu");
                model.addColumn("ten phim");
                model.addColumn("ngay chieu");
                model.addColumn("gio chieu");
                model.addColumn("phong chieu");
                model.addColumn("tong ve");
                model.addColumn("ve da ban");

                for (LichChieuDTO lc : LichChieuBUS.dslc) {
                    Vector row = new Vector();
                    row.add(lc.ma_lich_chieu);
                    row.add(lc.ten_phim);
                    row.add(sdf.format(lc.ngay_chieu));
                    row.add(timeFormat.format(lc.gio_chieu));
                    row.add(lc.phong_chieu);
                    row.add(lc.tong_ve);       
                    model.addRow(row);
                }

                tbLichchieu.setModel(model);
            }
                
        }
    }//GEN-LAST:event_btnXoa

    private void btnTimKiem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem
        // TODO add your handling code here:
        String key = TimkiemLichchieu.getText();
        LichChieuBUS bus = new LichChieuBUS();
        ArrayList<LichChieuDTO> dskq;
        if (key.isEmpty()) {
            if (LichChieuBUS.dslc == null) {
                bus.docdslc();
            }
            dskq = LichChieuBUS.dslc;
        } else {
            dskq = bus.timKiem(key);
        }
        DefaultTableModel model = (DefaultTableModel) tbLichchieu.getModel();
        model.setRowCount(0);

        for (LichChieuDTO lc : dskq) {
            model.addRow(new Object[]{
                lc.getMa_lich_chieu(),
                lc.getTen_phim(),
                lc.getNgay_chieu(),
                lc.getGio_chieu(),
                lc.getPhong_chieu(),
                lc.getTong_ve(),
                lc.getVe_da_ban(),
                lc.getTong_ve()-lc.getVe_da_ban(),
            });
        }
        dslcHientai = dskq;
        if (dskq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiem

    private void btnTimKiemTong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTong
        // TODO add your handling code here:
        String key = txtTimkiemTong.getText();
        LichChieuBUS bus = new LichChieuBUS();
        ArrayList<LichChieuDTO> dskq;
        if (key.isEmpty()) {
            if (LichChieuBUS.dslcDD == null) {
                bus.docdslcDD();
            }
            dskq = LichChieuBUS.dslcDD;
        } else {
            dskq = bus.timKiemDD(key);
        }
        DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
        model.setRowCount(0);

        for (LichChieuDTO lc : dskq) {
            model.addRow(new Object[]{
                lc.getMa_lich_chieu(),
                lc.getTen_phim(),
                lc.getNgay_chieu(),
                lc.getGio_chieu(),
                lc.getPhong_chieu(),
                lc.getTong_ve(),
                lc.getVe_da_ban(),
                lc.getVe_trong(),
                (lc.getTrang_thai() == 0) ? "Chưa ẩn" : "Đã ẩn"
            });
        }

        if (dskq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemTong

    private void cbTenphimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenphimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTenphimActionPerformed

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
            LichChieuBUS lichChieuBUS = new LichChieuBUS();
            lichChieuBUS.docExcel(file.getAbsolutePath()); // Đọc file từ đường dẫn

            // Sau khi đọc xong, lấy danh sách lịch chiếu
            ArrayList<LichChieuDTO> dsLichChieu = lichChieuBUS.dslc;

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Đọc file Excel thành công!");

            // (Tùy chọn) Hiển thị kết quả ra bảng hoặc console
            for (LichChieuDTO lichChieu : dsLichChieu) {
                System.out.println(lichChieu.getMa_lich_chieu() + " - " + lichChieu.getTen_phim());
            }

            // (Tùy chọn) Bạn có thể cập nhật bảng hoặc giao diện để hiển thị dữ liệu vừa đọc

        } catch (Exception e) {
            // Xử lý lỗi nếu có
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đọc file Excel: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_themExcel

    private void xuatExcel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatExcel
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
        LichChieuBUS.exportExcel(filePath);
        
        // Thông báo thành công
        JOptionPane.showMessageDialog(null, "Đã xuất thành công ra file: " + filePath);
    } else {
        // Người dùng hủy chọn
        JOptionPane.showMessageDialog(null, "Hủy xuất file.");
    }    
    
    }//GEN-LAST:event_xuatExcel

    private void moGDchon(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moGDchon
        ChonTime.showPopup(this, 80, 165);
    }//GEN-LAST:event_moGDchon

    private void Chonlaigiochieu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chonlaigiochieu
        ChonlaiGiochieu.showPopup(this, 80, 165);
    }//GEN-LAST:event_Chonlaigiochieu


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TimePicker ChonTime;
    private com.raven.swing.TimePicker ChonlaiGiochieu;
    private javax.swing.JLabel DsPhim;
    private javax.swing.JPanel GiaodienLichchieu;
    private javax.swing.JLabel Giochieu;
    private testlib.RoundedButton HuyThem;
    private javax.swing.JPanel Lichchieu;
    private javax.swing.JLabel Ngaychieu;
    private javax.swing.JPanel ThemLichchieu;
    private testlib.RoundedButton Themlich;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemLichchieu;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JLabel Tongve;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnTimkiemLichchieu;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbPhongchieu;
    private javax.swing.JComboBox<String> cbTenphim;
    private com.toedter.calendar.JDateChooser dateLC;
    private com.toedter.calendar.JDateChooser dateLcXem;
    private javax.swing.JLabel dsPhong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbLichchieu;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatGiochieu;
    private javax.swing.JComboBox<String> truyxuatPhongchieu;
    private javax.swing.JComboBox<String> truyxuatTenphim;
    private javax.swing.JLabel txGiochieu;
    private javax.swing.JLabel txNgaychieu;
    private javax.swing.JLabel txPhongchieu;
    private javax.swing.JLabel txTenphim;
    private testlib.RoundedTextField txtGiochieu;
    private javax.swing.JTextField txtTimkiemTong;
    private testlib.RoundedTextField txtTongve;
    // End of variables declaration//GEN-END:variables
}
