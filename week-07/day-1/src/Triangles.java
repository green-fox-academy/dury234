import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

        int sideLength = WIDTH / 21;

        for (int i = 0, j = 20; i < 21; i++, j--) {
            graphics.drawLine(i * sideLength / 2, HEIGHT - i * (int)(Math.sin(Math.toRadians(60)) * sideLength) - 20, WIDTH - i * sideLength / 2, HEIGHT - i * (int)(Math.sin(Math.toRadians(60)) * sideLength) - 20);
            graphics.drawLine(i * sideLength, HEIGHT - 20, i * sideLength / 2 + WIDTH / 2, HEIGHT - 20 - j * (int)(Math.sin(Math.toRadians(60)) * sideLength));
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