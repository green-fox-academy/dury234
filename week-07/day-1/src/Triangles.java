import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

        // adjust side length and number of small triangles in side of the big one

        int sideLength = 20;
        int trianglesInFirstRow = 8;

        for (int i = 0; i < trianglesInFirstRow; i++ ) {
            graphics.drawLine(1 + i * sideLength / 2, HEIGHT - i * (int)(Math.sin(Math.toRadians(60)) * sideLength) - 20, (sideLength * trianglesInFirstRow + 1) - i * sideLength / 2, HEIGHT - i * (int)(Math.sin(Math.toRadians(60)) * sideLength) - 20);
            graphics.drawLine((sideLength * trianglesInFirstRow + 1) - (i + 1) * sideLength, HEIGHT - 20, (sideLength * trianglesInFirstRow + 1) -  (i + 1) * sideLength / 2, HEIGHT - 20 - (i + 1) * (int)(Math.sin(Math.toRadians(60)) * sideLength));
            graphics.drawLine(1 + (i + 1) * sideLength, HEIGHT - 20, 1 + (i + 1) * sideLength / 2, HEIGHT - 20 - (i + 1) * (int)(Math.sin(Math.toRadians(60)) * sideLength));
        }

    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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