package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageHandler {
    private JPanel displayPanel;
    private BufferedImage selectedImage;
    private File selectedFile;
    
    public ImageHandler(JPanel displayPanel) {
        this.displayPanel = displayPanel;
        // Set default background to black so users know there's no image yet
        this.displayPanel.setBackground(Color.BLACK);
    }
    
    /**
     * Attaches a click listener to the specified panel to select an image
     * @param clickPanel the panel to click on to select an image
     */
    public void attachClickListener(JPanel clickPanel) {
        clickPanel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor to indicate clickable
        
        clickPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectAndDisplayImage();
            }
        });
    }
    
    /**
     * Opens a file chooser dialog to select an image and displays it on the panel
     */
   private void selectAndDisplayImage() {
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Image Files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);
    
    int result = fileChooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        try {
            selectedFile = fileChooser.getSelectedFile();
            selectedImage = ImageIO.read(selectedFile);
            
            // Tạo một JPanel tùy chỉnh với kích thước đầy đủ
            displayPanel.removeAll();
            displayPanel.setLayout(new BorderLayout());
            
            JPanel imagePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (selectedImage != null) {
                        Image scaledImage = getScaledImage(selectedImage, displayPanel.getWidth(), displayPanel.getHeight());
                        int x = (displayPanel.getWidth() - scaledImage.getWidth(null)) / 2;
                        int y = (displayPanel.getHeight() - scaledImage.getHeight(null)) / 2;
                        g.drawImage(scaledImage, x, y, null);
                    }
                }
                
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(displayPanel.getWidth(), displayPanel.getHeight());
                }
            };
            
            displayPanel.add(imagePanel, BorderLayout.CENTER);
            displayPanel.revalidate();
            displayPanel.repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                "Error loading image: " + ex.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    /**
     * Scales the image to fit within the specified dimensions while maintaining aspect ratio
     */
    private Image getScaledImage(BufferedImage src, int maxWidth, int maxHeight) {
        double ratio = Math.min(
                (double) maxWidth / src.getWidth(),
                (double) maxHeight / src.getHeight());
        
        int width = (int) (src.getWidth() * ratio);
        int height = (int) (src.getHeight() * ratio);
        
        BufferedImage resized = new BufferedImage(width, height, src.getType());
        Graphics2D g = resized.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(src, 0, 0, width, height, null);
        g.dispose();
        
        return resized;
    }
    
    /**
     * Returns the selected image file
     * @return the selected file or null if no image is selected
     */
    public File getSelectedFile() {
        return selectedFile;
    }
    
    /**
     * Returns the selected image
     * @return the selected image or null if no image is selected
     */
    public BufferedImage getSelectedImage() {
        return selectedImage;
    }
}