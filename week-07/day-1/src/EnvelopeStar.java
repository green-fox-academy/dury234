import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawImage(Graphics graphics) {

        graphics.setColor(new Color(0x26E713));

        int half = WIDTH / 2;

        for (int i = 0; i < 13; i++) {
            graphics.drawLine(half, i * half / 12, half - (i * half / 12), half);
        }

        for (int i = 0; i < 13; i++) {
            graphics.drawLine(half, i * half / 12, half + (i * half / 12), half);
        }

        for (int i = 0; i < 13; i++) {
            graphics.drawLine(half - (i * half / 12), half, half, 2 * half - (i * half / 12));
        }

        for (int i = 0; i < 13; i++) {
            graphics.drawLine(half + (i * half / 12), half, half, 2 * half - (i * half / 12));
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