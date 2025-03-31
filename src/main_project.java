/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import gui.login;
import gui.register;
import javax.swing.*;
import java.awt.*;
public class main_project {
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
          
            login loginFrame = new login();
            
            // Đặt vị trí của login form ra giữa màn hình
            loginFrame.setLocationRelativeTo(null);
            
           
            loginFrame.setVisible(true);
            
      
            loginFrame.jButton2.addActionListener(e -> {
                
                register registerFrame = new register();
                
                
                registerFrame.setLocationRelativeTo(null);
                
            
                registerFrame.setVisible(true);
                
               
                loginFrame.setVisible(false);
            });
        });
    }
}
