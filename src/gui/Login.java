
package gui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dinhp
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        txtTaikhoan.setFocusable(false);
        txtMatkhau.setFocusable(false);
        GiaodienLog.setLayout(new CardLayout());
        GiaodienLog.add(Login, "Login");
        GiaodienLog.add(Register, "Register");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backround_tho = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        decor = new javax.swing.JLabel();
        GiaodienLog = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        dangnhap = new javax.swing.JLabel();
        txtTaikhoan = new testlib.RoundedTextField();
        txtMatkhau = new testlib.RoundedTextField();
        btnDangnhap = new testlib.RoundedButton();
        cauhoi = new javax.swing.JLabel();
        btnGiaodiendangki = new testlib.RoundedButton();
        Register = new javax.swing.JPanel();
        dangki = new javax.swing.JLabel();
        hoten = new javax.swing.JLabel();
        txthoten = new testlib.RoundedTextField();
        ngaysinh = new javax.swing.JLabel();
        txtngaysinh = new testlib.RoundedTextField();
        gioitinh = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtemail = new testlib.RoundedTextField();
        sodienthoai = new javax.swing.JLabel();
        txtsodienthoai = new testlib.RoundedTextField();
        matkhau = new javax.swing.JLabel();
        txtmatkhau = new testlib.RoundedTextField();
        btnDangki = new testlib.RoundedButton();
        cbgioitinh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(986, 550));

        backround_tho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backround_tho.png"))); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        decor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/decor_login.png"))); // NOI18N

        GiaodienLog.setBackground(new java.awt.Color(0, 0, 0));
        GiaodienLog.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(0, 0, 0));

        dangnhap.setBackground(new java.awt.Color(0, 0, 0));
        dangnhap.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        dangnhap.setForeground(new java.awt.Color(255, 255, 255));
        dangnhap.setText("ĐĂNG NHẬP");

        txtTaikhoan.setBackground(new java.awt.Color(153, 153, 153));
        txtTaikhoan.setForeground(new java.awt.Color(255, 255, 255));
        txtTaikhoan.setText(" Email hoặc số điện thoại");
        txtTaikhoan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchuDangnhap(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammoDangnhap(evt);
            }
        });
        txtTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reaction(evt);
            }
        });

        txtMatkhau.setBackground(new java.awt.Color(153, 153, 153));
        txtMatkhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatkhau.setText(" Mật khẩu");
        txtMatkhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchuMatkhau(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammoMatkhau(evt);
            }
        });
        txtMatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reaction2(evt);
            }
        });

        btnDangnhap.setBackground(new java.awt.Color(204, 0, 0));
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dangnhap(evt);
            }
        });

        cauhoi.setBackground(new java.awt.Color(0, 0, 0));
        cauhoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cauhoi.setForeground(new java.awt.Color(255, 255, 255));
        cauhoi.setText("Bạn chưa có tài khoản?");

        btnGiaodiendangki.setBackground(new java.awt.Color(204, 0, 0));
        btnGiaodiendangki.setText("Đăng kí");
        btnGiaodiendangki.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnGiaodiendangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaodienDangki(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiaodiendangki, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dangnhap)
                        .addComponent(txtTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cauhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(dangnhap)
                .addGap(18, 18, 18)
                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(cauhoi)
                .addGap(15, 15, 15)
                .addComponent(btnGiaodiendangki, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        GiaodienLog.add(Login, "Login");

        Register.setBackground(new java.awt.Color(0, 0, 0));

        dangki.setBackground(new java.awt.Color(0, 0, 0));
        dangki.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        dangki.setForeground(new java.awt.Color(255, 255, 255));
        dangki.setText("ĐĂNG KÍ");

        hoten.setBackground(new java.awt.Color(0, 0, 0));
        hoten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hoten.setForeground(new java.awt.Color(255, 255, 255));
        hoten.setText("Họ và tên:");

        txthoten.setBackground(new java.awt.Color(153, 153, 153));
        txthoten.setForeground(new java.awt.Color(255, 255, 255));
        txthoten.setText(" Họ và tên");
        txthoten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchuHoten(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammoHoten(evt);
            }
        });

        ngaysinh.setBackground(new java.awt.Color(0, 0, 0));
        ngaysinh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ngaysinh.setForeground(new java.awt.Color(255, 255, 255));
        ngaysinh.setText("Ngày sinh:");

        txtngaysinh.setBackground(new java.awt.Color(153, 153, 153));
        txtngaysinh.setForeground(new java.awt.Color(255, 255, 255));
        txtngaysinh.setText(" dd/mm/yyyy");
        txtngaysinh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchungaysinh(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammongaysinh(evt);
            }
        });

        gioitinh.setBackground(new java.awt.Color(0, 0, 0));
        gioitinh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gioitinh.setForeground(new java.awt.Color(255, 255, 255));
        gioitinh.setText("Giới tính:");

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email:");

        txtemail.setBackground(new java.awt.Color(153, 153, 153));
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setText(" Email");
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchuemail(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammoemail(evt);
            }
        });

        sodienthoai.setBackground(new java.awt.Color(0, 0, 0));
        sodienthoai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sodienthoai.setForeground(new java.awt.Color(255, 255, 255));
        sodienthoai.setText("Số điện thoại:");

        txtsodienthoai.setBackground(new java.awt.Color(153, 153, 153));
        txtsodienthoai.setForeground(new java.awt.Color(255, 255, 255));
        txtsodienthoai.setText(" Số điện thoại");
        txtsodienthoai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchusdt(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammosdt(evt);
            }
        });

        matkhau.setBackground(new java.awt.Color(0, 0, 0));
        matkhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        matkhau.setForeground(new java.awt.Color(255, 255, 255));
        matkhau.setText("Mật khẩu:");

        txtmatkhau.setBackground(new java.awt.Color(153, 153, 153));
        txtmatkhau.setForeground(new java.awt.Color(255, 255, 255));
        txtmatkhau.setText(" Nhập mật khẩu");
        txtmatkhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapchumatkhau(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lammomatkhau(evt);
            }
        });

        btnDangki.setBackground(new java.awt.Color(204, 0, 0));
        btnDangki.setText("Đăng kí");
        btnDangki.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N

        cbgioitinh.setBackground(new java.awt.Color(153, 153, 153));
        cbgioitinh.setForeground(new java.awt.Color(255, 255, 255));
        cbgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnLogin(evt);
            }
        });

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dangki)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                                .addComponent(hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sodienthoai)
                                    .addComponent(matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))))
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnDangki, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dangki)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoten)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gioitinh)
                    .addComponent(cbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngaysinh)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sodienthoai)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matkhau)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnDangki, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        GiaodienLog.add(Register, "Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logo)
                        .addGap(50, 50, 50)
                        .addComponent(backround_tho, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(decor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GiaodienLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GiaodienLog, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(backround_tho))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhapchu(JTextField a, String b){
        if (a.getText().equals(b)) {
            a.setText("");
            a.setForeground(Color.white);
        }
        else
            a.selectAll();
    }
    
    private void lammo(JTextField a, String b){
        if(a.getText().trim().isEmpty()){
            a.setText(b);
            a.setForeground(Color.white);
        }
    }

    
    private void nhapchuDangnhap(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchuDangnhap
        nhapchu(txtTaikhoan, " Email hoặc số điện thoại");
    }//GEN-LAST:event_nhapchuDangnhap

    private void lammoDangnhap(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammoDangnhap
        lammo(txtTaikhoan, " Email hoặc số điện thoại");
    }//GEN-LAST:event_lammoDangnhap

    private void nhapchuMatkhau(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchuMatkhau
        nhapchu(txtMatkhau, " Mật khẩu");
    }//GEN-LAST:event_nhapchuMatkhau

    private void lammoMatkhau(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammoMatkhau
        lammo(txtMatkhau, " Mật khẩu");
    }//GEN-LAST:event_lammoMatkhau

    private void Reaction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reaction
        txtTaikhoan.setFocusable(true);
        txtTaikhoan.requestFocusInWindow();
    }//GEN-LAST:event_Reaction

    private void Reaction2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reaction2
        txtMatkhau.setFocusable(true);
        txtMatkhau.requestFocusInWindow();
    }//GEN-LAST:event_Reaction2

    private void Dangnhap(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dangnhap
        String soDienThoai = txtTaikhoan.getText();
        String matKhau = txtMatkhau.getText();

        if(soDienThoai.equals("0123") && matKhau.equals("123")) {
            this.setVisible(false);

            new UIa().setVisible(true);
        }
        
        else if(soDienThoai.equals("0987") && matKhau.equals("987")){
            this.setVisible(false);
            new UIu().setVisible(true);
        } 
        
        else {
            JOptionPane.showMessageDialog(this, "Sai số điện thoại hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Dangnhap

    private void nhapchuHoten(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchuHoten
        nhapchu(txthoten, " Họ và tên");
    }//GEN-LAST:event_nhapchuHoten

    private void lammoHoten(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammoHoten
        lammo(txthoten, " Họ và tên");
    }//GEN-LAST:event_lammoHoten

    private void nhapchungaysinh(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchungaysinh
        nhapchu(txtngaysinh, " dd/mm/yyyy");
    }//GEN-LAST:event_nhapchungaysinh

    private void lammongaysinh(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammongaysinh
        lammo(txtngaysinh, " dd/mm/yyyy");
    }//GEN-LAST:event_lammongaysinh

    private void nhapchuemail(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchuemail
        nhapchu(txtemail, " Email");
    }//GEN-LAST:event_nhapchuemail

    private void lammoemail(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammoemail
        lammo(txtemail, " Email");
    }//GEN-LAST:event_lammoemail

    private void nhapchusdt(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchusdt
        nhapchu(txtsodienthoai, " Số điện thoại");
    }//GEN-LAST:event_nhapchusdt

    private void lammosdt(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammosdt
        lammo(txtsodienthoai, " Số điện thoại");
    }//GEN-LAST:event_lammosdt

    private void nhapchumatkhau(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapchumatkhau
        nhapchu(txtmatkhau, " Nhập mật khẩu");
    }//GEN-LAST:event_nhapchumatkhau

    private void lammomatkhau(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lammomatkhau
        lammo(txtmatkhau, " Nhập mật khẩu");
    }//GEN-LAST:event_lammomatkhau

    private void GiaodienDangki(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaodienDangki
        CardLayout card = (CardLayout) GiaodienLog.getLayout();
        card.show(GiaodienLog, "Register");
    }//GEN-LAST:event_GiaodienDangki

    private void ReturnLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnLogin
        CardLayout card = (CardLayout) GiaodienLog.getLayout();
        card.show(GiaodienLog, "Login");
    }//GEN-LAST:event_ReturnLogin


    
    
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiaodienLog;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel backround_tho;
    private testlib.RoundedButton btnDangki;
    private testlib.RoundedButton btnDangnhap;
    private testlib.RoundedButton btnGiaodiendangki;
    private javax.swing.JLabel cauhoi;
    private javax.swing.JComboBox<String> cbgioitinh;
    private javax.swing.JLabel dangki;
    private javax.swing.JLabel dangnhap;
    private javax.swing.JLabel decor;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gioitinh;
    private javax.swing.JLabel hoten;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel matkhau;
    private javax.swing.JLabel ngaysinh;
    private javax.swing.JLabel sodienthoai;
    private testlib.RoundedTextField txtMatkhau;
    private testlib.RoundedTextField txtTaikhoan;
    private testlib.RoundedTextField txtemail;
    private testlib.RoundedTextField txthoten;
    private testlib.RoundedTextField txtmatkhau;
    private testlib.RoundedTextField txtngaysinh;
    private testlib.RoundedTextField txtsodienthoai;
    // End of variables declaration//GEN-END:variables
}
