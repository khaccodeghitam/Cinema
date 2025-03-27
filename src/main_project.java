/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import ql_cinema.login;
import ql_cinema.register;
import javax.swing.*;
import java.awt.*;
public class main_project {
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Tạo giao diện login
            login loginFrame = new login();
            
            // Đặt vị trí của login form ra giữa màn hình
            loginFrame.setLocationRelativeTo(null);
            
            // Hiển thị login form
            loginFrame.setVisible(true);
            
            // Thêm sự kiện cho nút Đăng Ký
            loginFrame.jButton2.addActionListener(e -> {
                // Tạo giao diện register
                register registerFrame = new register();
                
                // Đặt vị trí của register form ra giữa màn hình
                registerFrame.setLocationRelativeTo(null);
                
                // Hiển thị register form
                registerFrame.setVisible(true);
                
                // Ẩn login form
                loginFrame.setVisible(false);
            });
        });
    }
}
