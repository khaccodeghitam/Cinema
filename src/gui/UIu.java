
package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class UIu extends javax.swing.JFrame {
    
    private int currentIndex = 0; // đưa ra ngoài
    private String[] cardNames = {"MovieNaruto", "Diadao", "Minecraft", "Alien"};
    private CardLayout qaz;
    
    public UIu() {
        initComponents();        
        ThuchienThutu.setLayout(new CardLayout());
        ThuchienThutu.add(ChonPhim, "ChonPhim");
        ThuchienThutu.add(ChonSuatchieu, "ChonSuatchieu");
        ThuchienThutu.add(ChonGhe, "ChonGhe");
        ThuchienThutu.add(ChonAnvat, "ChonAnvat");
        ThuchienThutu.add(Thanhtoan, "Thanhtoan");
        GiaodienThanhphan.add(GiaodienTrangchu, "GiaodienTrangchu");
        GiaodienThanhphan.add(GiaodienMuave, "GiaodienMuave");
        GiaodienThanhphan.add(GiaodienCanhan, "GiaodienCanhan");
        cbVoucher.setBorder(BorderFactory.createEmptyBorder());
        
        // Dùng để chuyển phim ở Trang chủ
        qaz = (CardLayout) DemoHoatdong.getLayout();

        
        //Canh giữa tiêu đề table
        JTableHeader headerCP = tbPhim.getTableHeader(); 
        headerCP.setFont(new Font("Times New Roman", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerCP.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        JTableHeader headerSC = tbSuatchieu.getTableHeader(); 
        headerSC.setFont(new Font("Times New Roman", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerSC.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        JTableHeader headerAV = tbAnvat.getTableHeader(); 
        headerAV.setFont(new Font("Times New Roman", Font.BOLD, 16));
        headerAV.setBackground(Color.orange);
        ((DefaultTableCellRenderer) headerAV.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        // Chỉnh độ rộng của từng cột
        tbPhim.getColumnModel().getColumn(0).setPreferredWidth(450);
        tbPhim.getColumnModel().getColumn(1).setPreferredWidth(180);
        tbAnvat.getColumnModel().getColumn(0).setPreferredWidth(250);
        tbAnvat.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        
        //Set cho 1 cột nội dung nằm giữa
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        tbPhim.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbAnvat.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        
        
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Trangchu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txLogo = new javax.swing.JLabel();
        btnMuave = new javax.swing.JButton();
        Tennguoidung = new javax.swing.JLabel();
        Sodu = new javax.swing.JLabel();
        Sodutaikhoan = new javax.swing.JLabel();
        btnTrangchu = new javax.swing.JButton();
        btnCanhan = new javax.swing.JButton();
        GiaodienThanhphan = new javax.swing.JPanel();
        GiaodienMuave = new javax.swing.JPanel();
        Thutu = new javax.swing.JPanel();
        Chonphim = new javax.swing.JLabel();
        Chonsc = new javax.swing.JLabel();
        Chongh = new javax.swing.JLabel();
        Chonav = new javax.swing.JLabel();
        Chontt = new javax.swing.JLabel();
        ThuchienThutu = new javax.swing.JPanel();
        ChonPhim = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhim = new javax.swing.JTable();
        Ve = new javax.swing.JPanel();
        txTenPhim = new javax.swing.JLabel();
        txTheloai = new javax.swing.JLabel();
        txThoiluong = new javax.swing.JLabel();
        txDotuoi = new testlib.RoundedTextField();
        TxNgaychieu = new javax.swing.JLabel();
        Poster = new javax.swing.JLabel();
        txLichchieu = new javax.swing.JLabel();
        Ngaychieu = new javax.swing.JLabel();
        txGhe = new javax.swing.JLabel();
        btn_next_Suatchieu = new testlib.RoundedButton();
        ChonSuatchieu = new javax.swing.JPanel();
        Ve_LC = new javax.swing.JPanel();
        txTenPhim1 = new javax.swing.JLabel();
        txTheloai1 = new javax.swing.JLabel();
        txThoiluong1 = new javax.swing.JLabel();
        txDotuoi1 = new testlib.RoundedTextField();
        TxNgaychieu1 = new javax.swing.JLabel();
        Poster1 = new javax.swing.JLabel();
        Ngaychieu1 = new javax.swing.JLabel();
        Ngaychieu3 = new javax.swing.JLabel();
        Ngaychieu5 = new javax.swing.JLabel();
        btn_next_Ghe = new testlib.RoundedButton();
        btnQuaylaiPhim = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSuatchieu = new javax.swing.JTable();
        ChonGhe = new javax.swing.JPanel();
        btn_next_Anvat = new testlib.RoundedButton();
        btnQuaylaiSuatchieu = new testlib.RoundedButton();
        Ve_Ghe = new javax.swing.JPanel();
        txTenPhim2 = new javax.swing.JLabel();
        txTheloai2 = new javax.swing.JLabel();
        txThoiluong2 = new javax.swing.JLabel();
        txDotuoi2 = new testlib.RoundedTextField();
        TxNgaychieu2 = new javax.swing.JLabel();
        Poster2 = new javax.swing.JLabel();
        txLichchieu1 = new javax.swing.JLabel();
        Ngaychieu2 = new javax.swing.JLabel();
        txGhe1 = new javax.swing.JLabel();
        Tien = new javax.swing.JLabel();
        Tongtien = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ChoNgoi = new javax.swing.JPanel();
        KhungManhinh = new javax.swing.JPanel();
        Manhinh = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        Ghetrong = new javax.swing.JLabel();
        Dangchon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Damua1 = new javax.swing.JLabel();
        ChonAnvat = new javax.swing.JPanel();
        btn_next_Thanhtoan = new testlib.RoundedButton();
        btnQuaylaiChonGhe = new testlib.RoundedButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAnvat = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Thucan = new javax.swing.JPanel();
        Baprangbo = new javax.swing.JButton();
        Douong = new javax.swing.JPanel();
        Coca = new javax.swing.JButton();
        Thanhtoan = new javax.swing.JPanel();
        btnXacnhanThanhtoan = new testlib.RoundedButton();
        btnQuaylaiAnvat = new testlib.RoundedButton();
        Ve_Thanhtoan = new javax.swing.JPanel();
        txTenPhim3 = new javax.swing.JLabel();
        txTheloai3 = new javax.swing.JLabel();
        txThoiluong3 = new javax.swing.JLabel();
        txDotuoi3 = new testlib.RoundedTextField();
        TxNgaychieu3 = new javax.swing.JLabel();
        Poster3 = new javax.swing.JLabel();
        txLichchieu2 = new javax.swing.JLabel();
        Ngaychieu4 = new javax.swing.JLabel();
        txGhe2 = new javax.swing.JLabel();
        Tien1 = new javax.swing.JLabel();
        Tongtien1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Voucher = new javax.swing.JLabel();
        cbVoucher = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        TongThanhtoan = new javax.swing.JLabel();
        TienphaiThanhtoan = new javax.swing.JLabel();
        Anvat = new javax.swing.JPanel();
        TieudeAnvat = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Vd_truyxuat = new javax.swing.JLabel();
        Vd_truyxuat2 = new javax.swing.JLabel();
        GiaodienTrangchu = new javax.swing.JPanel();
        Chaomung = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DemoHoatdong = new javax.swing.JPanel();
        MovieNaruto = new javax.swing.JLabel();
        Diadao = new javax.swing.JLabel();
        Minecraft = new javax.swing.JLabel();
        Alien = new javax.swing.JLabel();
        Decor1 = new javax.swing.JPanel();
        Decor2 = new javax.swing.JLabel();
        Decor3 = new javax.swing.JLabel();
        Decor4 = new javax.swing.JLabel();
        Decor5 = new javax.swing.JLabel();
        Decor6 = new javax.swing.JLabel();
        Decor7 = new javax.swing.JLabel();
        Decor8 = new javax.swing.JLabel();
        Decor9 = new javax.swing.JLabel();
        Decor10 = new javax.swing.JLabel();
        Decor11 = new javax.swing.JLabel();
        Decor12 = new javax.swing.JLabel();
        Decor13 = new javax.swing.JLabel();
        Decor14 = new javax.swing.JLabel();
        Decor15 = new javax.swing.JLabel();
        Decor16 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        GiaodienCanhan = new javax.swing.JPanel();
        nentrang = new javax.swing.JPanel();
        Avatar_fake = new javax.swing.JLabel();
        ThongtinCanhan = new javax.swing.JLabel();
        Hoten = new javax.swing.JLabel();
        txHoten = new javax.swing.JLabel();
        Gioitinh = new javax.swing.JLabel();
        txGioitinh = new javax.swing.JLabel();
        Ngaysinh = new javax.swing.JLabel();
        txNgaysinh = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        txEmail = new javax.swing.JLabel();
        Sdt = new javax.swing.JLabel();
        txSdt = new javax.swing.JLabel();
        Ngaytao = new javax.swing.JLabel();
        txNgaytao = new javax.swing.JLabel();
        btnDangxuat = new testlib.RoundedButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 633));

        Trangchu.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo3.png"))); // NOI18N

        txLogo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txLogo.setText("My Cinema");

        btnMuave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/muave.png"))); // NOI18N
        btnMuave.setToolTipText("");
        btnMuave.setContentAreaFilled(false);
        btnMuave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenGiaodienMuave(evt);
            }
        });

        Tennguoidung.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Tennguoidung.setText("Tên");

        Sodu.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sodu.setText("Số dư:");

        Sodutaikhoan.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sodutaikhoan.setText("10000");

        btnTrangchu.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnTrangchu.setText("Trang chủ");
        btnTrangchu.setContentAreaFilled(false);
        btnTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenGiaodienTrangchu(evt);
            }
        });

        btnCanhan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCanhan.setText("Cá nhân");
        btnCanhan.setContentAreaFilled(false);
        btnCanhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenGiaodienCanhan(evt);
            }
        });

        javax.swing.GroupLayout TrangchuLayout = new javax.swing.GroupLayout(Trangchu);
        Trangchu.setLayout(TrangchuLayout);
        TrangchuLayout.setHorizontalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrangchuLayout.createSequentialGroup()
                        .addComponent(txLogo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TrangchuLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(225, 225, 225)
                        .addComponent(btnMuave, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnTrangchu)
                        .addGap(27, 27, 27)
                        .addComponent(btnCanhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TrangchuLayout.createSequentialGroup()
                                .addComponent(Sodu)
                                .addGap(18, 18, 18)
                                .addComponent(Sodutaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Tennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
        );
        TrangchuLayout.setVerticalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrangchuLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangchuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TrangchuLayout.createSequentialGroup()
                                    .addComponent(Tennguoidung)
                                    .addGap(16, 16, 16)
                                    .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Sodu)
                                        .addComponent(Sodutaikhoan)))
                                .addComponent(btnMuave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTrangchu)
                                .addComponent(btnCanhan)))))
                .addGap(0, 0, 0)
                .addComponent(txLogo)
                .addContainerGap())
        );

        GiaodienThanhphan.setBackground(new java.awt.Color(239, 239, 239));
        GiaodienThanhphan.setLayout(new java.awt.CardLayout());

        GiaodienMuave.setBackground(new java.awt.Color(239, 239, 239));

        Thutu.setBackground(new java.awt.Color(255, 255, 255));

        Chonphim.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Chonphim.setForeground(new java.awt.Color(255, 102, 0));
        Chonphim.setText("Chọn phim");
        Chonphim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 0)));

        Chonsc.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Chonsc.setForeground(new java.awt.Color(128, 128, 128));
        Chonsc.setText("Chọn suất chiếu");

        Chongh.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Chongh.setForeground(new java.awt.Color(128, 128, 128));
        Chongh.setText("Chọn ghế");

        Chonav.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Chonav.setForeground(new java.awt.Color(128, 128, 128));
        Chonav.setText("Chọn ăn vặt");

        Chontt.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Chontt.setForeground(new java.awt.Color(128, 128, 128));
        Chontt.setText("Thanh toán");

        javax.swing.GroupLayout ThutuLayout = new javax.swing.GroupLayout(Thutu);
        Thutu.setLayout(ThutuLayout);
        ThutuLayout.setHorizontalGroup(
            ThutuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThutuLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(Chonphim)
                .addGap(50, 50, 50)
                .addComponent(Chonsc)
                .addGap(50, 50, 50)
                .addComponent(Chongh)
                .addGap(50, 50, 50)
                .addComponent(Chonav)
                .addGap(50, 50, 50)
                .addComponent(Chontt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThutuLayout.setVerticalGroup(
            ThutuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThutuLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(ThutuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chonphim)
                    .addComponent(Chonsc)
                    .addComponent(Chongh)
                    .addComponent(Chonav)
                    .addComponent(Chontt))
                .addGap(17, 17, 17))
        );

        ThuchienThutu.setBackground(new java.awt.Color(239, 239, 239));
        ThuchienThutu.setLayout(new java.awt.CardLayout());

        ChonPhim.setBackground(new java.awt.Color(239, 239, 239));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"My hero academia", "123"},
                {"J97 - Virus", "123"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên phim", "Thời lượng (phút)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhim.setGridColor(new java.awt.Color(0, 0, 0));
        tbPhim.setRowHeight(40);
        tbPhim.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tbPhim.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbPhim.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbPhim);

        Ve.setBackground(new java.awt.Color(255, 255, 255));
        Ve.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));
        Ve.setPreferredSize(new java.awt.Dimension(355, 350));

        txTenPhim.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTenPhim.setText("Truy xuất tên phim");

        txTheloai.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai.setText("Truy xuất thể loại");

        txThoiluong.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txThoiluong.setText("123 phút");

        txDotuoi.setBackground(new java.awt.Color(255, 153, 51));
        txDotuoi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDotuoi.setText("T16");

        TxNgaychieu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TxNgaychieu.setText("23/12/2024");

        Poster.setBackground(new java.awt.Color(255, 255, 255));
        Poster.setText("Poster");
        Poster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txLichchieu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txLichchieu.setText("Truy xuất lịch chiếu (Trang này trống)");

        Ngaychieu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu.setText("Ngày chiếu:");

        txGhe.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txGhe.setText("Truy xuất ghế (Trang này trống)");

        javax.swing.GroupLayout VeLayout = new javax.swing.GroupLayout(Ve);
        Ve.setLayout(VeLayout);
        VeLayout.setHorizontalGroup(
            VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VeLayout.createSequentialGroup()
                        .addComponent(Poster, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(VeLayout.createSequentialGroup()
                                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VeLayout.createSequentialGroup()
                                        .addComponent(txThoiluong)
                                        .addGap(18, 18, 18)
                                        .addComponent(txDotuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(VeLayout.createSequentialGroup()
                                .addComponent(Ngaychieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxNgaychieu)))
                        .addGap(18, 18, 18))
                    .addGroup(VeLayout.createSequentialGroup()
                        .addComponent(txLichchieu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(VeLayout.createSequentialGroup()
                        .addComponent(txGhe)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        VeLayout.setVerticalGroup(
            VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poster, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VeLayout.createSequentialGroup()
                        .addComponent(txTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDotuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(txLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_next_Suatchieu.setBackground(new java.awt.Color(255, 102, 0));
        btn_next_Suatchieu.setText("Tiếp tục");
        btn_next_Suatchieu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_next_Suatchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_Suatchieu(evt);
            }
        });

        javax.swing.GroupLayout ChonPhimLayout = new javax.swing.GroupLayout(ChonPhim);
        ChonPhim.setLayout(ChonPhimLayout);
        ChonPhimLayout.setHorizontalGroup(
            ChonPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonPhimLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(ChonPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next_Suatchieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        ChonPhimLayout.setVerticalGroup(
            ChonPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonPhimLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChonPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChonPhimLayout.createSequentialGroup()
                        .addComponent(Ve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_next_Suatchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        ThuchienThutu.add(ChonPhim, "ChonPhim");

        ChonSuatchieu.setBackground(new java.awt.Color(239, 239, 239));

        Ve_LC.setBackground(new java.awt.Color(255, 255, 255));
        Ve_LC.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));
        Ve_LC.setPreferredSize(new java.awt.Dimension(355, 350));

        txTenPhim1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTenPhim1.setText("Truy xuất tên phim");

        txTheloai1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai1.setText("Truy xuất thể loại");

        txThoiluong1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txThoiluong1.setText("123 phút");

        txDotuoi1.setBackground(new java.awt.Color(255, 153, 51));
        txDotuoi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDotuoi1.setText("T16");

        TxNgaychieu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TxNgaychieu1.setText("23/12/2024");

        Poster1.setBackground(new java.awt.Color(255, 255, 255));
        Poster1.setText("Poster");
        Poster1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Ngaychieu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu1.setText("Ngày chiếu:");

        Ngaychieu3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu3.setText("Truy xuất lịch chiếu ");

        Ngaychieu5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu5.setText("Truy xuất ghế (Trang này trống)");

        javax.swing.GroupLayout Ve_LCLayout = new javax.swing.GroupLayout(Ve_LC);
        Ve_LC.setLayout(Ve_LCLayout);
        Ve_LCLayout.setHorizontalGroup(
            Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_LCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ve_LCLayout.createSequentialGroup()
                        .addComponent(Poster1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenPhim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Ve_LCLayout.createSequentialGroup()
                                .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTheloai1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Ve_LCLayout.createSequentialGroup()
                                        .addComponent(txThoiluong1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txDotuoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Ve_LCLayout.createSequentialGroup()
                                .addComponent(Ngaychieu1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(TxNgaychieu1)))
                        .addGap(18, 18, 18))
                    .addGroup(Ve_LCLayout.createSequentialGroup()
                        .addComponent(Ngaychieu3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Ve_LCLayout.createSequentialGroup()
                        .addComponent(Ngaychieu5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Ve_LCLayout.setVerticalGroup(
            Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_LCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poster1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ve_LCLayout.createSequentialGroup()
                        .addComponent(txTenPhim1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txTheloai1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDotuoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ve_LCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNgaychieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaychieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(Ngaychieu3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Ngaychieu5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_next_Ghe.setBackground(new java.awt.Color(255, 102, 0));
        btn_next_Ghe.setText("Tiếp tục");
        btn_next_Ghe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_next_Ghe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_ChonGhe(evt);
            }
        });

        btnQuaylaiPhim.setBackground(new java.awt.Color(255, 255, 255));
        btnQuaylaiPhim.setForeground(new java.awt.Color(0, 0, 0));
        btnQuaylaiPhim.setText("Quay lại");
        btnQuaylaiPhim.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuaylaiPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_chonphim(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(239, 239, 239));

        tbSuatchieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbSuatchieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"28/12/2022", "18:10", "20:03", "Cơ bản"},
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
                "Ngày", "Giờ", "Dự kiến kết phim", "Loại chiếu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSuatchieu.setGridColor(new java.awt.Color(0, 0, 0));
        tbSuatchieu.setRowHeight(40);
        tbSuatchieu.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tbSuatchieu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbSuatchieu.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbSuatchieu);

        javax.swing.GroupLayout ChonSuatchieuLayout = new javax.swing.GroupLayout(ChonSuatchieu);
        ChonSuatchieu.setLayout(ChonSuatchieuLayout);
        ChonSuatchieuLayout.setHorizontalGroup(
            ChonSuatchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonSuatchieuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(ChonSuatchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ve_LC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonSuatchieuLayout.createSequentialGroup()
                        .addComponent(btnQuaylaiPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_next_Ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        ChonSuatchieuLayout.setVerticalGroup(
            ChonSuatchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonSuatchieuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChonSuatchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChonSuatchieuLayout.createSequentialGroup()
                        .addComponent(Ve_LC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(ChonSuatchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_next_Ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuaylaiPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ThuchienThutu.add(ChonSuatchieu, "ChonSuatchieu");

        ChonGhe.setBackground(new java.awt.Color(239, 239, 239));

        btn_next_Anvat.setBackground(new java.awt.Color(255, 102, 0));
        btn_next_Anvat.setText("Tiếp tục");
        btn_next_Anvat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_next_Anvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_Anvat(evt);
            }
        });

        btnQuaylaiSuatchieu.setBackground(new java.awt.Color(255, 255, 255));
        btnQuaylaiSuatchieu.setForeground(new java.awt.Color(0, 0, 0));
        btnQuaylaiSuatchieu.setText("Quay lại");
        btnQuaylaiSuatchieu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuaylaiSuatchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ChonSuatchieu(evt);
            }
        });

        Ve_Ghe.setBackground(new java.awt.Color(255, 255, 255));
        Ve_Ghe.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));
        Ve_Ghe.setPreferredSize(new java.awt.Dimension(355, 350));

        txTenPhim2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTenPhim2.setText("Truy xuất tên phim");

        txTheloai2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai2.setText("Truy xuất thể loại");

        txThoiluong2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txThoiluong2.setText("123 phút");

        txDotuoi2.setBackground(new java.awt.Color(255, 153, 51));
        txDotuoi2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDotuoi2.setText("T16");

        TxNgaychieu2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TxNgaychieu2.setText("23/12/2024");

        Poster2.setBackground(new java.awt.Color(255, 255, 255));
        Poster2.setText("Poster");
        Poster2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txLichchieu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txLichchieu1.setText("Truy xuất lịch chiếu");

        Ngaychieu2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu2.setText("Ngày chiếu:");

        txGhe1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txGhe1.setText("Truy xuất ghế ");

        Tien.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tien.setText("Số tiền vé * số lượng");

        Tongtien.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tongtien.setText("Tổng tiền:");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Ve_GheLayout = new javax.swing.GroupLayout(Ve_Ghe);
        Ve_Ghe.setLayout(Ve_GheLayout);
        Ve_GheLayout.setHorizontalGroup(
            Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_GheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ve_GheLayout.createSequentialGroup()
                        .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Poster2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGhe1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenPhim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Ve_GheLayout.createSequentialGroup()
                                .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTheloai2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Ve_GheLayout.createSequentialGroup()
                                        .addComponent(txThoiluong2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txDotuoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Ve_GheLayout.createSequentialGroup()
                                .addComponent(Ngaychieu2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxNgaychieu2)))
                        .addGap(18, 18, 18))
                    .addGroup(Ve_GheLayout.createSequentialGroup()
                        .addComponent(txLichchieu1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Ve_GheLayout.createSequentialGroup()
                        .addComponent(Tongtien)
                        .addGap(100, 100, 100)
                        .addComponent(Tien)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ve_GheLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        Ve_GheLayout.setVerticalGroup(
            Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_GheLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poster2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ve_GheLayout.createSequentialGroup()
                        .addComponent(txTenPhim2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txTheloai2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDotuoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNgaychieu2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaychieu2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(txLichchieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txGhe1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ve_GheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        ChoNgoi.setBackground(new java.awt.Color(255, 255, 255));
        ChoNgoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        KhungManhinh.setBackground(new java.awt.Color(153, 153, 153));

        Manhinh.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Manhinh.setText("MÀN HÌNH");

        javax.swing.GroupLayout KhungManhinhLayout = new javax.swing.GroupLayout(KhungManhinh);
        KhungManhinh.setLayout(KhungManhinhLayout);
        KhungManhinhLayout.setHorizontalGroup(
            KhungManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhungManhinhLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(Manhinh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KhungManhinhLayout.setVerticalGroup(
            KhungManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhungManhinhLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Manhinh)
                .addGap(20, 20, 20))
        );

        A1.setText("A1");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        A3.setText("A3");
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        A2.setText("A2");
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        A4.setText("A4");
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        A5.setText("A5");
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        A6.setText("A6");
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B1.setText("B1");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B2.setText("B2");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B3.setText("B3");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B4.setText("B4");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B5.setText("B5");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        B6.setText("B6");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C1.setText("C1");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C2.setText("C2");
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C3.setText("C3");
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C4.setText("C4");
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C5.setText("C5");
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        C6.setText("C6");
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D1.setText("D1");
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D2.setText("D2");
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D3.setText("D3");
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D4.setText("D4");
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D5.setText("D5");
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        D6.setText("D6");
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });

        Ghetrong.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Ghetrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/square.png"))); // NOI18N
        Ghetrong.setText("Ghế trống:");
        Ghetrong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Ghetrong.setVerifyInputWhenFocusTarget(false);

        Dangchon.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Dangchon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orange_square.png"))); // NOI18N
        Dangchon.setText("Đangchọn:");
        Dangchon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Dangchon.setVerifyInputWhenFocusTarget(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Damua1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Damua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/green_square.png"))); // NOI18N
        Damua1.setText("Đã mua:");
        Damua1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Damua1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout ChoNgoiLayout = new javax.swing.GroupLayout(ChoNgoi);
        ChoNgoi.setLayout(ChoNgoiLayout);
        ChoNgoiLayout.setHorizontalGroup(
            ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KhungManhinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ChoNgoiLayout.createSequentialGroup()
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChoNgoiLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ChoNgoiLayout.createSequentialGroup()
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ChoNgoiLayout.createSequentialGroup()
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ChoNgoiLayout.createSequentialGroup()
                                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ChoNgoiLayout.createSequentialGroup()
                                .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ChoNgoiLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Ghetrong)
                        .addGap(18, 18, 18)
                        .addComponent(Dangchon)
                        .addGap(18, 18, 18)
                        .addComponent(Damua1)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        ChoNgoiLayout.setVerticalGroup(
            ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoNgoiLayout.createSequentialGroup()
                .addComponent(KhungManhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ghetrong)
                    .addComponent(Dangchon)
                    .addComponent(Damua1))
                .addContainerGap())
        );

        javax.swing.GroupLayout ChonGheLayout = new javax.swing.GroupLayout(ChonGhe);
        ChonGhe.setLayout(ChonGheLayout);
        ChonGheLayout.setHorizontalGroup(
            ChonGheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonGheLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(ChonGheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ve_Ghe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ChonGheLayout.createSequentialGroup()
                        .addComponent(btnQuaylaiSuatchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btn_next_Anvat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        ChonGheLayout.setVerticalGroup(
            ChonGheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonGheLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ChonGheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChonGheLayout.createSequentialGroup()
                        .addComponent(Ve_Ghe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(ChonGheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuaylaiSuatchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next_Anvat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ThuchienThutu.add(ChonGhe, "ChonGhe");

        ChonAnvat.setBackground(new java.awt.Color(239, 239, 239));

        btn_next_Thanhtoan.setBackground(new java.awt.Color(255, 102, 0));
        btn_next_Thanhtoan.setText("Tiếp tục");
        btn_next_Thanhtoan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_next_Thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_Thanhtoan(evt);
            }
        });

        btnQuaylaiChonGhe.setBackground(new java.awt.Color(255, 255, 255));
        btnQuaylaiChonGhe.setForeground(new java.awt.Color(0, 0, 0));
        btnQuaylaiChonGhe.setText("Quay lại");
        btnQuaylaiChonGhe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuaylaiChonGhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ChonGhe(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbAnvat.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tbAnvat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bắp rang bơ", "3"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sản phẩm", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAnvat.setGridColor(new java.awt.Color(0, 0, 0));
        tbAnvat.setRowHeight(40);
        tbAnvat.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tbAnvat.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbAnvat.setShowVerticalLines(true);
        jScrollPane3.setViewportView(tbAnvat);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        Thucan.setBackground(new java.awt.Color(255, 255, 255));

        Baprangbo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Baprangbo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/popcorn.png"))); // NOI18N
        Baprangbo.setText("Bắp rang bơ");
        Baprangbo.setBorderPainted(false);
        Baprangbo.setContentAreaFilled(false);
        Baprangbo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Baprangbo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout ThucanLayout = new javax.swing.GroupLayout(Thucan);
        Thucan.setLayout(ThucanLayout);
        ThucanLayout.setHorizontalGroup(
            ThucanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThucanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Baprangbo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        ThucanLayout.setVerticalGroup(
            ThucanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThucanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Baprangbo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thức ăn", Thucan);

        Douong.setBackground(new java.awt.Color(255, 255, 255));

        Coca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Coca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coca.png"))); // NOI18N
        Coca.setText("Coca Cola");
        Coca.setBorderPainted(false);
        Coca.setContentAreaFilled(false);
        Coca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Coca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout DouongLayout = new javax.swing.GroupLayout(Douong);
        Douong.setLayout(DouongLayout);
        DouongLayout.setHorizontalGroup(
            DouongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DouongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Coca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        DouongLayout.setVerticalGroup(
            DouongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DouongLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Coca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đồ uống", Douong);

        javax.swing.GroupLayout ChonAnvatLayout = new javax.swing.GroupLayout(ChonAnvat);
        ChonAnvat.setLayout(ChonAnvatLayout);
        ChonAnvatLayout.setHorizontalGroup(
            ChonAnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonAnvatLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(ChonAnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ChonAnvatLayout.createSequentialGroup()
                        .addComponent(btnQuaylaiChonGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btn_next_Thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        ChonAnvatLayout.setVerticalGroup(
            ChonAnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonAnvatLayout.createSequentialGroup()
                .addGroup(ChonAnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChonAnvatLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ChonAnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_next_Thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuaylaiChonGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        ThuchienThutu.add(ChonAnvat, "ChonAnvat");

        Thanhtoan.setBackground(new java.awt.Color(239, 239, 239));

        btnXacnhanThanhtoan.setBackground(new java.awt.Color(255, 102, 0));
        btnXacnhanThanhtoan.setText("Thanh toán");
        btnXacnhanThanhtoan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnQuaylaiAnvat.setBackground(new java.awt.Color(255, 255, 255));
        btnQuaylaiAnvat.setForeground(new java.awt.Color(0, 0, 0));
        btnQuaylaiAnvat.setText("Quay lại");
        btnQuaylaiAnvat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQuaylaiAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ChonAnvat(evt);
            }
        });

        Ve_Thanhtoan.setBackground(new java.awt.Color(255, 255, 255));
        Ve_Thanhtoan.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));
        Ve_Thanhtoan.setPreferredSize(new java.awt.Dimension(355, 350));

        txTenPhim3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTenPhim3.setText("Truy xuất tên phim");

        txTheloai3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai3.setText("Truy xuất thể loại");

        txThoiluong3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txThoiluong3.setText("123 phút");

        txDotuoi3.setBackground(new java.awt.Color(255, 153, 51));
        txDotuoi3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDotuoi3.setText("T16");

        TxNgaychieu3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TxNgaychieu3.setText("23/12/2024");

        Poster3.setBackground(new java.awt.Color(255, 255, 255));
        Poster3.setText("Poster");
        Poster3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txLichchieu2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txLichchieu2.setText("Truy xuất lịch chiếu");

        Ngaychieu4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngaychieu4.setText("Ngày chiếu:");

        txGhe2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txGhe2.setText("Truy xuất ghế ");

        Tien1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tien1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tien1.setText("Số tiền vé * số lượng");

        Tongtien1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tongtien1.setText("Tổng tiền:");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        Voucher.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Voucher.setText("Voucher:");

        cbVoucher.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbVoucher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất Voucher", "1", "2", "3" }));
        cbVoucher.setLightWeightPopupEnabled(false);
        cbVoucher.setOpaque(true);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        TongThanhtoan.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TongThanhtoan.setText("Tổng thanh toán:");

        TienphaiThanhtoan.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TienphaiThanhtoan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TienphaiThanhtoan.setText("Tổng tiền sau giảm");

        javax.swing.GroupLayout Ve_ThanhtoanLayout = new javax.swing.GroupLayout(Ve_Thanhtoan);
        Ve_Thanhtoan.setLayout(Ve_ThanhtoanLayout);
        Ve_ThanhtoanLayout.setHorizontalGroup(
            Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                        .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Poster3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGhe2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenPhim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                                        .addComponent(txThoiluong3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txDotuoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                                .addComponent(Ngaychieu4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(TxNgaychieu3)))
                        .addGap(18, 18, 18))
                    .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                        .addComponent(txLichchieu2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ve_ThanhtoanLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ve_ThanhtoanLayout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addContainerGap())
                    .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                        .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tongtien1)
                                    .addComponent(Voucher))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tien1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbVoucher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                                .addComponent(TongThanhtoan)
                                .addGap(61, 61, 61)
                                .addComponent(TienphaiThanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        Ve_ThanhtoanLayout.setVerticalGroup(
            Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poster3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ve_ThanhtoanLayout.createSequentialGroup()
                        .addComponent(txTenPhim3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txTheloai3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txThoiluong3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDotuoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNgaychieu3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaychieu4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(txLichchieu2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txGhe2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tongtien1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tien1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voucher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Ve_ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TongThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TienphaiThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Anvat.setBackground(new java.awt.Color(255, 255, 255));
        Anvat.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));

        TieudeAnvat.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TieudeAnvat.setText("Ăn vặt");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Vd_truyxuat.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Vd_truyxuat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Vd_truyxuat.setText("3 x Bắp rang bơ");

        Vd_truyxuat2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Vd_truyxuat2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Vd_truyxuat2.setText("4 x Coca Cola");

        javax.swing.GroupLayout AnvatLayout = new javax.swing.GroupLayout(Anvat);
        Anvat.setLayout(AnvatLayout);
        AnvatLayout.setHorizontalGroup(
            AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnvatLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vd_truyxuat2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vd_truyxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(AnvatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TieudeAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AnvatLayout.setVerticalGroup(
            AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnvatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TieudeAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vd_truyxuat)
                .addGap(18, 18, 18)
                .addComponent(Vd_truyxuat2)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThanhtoanLayout = new javax.swing.GroupLayout(Thanhtoan);
        Thanhtoan.setLayout(ThanhtoanLayout);
        ThanhtoanLayout.setHorizontalGroup(
            ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhtoanLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Ve_Thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThanhtoanLayout.createSequentialGroup()
                        .addComponent(btnQuaylaiAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnXacnhanThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Anvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        ThanhtoanLayout.setVerticalGroup(
            ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhtoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThanhtoanLayout.createSequentialGroup()
                        .addComponent(Anvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXacnhanThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuaylaiAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Ve_Thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ThuchienThutu.add(Thanhtoan, "Thanhtoan");

        javax.swing.GroupLayout GiaodienMuaveLayout = new javax.swing.GroupLayout(GiaodienMuave);
        GiaodienMuave.setLayout(GiaodienMuaveLayout);
        GiaodienMuaveLayout.setHorizontalGroup(
            GiaodienMuaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Thutu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThuchienThutu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GiaodienMuaveLayout.setVerticalGroup(
            GiaodienMuaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GiaodienMuaveLayout.createSequentialGroup()
                .addComponent(Thutu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThuchienThutu, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GiaodienThanhphan.add(GiaodienMuave, "GiaodienMuave");

        GiaodienTrangchu.setBackground(new java.awt.Color(255, 255, 255));

        Chaomung.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHÀO MỪNG CÁC BẠN ĐẾN VỚI BÌNH NGUYÊN VÔ TẬN");

        javax.swing.GroupLayout ChaomungLayout = new javax.swing.GroupLayout(Chaomung);
        Chaomung.setLayout(ChaomungLayout);
        ChaomungLayout.setHorizontalGroup(
            ChaomungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChaomungLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        ChaomungLayout.setVerticalGroup(
            ChaomungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChaomungLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        DemoHoatdong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DemoHoatdong.setLayout(new java.awt.CardLayout());

        MovieNaruto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/movieNaruto.png"))); // NOI18N
        DemoHoatdong.add(MovieNaruto, "MovieNaruto");

        Diadao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/diadao.png"))); // NOI18N
        DemoHoatdong.add(Diadao, "Diadao");

        Minecraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minecraft.png"))); // NOI18N
        DemoHoatdong.add(Minecraft, "Minecraft");

        Alien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/alien.png"))); // NOI18N
        DemoHoatdong.add(Alien, "Alien");

        Decor1.setBackground(new java.awt.Color(153, 153, 153));
        Decor1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 102, 0)));

        javax.swing.GroupLayout Decor1Layout = new javax.swing.GroupLayout(Decor1);
        Decor1.setLayout(Decor1Layout);
        Decor1Layout.setHorizontalGroup(
            Decor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Decor1Layout.setVerticalGroup(
            Decor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Decor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maychieu.png"))); // NOI18N

        Decor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor3.setText("jLabel3");

        Decor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor4.setText("jLabel3");

        Decor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor5.setText("jLabel3");

        Decor6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor6.setText("jLabel3");

        Decor7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor7.setText("jLabel3");

        Decor8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor8.setText("jLabel3");

        Decor9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor9.setText("jLabel3");

        Decor10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor10.setText("jLabel3");

        Decor11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor11.setText("jLabel3");

        Decor12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor12.setText("jLabel3");

        Decor13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor13.setText("jLabel3");

        Decor14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor14.setText("jLabel3");

        Decor15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor15.setText("jLabel3");

        Decor16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seat.png"))); // NOI18N
        Decor16.setText("jLabel3");

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_Movie(evt);
            }
        });

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnPrevious.setContentAreaFilled(false);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Previous_Movie(evt);
            }
        });

        javax.swing.GroupLayout GiaodienTrangchuLayout = new javax.swing.GroupLayout(GiaodienTrangchu);
        GiaodienTrangchu.setLayout(GiaodienTrangchuLayout);
        GiaodienTrangchuLayout.setHorizontalGroup(
            GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chaomung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Decor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GiaodienTrangchuLayout.createSequentialGroup()
                .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Decor2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrevious)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DemoHoatdong, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addGap(284, 284, 284))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GiaodienTrangchuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Decor7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                        .addComponent(Decor11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                        .addComponent(Decor8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Decor6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(226, 226, 226))
        );
        GiaodienTrangchuLayout.setVerticalGroup(
            GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                .addComponent(Chaomung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GiaodienTrangchuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addGap(94, 94, 94))
                    .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                        .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Decor2)
                                .addGap(25, 25, 25)
                                .addComponent(btnPrevious))
                            .addGroup(GiaodienTrangchuLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(DemoHoatdong, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Decor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decor3)
                    .addComponent(Decor6)
                    .addComponent(Decor5)
                    .addComponent(Decor4)
                    .addComponent(Decor9)
                    .addComponent(Decor10)
                    .addComponent(Decor8)
                    .addComponent(Decor7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GiaodienTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decor16)
                    .addComponent(Decor15)
                    .addComponent(Decor14)
                    .addComponent(Decor12)
                    .addComponent(Decor13)
                    .addComponent(Decor11))
                .addContainerGap())
        );

        GiaodienThanhphan.add(GiaodienTrangchu, "GiaodienTrangchu");

        GiaodienCanhan.setBackground(new java.awt.Color(239, 239, 239));

        nentrang.setBackground(new java.awt.Color(255, 255, 255));

        Avatar_fake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fake_id.png"))); // NOI18N
        Avatar_fake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ThongtinCanhan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ThongtinCanhan.setText("Thông tin cá nhân");

        Hoten.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Hoten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hoten.setText("Họ tên: ");

        txHoten.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txHoten.setText("Truy xuất tên");
        txHoten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Gioitinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Gioitinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Gioitinh.setText("Giới tính:");

        txGioitinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txGioitinh.setText("Truy xuất giới tính");
        txGioitinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Ngaysinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Ngaysinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngaysinh.setText("Ngày sinh:");

        txNgaysinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txNgaysinh.setText("Truy xuất ngày sinh");
        txNgaysinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Email.setText("Email:");

        txEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txEmail.setText("Truy xuất email");
        txEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Sdt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sdt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sdt.setText("Số điện thoại:");

        txSdt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txSdt.setText("Truy xuất sđt");
        txSdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Ngaytao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Ngaytao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngaytao.setText("Ngày tạo tài khoản:");

        txNgaytao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txNgaytao.setText("Truy xuất ngày bấm đki");
        txNgaytao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnDangxuat.setBackground(new java.awt.Color(153, 0, 0));
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Plastic-Mini-Button-Turn-Off.24.png"))); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatReturnLog(evt);
            }
        });

        javax.swing.GroupLayout nentrangLayout = new javax.swing.GroupLayout(nentrang);
        nentrang.setLayout(nentrangLayout);
        nentrangLayout.setHorizontalGroup(
            nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nentrangLayout.createSequentialGroup()
                .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nentrangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ThongtinCanhan))
                    .addGroup(nentrangLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(Avatar_fake)
                        .addGap(74, 74, 74)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Hoten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Gioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Ngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nentrangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        nentrangLayout.setVerticalGroup(
            nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nentrangLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ThongtinCanhan)
                .addGap(65, 65, 65)
                .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Avatar_fake)
                    .addGroup(nentrangLayout.createSequentialGroup()
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hoten)
                            .addComponent(txHoten))
                        .addGap(25, 25, 25)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gioitinh)
                            .addComponent(txGioitinh))
                        .addGap(25, 25, 25)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ngaysinh)
                            .addComponent(txNgaysinh))
                        .addGap(25, 25, 25)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email)
                            .addComponent(txEmail))
                        .addGap(25, 25, 25)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sdt)
                            .addComponent(txSdt))
                        .addGap(25, 25, 25)
                        .addGroup(nentrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ngaytao)
                            .addComponent(txNgaytao))))
                .addGap(18, 18, 18)
                .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GiaodienCanhanLayout = new javax.swing.GroupLayout(GiaodienCanhan);
        GiaodienCanhan.setLayout(GiaodienCanhanLayout);
        GiaodienCanhanLayout.setHorizontalGroup(
            GiaodienCanhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nentrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GiaodienCanhanLayout.setVerticalGroup(
            GiaodienCanhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nentrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GiaodienThanhphan.add(GiaodienCanhan, "GiaodienCanhan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GiaodienThanhphan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(GiaodienThanhphan, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void next(JLabel next, JLabel now, String b){
        CardLayout card = (CardLayout) ThuchienThutu.getLayout();
        card.show(ThuchienThutu, b);
        
        now.setFont(new java.awt.Font("Arial", Font.PLAIN | Font.BOLD, 20));
        now.setBorder(null);
        
        next.setBorder(new MatteBorder(0, 0, 3, 0, new Color(255,102,0)));
        next.setForeground(new Color(255,102,0));
    }
    
    
    private void quaylai(JLabel quaylai, JLabel now, String b){
        CardLayout card = (CardLayout) ThuchienThutu.getLayout();
        card.show(ThuchienThutu, b);
        
        quaylai.setBorder(new MatteBorder(0, 0, 3, 0, new Color(255,102,0)));
        
        now.setFont(new java.awt.Font("Arial", Font.PLAIN | Font.BOLD, 20));
        now.setForeground(Color.GRAY);
        now.setBorder(null);
    }
    
    private void Next_Suatchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_Suatchieu
        next(Chonsc, Chonphim, "ChonSuatchieu");
    }//GEN-LAST:event_Next_Suatchieu

    private void Return_chonphim(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_chonphim
        quaylai(Chonphim, Chonsc, "ChonPhim");
    }//GEN-LAST:event_Return_chonphim

    private void Next_Anvat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_Anvat
        next(Chonav, Chongh, "ChonAnvat");
    }//GEN-LAST:event_Next_Anvat

    private void Return_ChonSuatchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ChonSuatchieu
        quaylai(Chonsc, Chongh, "ChonSuatchieu");
    }//GEN-LAST:event_Return_ChonSuatchieu

    private void Next_ChonGhe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_ChonGhe
        next(Chongh, Chonsc, "ChonGhe");
    }//GEN-LAST:event_Next_ChonGhe

    private void Return_ChonGhe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ChonGhe
        quaylai(Chongh, Chonav, "ChonGhe");
    }//GEN-LAST:event_Return_ChonGhe

    private void Next_Thanhtoan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_Thanhtoan
        next(Chontt, Chonav, "Thanhtoan");
    }//GEN-LAST:event_Next_Thanhtoan

    private void Return_ChonAnvat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ChonAnvat
        quaylai(Chonav, Chontt, "ChonAnvat");
    }//GEN-LAST:event_Return_ChonAnvat

    private void Change_Color(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Color
        JButton clickedButton = (JButton) evt.getSource();

        Color currentColor = clickedButton.getBackground();

        if (currentColor.equals(new Color(255,102,0))) {
            clickedButton.setBackground(new Color(238,238,238)); // Nếu đang đỏ → thành trắng
        } else {
            clickedButton.setBackground(new Color(255,102,0)); // Nếu chưa đỏ → thành đỏ
}

    }//GEN-LAST:event_Change_Color

    private void ChuyenGiaodienMuave(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenGiaodienMuave
        CardLayout card = (CardLayout) GiaodienThanhphan.getLayout();
        card.show(GiaodienThanhphan, "GiaodienMuave");
    }//GEN-LAST:event_ChuyenGiaodienMuave

    private void ChuyenGiaodienTrangchu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenGiaodienTrangchu
        CardLayout card = (CardLayout) GiaodienThanhphan.getLayout();
        card.show(GiaodienThanhphan, "GiaodienTrangchu");
    }//GEN-LAST:event_ChuyenGiaodienTrangchu

    private void Next_Movie(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_Movie
        currentIndex = (currentIndex + 1) % cardNames.length;
        qaz.show(DemoHoatdong, cardNames[currentIndex]);
    }//GEN-LAST:event_Next_Movie

    private void Previous_Movie(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Previous_Movie
        currentIndex = (currentIndex + 1 + cardNames.length) % cardNames.length;
        qaz.show(DemoHoatdong, cardNames[currentIndex]);
    }//GEN-LAST:event_Previous_Movie

    private void ChuyenGiaodienCanhan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenGiaodienCanhan
        CardLayout card = (CardLayout) GiaodienThanhphan.getLayout();
        card.show(GiaodienThanhphan, "GiaodienCanhan");
    }//GEN-LAST:event_ChuyenGiaodienCanhan

    private void btnDangxuatReturnLog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatReturnLog
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnDangxuatReturnLog

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JLabel Alien;
    private javax.swing.JPanel Anvat;
    private javax.swing.JLabel Avatar_fake;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton Baprangbo;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JPanel Chaomung;
    private javax.swing.JPanel ChoNgoi;
    private javax.swing.JPanel ChonAnvat;
    private javax.swing.JPanel ChonGhe;
    private javax.swing.JPanel ChonPhim;
    private javax.swing.JPanel ChonSuatchieu;
    private javax.swing.JLabel Chonav;
    private javax.swing.JLabel Chongh;
    private javax.swing.JLabel Chonphim;
    private javax.swing.JLabel Chonsc;
    private javax.swing.JLabel Chontt;
    private javax.swing.JButton Coca;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JLabel Damua1;
    private javax.swing.JLabel Dangchon;
    private javax.swing.JPanel Decor1;
    private javax.swing.JLabel Decor10;
    private javax.swing.JLabel Decor11;
    private javax.swing.JLabel Decor12;
    private javax.swing.JLabel Decor13;
    private javax.swing.JLabel Decor14;
    private javax.swing.JLabel Decor15;
    private javax.swing.JLabel Decor16;
    private javax.swing.JLabel Decor2;
    private javax.swing.JLabel Decor3;
    private javax.swing.JLabel Decor4;
    private javax.swing.JLabel Decor5;
    private javax.swing.JLabel Decor6;
    private javax.swing.JLabel Decor7;
    private javax.swing.JLabel Decor8;
    private javax.swing.JLabel Decor9;
    private javax.swing.JPanel DemoHoatdong;
    private javax.swing.JLabel Diadao;
    private javax.swing.JPanel Douong;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Ghetrong;
    private javax.swing.JPanel GiaodienCanhan;
    private javax.swing.JPanel GiaodienMuave;
    private javax.swing.JPanel GiaodienThanhphan;
    private javax.swing.JPanel GiaodienTrangchu;
    private javax.swing.JLabel Gioitinh;
    private javax.swing.JLabel Hoten;
    private javax.swing.JPanel KhungManhinh;
    private javax.swing.JLabel Manhinh;
    private javax.swing.JLabel Minecraft;
    private javax.swing.JLabel MovieNaruto;
    private javax.swing.JLabel Ngaychieu;
    private javax.swing.JLabel Ngaychieu1;
    private javax.swing.JLabel Ngaychieu2;
    private javax.swing.JLabel Ngaychieu3;
    private javax.swing.JLabel Ngaychieu4;
    private javax.swing.JLabel Ngaychieu5;
    private javax.swing.JLabel Ngaysinh;
    private javax.swing.JLabel Ngaytao;
    private javax.swing.JLabel Poster;
    private javax.swing.JLabel Poster1;
    private javax.swing.JLabel Poster2;
    private javax.swing.JLabel Poster3;
    private javax.swing.JLabel Sdt;
    private javax.swing.JLabel Sodu;
    private javax.swing.JLabel Sodutaikhoan;
    private javax.swing.JLabel Tennguoidung;
    private javax.swing.JPanel Thanhtoan;
    private javax.swing.JLabel ThongtinCanhan;
    private javax.swing.JPanel Thucan;
    private javax.swing.JPanel ThuchienThutu;
    private javax.swing.JPanel Thutu;
    private javax.swing.JLabel Tien;
    private javax.swing.JLabel Tien1;
    private javax.swing.JLabel TienphaiThanhtoan;
    private javax.swing.JLabel TieudeAnvat;
    private javax.swing.JLabel TongThanhtoan;
    private javax.swing.JLabel Tongtien;
    private javax.swing.JLabel Tongtien1;
    private javax.swing.JPanel Trangchu;
    private javax.swing.JLabel TxNgaychieu;
    private javax.swing.JLabel TxNgaychieu1;
    private javax.swing.JLabel TxNgaychieu2;
    private javax.swing.JLabel TxNgaychieu3;
    private javax.swing.JLabel Vd_truyxuat;
    private javax.swing.JLabel Vd_truyxuat2;
    private javax.swing.JPanel Ve;
    private javax.swing.JPanel Ve_Ghe;
    private javax.swing.JPanel Ve_LC;
    private javax.swing.JPanel Ve_Thanhtoan;
    private javax.swing.JLabel Voucher;
    private javax.swing.JButton btnCanhan;
    private testlib.RoundedButton btnDangxuat;
    private javax.swing.JButton btnMuave;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private testlib.RoundedButton btnQuaylaiAnvat;
    private testlib.RoundedButton btnQuaylaiChonGhe;
    private testlib.RoundedButton btnQuaylaiPhim;
    private testlib.RoundedButton btnQuaylaiSuatchieu;
    private javax.swing.JButton btnTrangchu;
    private testlib.RoundedButton btnXacnhanThanhtoan;
    private testlib.RoundedButton btn_next_Anvat;
    private testlib.RoundedButton btn_next_Ghe;
    private testlib.RoundedButton btn_next_Suatchieu;
    private testlib.RoundedButton btn_next_Thanhtoan;
    private javax.swing.JComboBox<String> cbVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel nentrang;
    private javax.swing.JTable tbAnvat;
    private javax.swing.JTable tbPhim;
    private javax.swing.JTable tbSuatchieu;
    private testlib.RoundedTextField txDotuoi;
    private testlib.RoundedTextField txDotuoi1;
    private testlib.RoundedTextField txDotuoi2;
    private testlib.RoundedTextField txDotuoi3;
    private javax.swing.JLabel txEmail;
    private javax.swing.JLabel txGhe;
    private javax.swing.JLabel txGhe1;
    private javax.swing.JLabel txGhe2;
    private javax.swing.JLabel txGioitinh;
    private javax.swing.JLabel txHoten;
    private javax.swing.JLabel txLichchieu;
    private javax.swing.JLabel txLichchieu1;
    private javax.swing.JLabel txLichchieu2;
    private javax.swing.JLabel txLogo;
    private javax.swing.JLabel txNgaysinh;
    private javax.swing.JLabel txNgaytao;
    private javax.swing.JLabel txSdt;
    private javax.swing.JLabel txTenPhim;
    private javax.swing.JLabel txTenPhim1;
    private javax.swing.JLabel txTenPhim2;
    private javax.swing.JLabel txTenPhim3;
    private javax.swing.JLabel txTheloai;
    private javax.swing.JLabel txTheloai1;
    private javax.swing.JLabel txTheloai2;
    private javax.swing.JLabel txTheloai3;
    private javax.swing.JLabel txThoiluong;
    private javax.swing.JLabel txThoiluong1;
    private javax.swing.JLabel txThoiluong2;
    private javax.swing.JLabel txThoiluong3;
    // End of variables declaration//GEN-END:variables
}
