package testlib;

import javax.swing.*;
import java.awt.*;

public class RoundedTextField extends JTextField {
    private int arcWidth;
    private int arcHeight;

    public RoundedTextField() {
        this(20, 20);
    }

    public RoundedTextField(int arcWidth, int arcHeight) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        setOpaque(false);
        setBackground(new Color(204, 204, 204));
        setForeground(Color.BLACK);
        setBorder(null);
        setFont(new Font("Times New Roman", Font.PLAIN, 14));
        setMargin(new Insets(5, 10, 5, 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ nền bo góc
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);
        
        g2d.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc màu đen
        g2d.setColor(Color.BLACK);
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);

        g2d.dispose();
    }
}
