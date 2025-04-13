/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log_reg;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;

public class RoundedLabel extends JLabel {

    private int radius = 20; // bo góc bao nhiêu độ

    public RoundedLabel(String text) {
        super(text);
        setOpaque(false); // để mình tự vẽ nền
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Vẽ viền nếu muốn
         Graphics2D g2 = (Graphics2D) g;
         g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
}
