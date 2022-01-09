import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawImage(Graphics graphics) {

        int xHelp = (WIDTH / 2);

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 12; k++) {

                    graphics.setColor(Color.green);
                    graphics.drawLine(10 + j * xHelp, 10 + i * xHelp + k * (xHelp / 12), 20 + j * xHelp + k * (xHelp / 12), i * xHelp + xHelp - 10);

                    graphics.setColor(new Color(108, 59, 193));
                    graphics.drawLine(10 + j * xHelp + k * (xHelp / 12), 10 + i * xHelp, xHelp - 10 + j * xHelp, 20 + i * xHelp + k * (xHelp / 12));
                }
            }
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