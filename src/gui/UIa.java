package gui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;


public class UIa extends javax.swing.JFrame {
    
    private JButton selectedButton = null;
    public CardLayout card = new CardLayout();
    
    public UIa() {
        initComponents();
        formTrinhbay.setLayout(card);
        formTrinhbay.add(new IntroGUI(), "IntroGUI");
        formTrinhbay.add(new PhimGUI(), "PhimGUI");
        formTrinhbay.add(new LichchieuGUI(), "LichchieuGUI");
        formTrinhbay.add(new PhongchieuGUI(), "PhongchieuGUI");
        formTrinhbay.add(new NhaphanphoiGUI(), "NhaphanphoiGUI");
        formTrinhbay.add(new AnvatGUI(), "AnvatGUI");
        formTrinhbay.add(new UudaiGUI(), "UudaiGUI");
        formTrinhbay.add(new NhanvienGUI(), "NhanvienGUI");
        formTrinhbay.add(new KhachhangGUI(), "KhachhangGUI");
        formTrinhbay.add(new ThongkeGUI(), "ThongkeGUI");
        formTrinhbay.add(new HopdongGUI(), "HopdongGUI");
        formTrinhbay.add(new TaikhoanGUI(), "TaikhoanGUI");
        formTrinhbay.add(new PhanquyenGUI(), "PhanquyenGUI");
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Chucnang = new javax.swing.JPanel();
        buttonPhim = new testlib.RoundedButton();
        buttonLichchieu = new testlib.RoundedButton();
        buttonPhongchieu = new testlib.RoundedButton();
        buttonAnvat = new testlib.RoundedButton();
        buttonUudai = new testlib.RoundedButton();
        buttonNhanvien = new testlib.RoundedButton();
        buttonKhachhang = new testlib.RoundedButton();
        buttonThongke = new testlib.RoundedButton();
        buttonHopdong = new testlib.RoundedButton();
        buttonNhaphanphoi = new testlib.RoundedButton();
        closeChucnang = new javax.swing.JLabel();
        btnDangxuat = new testlib.RoundedButton();
        btnTaikhoan = new testlib.RoundedButton();
        btnPhanquyen = new testlib.RoundedButton();
        openChucnang = new javax.swing.JLabel();
        formTrinhbay = new javax.swing.JPanel();
        line = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1229, 645));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Chucnang.setBackground(new java.awt.Color(0, 0, 0));
        Chucnang.setPreferredSize(new java.awt.Dimension(100, 500));

        buttonPhim.setText("Phim");
        buttonPhim.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenPhim(evt);
            }
        });

        buttonLichchieu.setText("Lịch chiếu");
        buttonLichchieu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonLichchieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonLichchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenLichchieu(evt);
            }
        });

        buttonPhongchieu.setText("Phòng chiếu");
        buttonPhongchieu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonPhongchieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonPhongchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenPhongchieu(evt);
            }
        });

        buttonAnvat.setText("Ăn vặt");
        buttonAnvat.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonAnvat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenAnvat(evt);
            }
        });

        buttonUudai.setText("Ưu đãi");
        buttonUudai.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonUudai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonUudai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenUudai(evt);
            }
        });

        buttonNhanvien.setText("Nhân viên");
        buttonNhanvien.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenNhanvien(evt);
            }
        });

        buttonKhachhang.setText("Khách hàng");
        buttonKhachhang.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenKhachhang(evt);
            }
        });

        buttonThongke.setText("Thống kê");
        buttonThongke.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenThongke(evt);
            }
        });

        buttonHopdong.setText("Hợp đồng");
        buttonHopdong.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonHopdong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonHopdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenHopdong(evt);
            }
        });

        buttonNhaphanphoi.setText("Nhà phân phối");
        buttonNhaphanphoi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonNhaphanphoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        buttonNhaphanphoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenNhaphanphoi(evt);
            }
        });

        closeChucnang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        closeChucnang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeChucnang(evt);
            }
        });

        btnDangxuat.setBackground(new java.awt.Color(153, 0, 0));
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Plastic-Mini-Button-Turn-Off.24.png"))); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnLog(evt);
            }
        });

        btnTaikhoan.setText("Tài khoản");
        btnTaikhoan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        btnTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenTaikhoan(evt);
            }
        });

        btnPhanquyen.setText("Phân quyền");
        btnPhanquyen.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPhanquyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Color(evt);
            }
        });
        btnPhanquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenPhanquyen(evt);
            }
        });

        javax.swing.GroupLayout ChucnangLayout = new javax.swing.GroupLayout(Chucnang);
        Chucnang.setLayout(ChucnangLayout);
        ChucnangLayout.setHorizontalGroup(
            ChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChucnangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChucnangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeChucnang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChucnangLayout.createSequentialGroup()
                        .addGroup(ChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonUudai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNhaphanphoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ChucnangLayout.setVerticalGroup(
            ChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChucnangLayout.createSequentialGroup()
                .addComponent(closeChucnang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(buttonLichchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(buttonAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonUudai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonHopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(buttonNhaphanphoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnPhanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        openChucnang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        openChucnang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icons8-Ios7-Editing-Line-Width.48.png"))); // NOI18N
        openChucnang.setText("Quản lý");
        openChucnang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenChucnang(evt);
            }
        });

        formTrinhbay.setBackground(new java.awt.Color(204, 204, 204));
        formTrinhbay.setLayout(new java.awt.CardLayout());

        line.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Chucnang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openChucnang)
                .addGap(35, 35, 35)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formTrinhbay, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(Chucnang, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(openChucnang)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(formTrinhbay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        Chucnang.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenChucnang(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenChucnang
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<181; i+=5){
                    Chucnang.setSize(i, 639);
                    try{
                        Thread.sleep(5);
                    }
                    catch (InterruptedException ex){}
                }
            }
        }).start();
    }//GEN-LAST:event_OpenChucnang

    private void Change_Color(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Color
              
        JButton clickedButton = (JButton) evt.getSource();

        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBackground(Color.black);
        }

        selectedButton = clickedButton;
        selectedButton.setBackground(Color.gray);
    }//GEN-LAST:event_Change_Color

    
    private void closeChucnang(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeChucnang
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=181; i>0; i-=5){
                    Chucnang.setSize(i, 639);
                    try{
                        Thread.sleep(5);
                    }
                    catch (InterruptedException ex){}
                }
            }
        }).start();
    }//GEN-LAST:event_closeChucnang

    private void ChuyenLichchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenLichchieu
        
        card.show(formTrinhbay, "LichchieuGUI");
    }//GEN-LAST:event_ChuyenLichchieu

    private void ChuyenPhim(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenPhim
        
        card.show(formTrinhbay, "PhimGUI");       
    }//GEN-LAST:event_ChuyenPhim

    private void ChuyenPhongchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenPhongchieu
        
        card.show(formTrinhbay, "PhongchieuGUI");
        
    }//GEN-LAST:event_ChuyenPhongchieu

    private void ChuyenNhaphanphoi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenNhaphanphoi
        
        card.show(formTrinhbay, "NhaphanphoiGUI");
        
    }//GEN-LAST:event_ChuyenNhaphanphoi

    private void ChuyenAnvat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenAnvat
        card.show(formTrinhbay, "AnvatGUI");
        
    }//GEN-LAST:event_ChuyenAnvat

    private void ChuyenUudai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenUudai
        card.show(formTrinhbay, "UudaiGUI");
        
    }//GEN-LAST:event_ChuyenUudai

    private void ChuyenNhanvien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenNhanvien
        card.show(formTrinhbay, "NhanvienGUI");
        
    }//GEN-LAST:event_ChuyenNhanvien

    private void ChuyenKhachhang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenKhachhang
        card.show(formTrinhbay, "KhachhangGUI");
        
    }//GEN-LAST:event_ChuyenKhachhang

    private void ChuyenThongke(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenThongke
       card.show(formTrinhbay, "ThongkeGUI");
        
    }//GEN-LAST:event_ChuyenThongke

    private void ChuyenHopdong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenHopdong
        card.show(formTrinhbay, "HopdongGUI");
        
    }//GEN-LAST:event_ChuyenHopdong

    private void ReturnLog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnLog
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_ReturnLog

    private void ChuyenTaikhoan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenTaikhoan
        card.show(formTrinhbay, "TaikhoanGUI");
    }//GEN-LAST:event_ChuyenTaikhoan

    private void ChuyenPhanquyen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenPhanquyen
        card.show(formTrinhbay, "PhanquyenGUI");
    }//GEN-LAST:event_ChuyenPhanquyen

    
    
    
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
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chucnang;
    private testlib.RoundedButton btnDangxuat;
    private testlib.RoundedButton btnPhanquyen;
    private testlib.RoundedButton btnTaikhoan;
    private testlib.RoundedButton buttonAnvat;
    private testlib.RoundedButton buttonHopdong;
    private testlib.RoundedButton buttonKhachhang;
    private testlib.RoundedButton buttonLichchieu;
    private testlib.RoundedButton buttonNhanvien;
    private testlib.RoundedButton buttonNhaphanphoi;
    private testlib.RoundedButton buttonPhim;
    private testlib.RoundedButton buttonPhongchieu;
    private testlib.RoundedButton buttonThongke;
    private testlib.RoundedButton buttonUudai;
    private javax.swing.JLabel closeChucnang;
    private javax.swing.JPanel formTrinhbay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel line;
    private javax.swing.JLabel openChucnang;
    // End of variables declaration//GEN-END:variables
}
