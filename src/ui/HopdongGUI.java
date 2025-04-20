
package ui;

import DAO.HopDongDAO;
import DAO.PhimDAO;
import DTO.HopDongDTO;
import DTO.PhimDTO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import java.util.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.event.*;

public class HopdongGUI extends javax.swing.JPanel {

    private JButton selectedButton = null;
     private HopDongDAO hopDongDAO = new HopDongDAO();
    private PhimDAO phimDAO = new PhimDAO();
    
    public HopdongGUI() {
        initComponents();   
        GiaodienHopdong.setLayout(new CardLayout());
        GiaodienHopdong.add(View, "View");
        GiaodienHopdong.add(Kihopdong, "Kihopdong");
        GiaodienHopdong.add(Xemtong, "Xemtong");
        

        JTableHeader header = tbHopdong.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));

            // Gọi phương thức để hiển thị dữ liệu hợp đồng
        hienThiDuLieuHopDong();
        
        // Thêm sự kiện tìm kiếm
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemHopDong();
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnKihopdong = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        Sodu = new javax.swing.JLabel();
        Tien = new javax.swing.JLabel();
        btnNaptien = new testlib.RoundedButton();
        GiaodienHopdong = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new testlib.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHopdong = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txPhim = new javax.swing.JLabel();
        txThoiluong = new javax.swing.JLabel();
        txSosuatchieu = new javax.swing.JLabel();
        truyxuatSosuatchieu = new javax.swing.JTextField();
        truyxuatThoiluong = new javax.swing.JTextField();
        truyxuatPhim = new javax.swing.JTextField();
        txGiathau = new javax.swing.JLabel();
        txNguoiki = new javax.swing.JLabel();
        truyxuatNguoiki = new javax.swing.JTextField();
        truyxuatGiathau = new javax.swing.JTextField();
        txNhaphanphoi = new javax.swing.JLabel();
        truyxuatNhaphanphoi = new javax.swing.JTextField();
        Kihopdong = new javax.swing.JPanel();
        DsPhim = new javax.swing.JLabel();
        cbDanhsachPhim = new javax.swing.JComboBox<>();
        Mahopdong = new javax.swing.JLabel();
        txtMahopdong = new testlib.RoundedTextField();
        Thoiluong = new javax.swing.JLabel();
        txtThoiluong = new testlib.RoundedTextField();
        Sosuatchieu = new javax.swing.JLabel();
        txtSosuatchieu = new testlib.RoundedTextField();
        Giathau = new javax.swing.JLabel();
        txtGiathau = new testlib.RoundedTextField();
        Ngayki = new javax.swing.JLabel();
        txtNgayki = new testlib.RoundedTextField();
        btnHuybo = new testlib.RoundedButton();
        btnKihd = new testlib.RoundedButton();
        Nhaphanphoi = new javax.swing.JLabel();
        cbNhaphanphoi = new javax.swing.JComboBox<>();
        Sosuatchieu1 = new javax.swing.JLabel();
        txtSosuatchieu1 = new testlib.RoundedTextField();
        Xemtong = new javax.swing.JPanel();
        Timkiem1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txtTimkiem2 = new javax.swing.JTextField();
        btnTimkiem2 = new testlib.RoundedButton();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

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
            }
        });

        btnKihopdong.setBackground(new java.awt.Color(153, 153, 153));
        btnKihopdong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnKihopdong.setText("Kí hợp đồng");
        btnKihopdong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKihopdong.setContentAreaFilled(false);
        btnKihopdong.setFocusPainted(false);
        btnKihopdong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKihopdong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKihopdong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnKihopdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kihopdong(evt);
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

        Sodu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Sodu.setText("Số dư khả dụng:");

        Tien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Tien.setText("1000000");

        btnNaptien.setBackground(new java.awt.Color(204, 204, 204));
        btnNaptien.setForeground(new java.awt.Color(0, 0, 0));
        btnNaptien.setText("Nạp thêm");

        GiaodienHopdong.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        txtTimkiem.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiem.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiem.setText(" Nhập tên phim.....");
        txtTimkiem.setToolTipText("");
        txtTimkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemLammo(evt);
            }
        });

        btnTimkiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        tbHopdong.setAutoCreateRowSorter(true);
        tbHopdong.setBackground(new java.awt.Color(153, 153, 153));
        tbHopdong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbHopdong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbHopdong.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Tên phim", "Thời lượng", "Số suất chiếu", "Giá thầu", "Nhà phân phối", "Người kí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbHopdong.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbHopdong);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txPhim.setText("Tên phim:");

        txThoiluong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txThoiluong.setText("Thời lượng:");

        txSosuatchieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txSosuatchieu.setText("Số suất chiếu:");

        truyxuatSosuatchieu.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatSosuatchieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatSosuatchieu.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatSosuatchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatThoiluong.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatThoiluong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatThoiluong.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatThoiluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatPhim.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatPhim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatPhim.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatPhim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txGiathau.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGiathau.setText("Giá thầu:");

        txNguoiki.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNguoiki.setText("Người kí:");

        truyxuatNguoiki.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatNguoiki.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatNguoiki.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatNguoiki.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatGiathau.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatGiathau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatGiathau.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatGiathau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txNhaphanphoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txNhaphanphoi.setText("Nhà phân phối:");

        truyxuatNhaphanphoi.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatNhaphanphoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatNhaphanphoi.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatNhaphanphoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txThoiluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txSosuatchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(truyxuatThoiluong, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(truyxuatPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(truyxuatSosuatchieu))))
                        .addGap(60, 60, 60)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txGiathau, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNguoiki, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNhaphanphoi))
                        .addGap(18, 18, 18)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(truyxuatGiathau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(truyxuatNguoiki, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(truyxuatNhaphanphoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(truyxuatNguoiki, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(truyxuatNhaphanphoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Timkiem)
                            .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPhim)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(truyxuatPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txGiathau)
                                .addComponent(truyxuatGiathau, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong)
                            .addComponent(truyxuatThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNguoiki))
                        .addGap(18, 18, 18)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txSosuatchieu)
                            .addComponent(truyxuatSosuatchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNhaphanphoi))))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        GiaodienHopdong.add(View, "card2");

        Kihopdong.setBackground(new java.awt.Color(153, 153, 153));

        DsPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        DsPhim.setText("Danh sách phim: ");

        cbDanhsachPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbDanhsachPhim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo dsp của npp", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));
        cbDanhsachPhim.setBorder(null);

        Mahopdong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Mahopdong.setText("Mã hợp đồng:");

        txtMahopdong.setText("Tự động tạo mã");

        Thoiluong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Thoiluong.setText("Thời lượng");

        txtThoiluong.setText("Truy xuất thời lượng dựa theo danh sách phim đã bấm");

        Sosuatchieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Sosuatchieu.setText("Số suất chiếu:");

        txtSosuatchieu.setText("Nhập suất chiếu");

        Giathau.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Giathau.setText("Giá thầu:");

        txtGiathau.setText("Dựa vào phim và suất chiếu để tính giá tiền");

        Ngayki.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Ngayki.setText("Ngày kí:");

        txtNgayki.setText("Theo định dạng dd/mm/yyyy");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        btnKihd.setBackground(new java.awt.Color(204, 0, 0));
        btnKihd.setText("Kí hợp đồng");
        btnKihd.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        Nhaphanphoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Nhaphanphoi.setText("Nhà phân phối:");

        cbNhaphanphoi.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbNhaphanphoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất theo nhà phân phối", "Item 2", "Item 3", "Item 4", "5", "6", "7", "8", "9" }));
        cbNhaphanphoi.setBorder(null);

        Sosuatchieu1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Sosuatchieu1.setText("Thể loại:");

        txtSosuatchieu1.setText("Truy xuất thể loại theo danh sách phim");

        javax.swing.GroupLayout KihopdongLayout = new javax.swing.GroupLayout(Kihopdong);
        Kihopdong.setLayout(KihopdongLayout);
        KihopdongLayout.setHorizontalGroup(
            KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KihopdongLayout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KihopdongLayout.createSequentialGroup()
                        .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnKihd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KihopdongLayout.createSequentialGroup()
                        .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ngayki)
                            .addComponent(Giathau)
                            .addComponent(Sosuatchieu)
                            .addComponent(Thoiluong)
                            .addComponent(DsPhim)
                            .addComponent(Mahopdong)
                            .addComponent(Nhaphanphoi)
                            .addComponent(Sosuatchieu1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGiathau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtThoiluong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMahopdong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDanhsachPhim, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNhaphanphoi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSosuatchieu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSosuatchieu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(273, 273, 273))))
        );
        KihopdongLayout.setVerticalGroup(
            KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KihopdongLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nhaphanphoi)
                    .addComponent(cbNhaphanphoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DsPhim)
                    .addComponent(cbDanhsachPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mahopdong)
                    .addComponent(txtMahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Thoiluong)
                    .addComponent(txtThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSosuatchieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sosuatchieu1))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sosuatchieu)
                    .addComponent(txtSosuatchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Giathau)
                    .addComponent(txtGiathau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ngayki)
                    .addComponent(txtNgayki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(KihopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKihd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        GiaodienHopdong.add(Kihopdong, "card3");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem1.setText("Tìm kiếm:");

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Tên phim", "Thời lượng", "Giá thầu", "Ngày kí", "Số suất chiếu", "Suất đã chiếu", "Nhà phân phối", "Người kí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        txtTimkiem2.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiem2.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiem2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiem2.setText(" Nhập tên phim.....");
        txtTimkiem2.setToolTipText("");
        txtTimkiem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiem2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiem2Nhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiem2Lammo(evt);
            }
        });

        btnTimkiem2.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiem2.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiem2.setText("Tìm kiếm");
        btnTimkiem2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, XemtongLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Timkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE))
                        .addGap(941, 941, 941)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Timkiem1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GiaodienHopdong.add(Xemtong, "card4");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sodu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tien)
                .addGap(42, 42, 42)
                .addComponent(btnNaptien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKihopdong)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(GiaodienHopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKihopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sodu)
                        .addComponent(Tien)
                        .addComponent(btnNaptien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GiaodienHopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void hienThiDuLieuHopDong() {
        try {
            // Lấy danh sách hợp đồng
            List<HopDongDTO> danhSachHopDong = hopDongDAO.layDanhSachHopDong();
            
            // Lấy map nhà phân phối và nhân viên
            Map<String, String> nhaPhanPhoiMap = hopDongDAO.layDanhSachNhaPhanPhoi();
            Map<String, String> nhanVienMap = hopDongDAO.layDanhSachNhanVien();
            
            // Lấy map thời lượng phim
            Map<String, Integer> phimThoiLuongMap = hopDongDAO.layThongTinThoiLuongPhim();
            
            // Tạo model cho bảng
            DefaultTableModel model = (DefaultTableModel) tbHopdong.getModel();
            model.setRowCount(0); // Xóa dữ liệu cũ
            
            // Đổ dữ liệu vào bảng
            for (HopDongDTO hopDong : danhSachHopDong) {
                String tenPhim = hopDong.getTenPhim();
                
                // Lấy thời lượng từ map phim
                Integer thoiLuong = phimThoiLuongMap.get(tenPhim);
                String thoiLuongStr = (thoiLuong != null) ? thoiLuong + " phút" : "Chưa có";
                
                // Lấy tên nhà phân phối
                String tenNhaPhanPhoi = nhaPhanPhoiMap.getOrDefault(hopDong.getMaNhaPhanPhoi(), "Chưa có");
                
                // Lấy tên người kí
                String tenNguoiKi = nhanVienMap.getOrDefault(hopDong.getNguoiKi(), "Chưa có");
                
                // Đổ dữ liệu vào model
                model.addRow(new Object[] {
                    hopDong.getMaHopDong(),
                    tenPhim,
                    thoiLuongStr,
                    hopDong.getSoSuatChieu(),
                    formatCurrency(hopDong.getGiaThau()),
                    tenNhaPhanPhoi,
                    tenNguoiKi
                });
            }
            
            // Thiết lập sự kiện khi chọn một dòng trên bảng
            tbHopdong.getSelectionModel().addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting() && tbHopdong.getSelectedRow() != -1) {
                    hienThiChiTietHopDong();
                }
            });
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi hiển thị dữ liệu: " + e.getMessage(), 
                                         "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    // Phương thức hỗ trợ định dạng tiền tệ
    private String formatCurrency(int amount) {
        return String.format("%,d VNĐ", amount);
    }
    
    // Phương thức hiển thị chi tiết hợp đồng khi chọn một dòng trong bảng
    private void hienThiChiTietHopDong() {
        int selectedRow = tbHopdong.getSelectedRow();
        if (selectedRow >= 0) {
            String tenPhim = tbHopdong.getValueAt(selectedRow, 1).toString();
            String thoiLuong = tbHopdong.getValueAt(selectedRow, 2).toString();
            String soSuatChieu = tbHopdong.getValueAt(selectedRow, 3).toString();
            String giaThau = tbHopdong.getValueAt(selectedRow, 4).toString();
            String nhaPhanPhoi = tbHopdong.getValueAt(selectedRow, 5).toString();
            String nguoiKi = tbHopdong.getValueAt(selectedRow, 6).toString();
            
            truyxuatPhim.setText(tenPhim);
            truyxuatThoiluong.setText(thoiLuong);
            truyxuatSosuatchieu.setText(soSuatChieu);
            truyxuatGiathau.setText(giaThau);
            truyxuatNhaphanphoi.setText(nhaPhanPhoi);
            truyxuatNguoiki.setText(nguoiKi);
        }
    }
    
    // Phương thức tìm kiếm hợp đồng
    private void timKiemHopDong() {
        String tuKhoa = txtTimkiem.getText().trim();
        
        if (tuKhoa.equals(" Nhập tên phim.....") || tuKhoa.isEmpty()) {
            hienThiDuLieuHopDong(); // Hiển thị toàn bộ dữ liệu nếu không có từ khóa
            return;
        }
        
        try {
            // Lấy danh sách hợp đồng theo từ khóa
            List<HopDongDTO> ketQuaTimKiem = hopDongDAO.timKiemHopDongTheoTenPhim(tuKhoa);
            
            // Lấy map nhà phân phối và nhân viên
            Map<String, String> nhaPhanPhoiMap = hopDongDAO.layDanhSachNhaPhanPhoi();
            Map<String, String> nhanVienMap = hopDongDAO.layDanhSachNhanVien();
            
            // Lấy map thời lượng phim
            Map<String, Integer> phimThoiLuongMap = hopDongDAO.layThongTinThoiLuongPhim();
            
            // Tạo model cho bảng
            DefaultTableModel model = (DefaultTableModel) tbHopdong.getModel();
            model.setRowCount(0); // Xóa dữ liệu cũ
            
            // Đổ dữ liệu vào bảng
            for (HopDongDTO hopDong : ketQuaTimKiem) {
                String tenPhim = hopDong.getTenPhim();
                
                // Lấy thời lượng từ map phim
                Integer thoiLuong = phimThoiLuongMap.get(tenPhim);
                String thoiLuongStr = (thoiLuong != null) ? thoiLuong + " phút" : "Chưa có";
                
                // Lấy tên nhà phân phối
                String tenNhaPhanPhoi = nhaPhanPhoiMap.getOrDefault(hopDong.getMaNhaPhanPhoi(), "Chưa có");
                
                // Lấy tên người kí
                String tenNguoiKi = nhanVienMap.getOrDefault(hopDong.getNguoiKi(), "Chưa có");
                
                // Đổ dữ liệu vào model
                model.addRow(new Object[] {
                    hopDong.getMaHopDong(),
                    tenPhim,
                    thoiLuongStr,
                    hopDong.getSoSuatChieu(),
                    formatCurrency(hopDong.getGiaThau()),
                    tenNhaPhanPhoi,
                    tenNguoiKi
                });
            }
            
            if (ketQuaTimKiem.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hợp đồng với tên phim: " + tuKhoa, 
                                           "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm hợp đồng: " + e.getMessage(), 
                                         "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    } 
    
    private void txtTimkiemNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemNhapchu
        if(txtTimkiem.getText().equals(" Nhập tên phim.....")){
            txtTimkiem.setText("");
            txtTimkiem.setForeground(Color.BLACK);
        }
        else
        txtTimkiem.selectAll();
    }//GEN-LAST:event_txtTimkiemNhapchu

    private void txtTimkiemLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemLammo
        if(txtTimkiem.getText().trim().isEmpty()){
            txtTimkiem.setText(" Nhập tên phim.....");
            txtTimkiem.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemLammo

    private void txtTimkiem2Nhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiem2Nhapchu
        if(txtTimkiem2.getText().equals(" Nhập tên phim.....")){
            txtTimkiem2.setText("");
            txtTimkiem2.setForeground(Color.BLACK);
        }
        else
        txtTimkiem2.selectAll();
    }//GEN-LAST:event_txtTimkiem2Nhapchu

    private void txtTimkiem2Lammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiem2Lammo
        if(txtTimkiem2.getText().trim().isEmpty()){
            txtTimkiem2.setText(" Nhập tên phim.....");
            txtTimkiem2.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiem2Lammo

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienHopdong.getLayout();
        card.show(GiaodienHopdong, "View");
          
    }//GEN-LAST:event_View

    private void Kihopdong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kihopdong
        CardLayout card = (CardLayout) GiaodienHopdong.getLayout();
        card.show(GiaodienHopdong, "Kihopdong");
    }//GEN-LAST:event_Kihopdong

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienHopdong.getLayout();
        card.show(GiaodienHopdong, "Xemtong");

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
    private javax.swing.JLabel DsPhim;
    private javax.swing.JPanel GiaodienHopdong;
    private javax.swing.JLabel Giathau;
    private javax.swing.JPanel Kihopdong;
    private javax.swing.JLabel Mahopdong;
    private javax.swing.JLabel Ngayki;
    private javax.swing.JLabel Nhaphanphoi;
    private javax.swing.JLabel Sodu;
    private javax.swing.JLabel Sosuatchieu;
    private javax.swing.JLabel Sosuatchieu1;
    private javax.swing.JLabel Thoiluong;
    private javax.swing.JLabel Tien;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JLabel Timkiem1;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private testlib.RoundedButton btnKihd;
    private javax.swing.JButton btnKihopdong;
    private testlib.RoundedButton btnNaptien;
    private testlib.RoundedButton btnTimkiem;
    private testlib.RoundedButton btnTimkiem2;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JComboBox<String> cbDanhsachPhim;
    private javax.swing.JComboBox<String> cbNhaphanphoi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbHopdong;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatGiathau;
    private javax.swing.JTextField truyxuatNguoiki;
    private javax.swing.JTextField truyxuatNhaphanphoi;
    private javax.swing.JTextField truyxuatPhim;
    private javax.swing.JTextField truyxuatSosuatchieu;
    private javax.swing.JTextField truyxuatThoiluong;
    private javax.swing.JLabel txGiathau;
    private javax.swing.JLabel txNguoiki;
    private javax.swing.JLabel txNhaphanphoi;
    private javax.swing.JLabel txPhim;
    private javax.swing.JLabel txSosuatchieu;
    private javax.swing.JLabel txThoiluong;
    private testlib.RoundedTextField txtGiathau;
    private testlib.RoundedTextField txtMahopdong;
    private testlib.RoundedTextField txtNgayki;
    private testlib.RoundedTextField txtSosuatchieu;
    private testlib.RoundedTextField txtSosuatchieu1;
    private testlib.RoundedTextField txtThoiluong;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtTimkiem2;
    // End of variables declaration//GEN-END:variables
}
