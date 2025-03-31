/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class UI {
 public static void addPlaceHolderEffect(JTextField textField, String placeholder) {
    textField.setForeground(Color.GRAY);
    
    // Kiểm tra nếu là JPasswordField để đặc biệt xử lý
    if (textField instanceof JPasswordField) {
        JPasswordField passwordField = (JPasswordField) textField;
        passwordField.setEchoChar((char) 0); // Tắt việc hiển thị ký tự mật khẩu
        passwordField.setText(placeholder);
    } else {
        textField.setText(placeholder);
    }
    
    textField.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (textField instanceof JPasswordField) {
                JPasswordField passwordField = (JPasswordField) textField;
                if (String.valueOf(passwordField.getPassword()).equals(placeholder)) {
                    passwordField.setText("");
                    passwordField.setEchoChar('●'); // Bật việc ẩn ký tự mật khẩu
                    passwordField.setForeground(Color.BLACK);
                }
            } else {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (textField instanceof JPasswordField) {
                JPasswordField passwordField = (JPasswordField) textField;
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setEchoChar((char) 0); // Tắt việc ẩn ký tự
                    passwordField.setText(placeholder);
                    passwordField.setForeground(Color.GRAY);
                }
            } else {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        }
    });
}
}
