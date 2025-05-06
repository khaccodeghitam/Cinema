package gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This class manages movie poster images and their storage paths
 */
public class MoviePosterManager {
    
    private static final String DEFAULT_IMAGE_DIR = "posters/";
    
    /**
     * Save an image file to a movie-specific directory
     * 
     * @param movieId The ID of the movie
     * @param sourceFile The source image file to copy
     * @return The path to the saved image
     * @throws IOException If there's an error saving the image
     */
    public static String saveMoviePoster(String movieId, File sourceFile) throws IOException {
        // Create directory if it doesn't exist
        File directory = new File(DEFAULT_IMAGE_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        // Determine target file path (using movie ID in filename)
        String fileName = "poster_" + movieId.replaceAll("[^a-zA-Z0-9]", "_") + 
                getFileExtension(sourceFile.getName());
        
        File targetFile = new File(directory, fileName);
        
        // Copy image using ImageIO
        Image img = ImageIO.read(sourceFile);
        ImageIO.write(toBufferedImage(img), getFileExtension(sourceFile.getName()).substring(1), 
                targetFile);
        
        return targetFile.getPath();
    }
    
    /**
     * Load a movie poster from the given path
     * 
     * @param imagePath Path to the image file
     * @return The loaded Image object
     * @throws IOException If there's an error loading the image
     */
    public static Image loadMoviePoster(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            throw new IOException("Không tìm thấy file ảnh: " + imagePath);
        }
        
        return ImageIO.read(imageFile);
    }
    
    /**
     * Convert an Image to BufferedImage
     */
    private static java.awt.image.BufferedImage toBufferedImage(Image img) {
        if (img instanceof java.awt.image.BufferedImage) {
            return (java.awt.image.BufferedImage) img;
        }
        
        // Create a buffered image with transparency
        java.awt.image.BufferedImage bimage = new java.awt.image.BufferedImage(
                img.getWidth(null), img.getHeight(null), 
                java.awt.image.BufferedImage.TYPE_INT_ARGB);
        
        // Draw the image on to the buffered image
        java.awt.Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        
        return bimage;
    }
    
    /**
     * Get file extension from filename
     */
    private static String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex > 0) {
            return filename.substring(dotIndex);
        }
        return ".jpg"; // Default extension
    }
}