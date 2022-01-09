import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void drawCheckboard(Graphics graphics) {
        int size = WIDTH / 8;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                graphics.fillRect(j * 2 * size, i * 2 * size, size, size);
                graphics.fillRect(j * 2 * size + size, i * 2 * size + size, size, size);
            }
        }
    }

    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern

        drawCheckboard(graphics);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}