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

public class RoundedButton extends JButton {
    private int arcWidth;
    private int arcHeight;

    public RoundedButton() {
        this(20, 20);
    }

    public RoundedButton(int arcWidth, int arcHeight) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        setOpaque(false); // Ngăn JPanel vẽ nền trắng
        setContentAreaFilled(false); // Ngăn JButton vẽ nền gốc
        setBackground(Color.black); // Màu nền của nút (tùy chỉnh)
        setForeground(Color.white); // Màu chữ
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Đảm bảo chỉ vẽ trong phạm vi nút, tránh tràn viền
        int width = getWidth() - 1;
        int height = getHeight() - 1;

        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);

        g2d.dispose();
        super.paintComponent(g); // Giữ nguyên text
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc đúng kích thước
        g2d.setColor(Color.BLACK);
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);

        g2d.dispose();
    }
}