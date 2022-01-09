import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics){

        for (int i = 0; i < 12; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(10, 10 + i * (HEIGHT / 12), 10 + i * (WIDTH / 12), HEIGHT - 10);

            graphics.setColor(new Color(108, 59, 193));
            graphics.drawLine(10 + i * (WIDTH / 12), 10, WIDTH - 10, 10 + i * (HEIGHT / 12));
        }

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