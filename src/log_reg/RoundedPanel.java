package log_reg;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package gui;
//
///**
// *
// * @author Admin
// */
//public class RoundedPanel extends JPanel {
//    private int arcWidth;
//    private int arcHeight;
//
//    // Constructor mặc định
//    public RoundedPanel() {
//        this(40, 40);
//    }
//
//    // Constructor có tham số
//    public RoundedPanel(int arcWidth, int arcHeight) {
//        this.arcWidth = arcWidth;
//        this.arcHeight = arcHeight;
//        setOpaque(false); // Cần để không bị JPanel che mất hình bo góc
//        setBackground(Color.WHITE);  //Tạo màu cơ bản trước vào lúc mới tạo
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Vẽ hình chữ nhật bo góc
//        g2d.setColor(getBackground());
//        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
//        
//        
//        // Cái này dùng để thêm viền, 
////        g2d.setColor(Color.BLACK);              -- Chọn màu viền
////        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);
//    }
//}
