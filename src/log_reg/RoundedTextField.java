package log_reg;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedTextField extends JTextField {
    private int arcWidth = 20;  // Độ cong ngang
    private int arcHeight = 20; // Độ cong dọc

    // Constructor không tham số để NetBeans có thể khởi tạo
    public RoundedTextField() {
        this(20); 
    }

    // Constructor có tham số
 public RoundedTextField(int columns) {
    super(columns);
    setOpaque(false); // Bỏ nền gốc
    setBackground(Color.WHITE); // Đặt màu nền
    setForeground(Color.BLACK); // Đặt màu chữ
    setFont(new Font("Arial", Font.PLAIN, 14)); // Chọn font chữ rõ ràng
    setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Tạo padding trong
}



@Override
protected void paintComponent(Graphics g) {
    
    
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Vẽ nền bo góc
    g2.setColor(getBackground()); // Đặt màu nền
    g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arcWidth, arcHeight));

    g2.dispose();

    // Chỉ vẽ chữ, không gọi super.paintComponent(g);
    setOpaque(false); 
    setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Tạo padding
    super.paintComponent(g);
}



@Override
protected void paintBorder(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    // Vẽ viền bo góc
    g2.setColor(getForeground());
    g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight));
    
    g2.dispose();
}



    // Getter & Setter cho arcWidth và arcHeight
    public int getArcWidth() {
        return arcWidth;
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
        repaint();
    }

    public int getArcHeight() {
        return arcHeight;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
        repaint();
    }
}
