import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void drawCircleFractiles(Graphics g, int middleX, int middleY, int radius) {
        g.drawOval(middleX - radius, middleY - radius, radius * 2, radius * 2);

        if (radius > 20) {
            drawCircleFractiles(g, middleX, middleY - (radius / 2), radius / 2);
            drawCircleFractiles(g, (int) (middleX - (Math.cos(Math.toRadians(30)) * radius / 2)), (int) (middleY + (Math.sin(Math.toRadians(30)) * radius / 2)), radius / 2);
            drawCircleFractiles(g, (int) (middleX + (Math.cos(Math.toRadians(30)) * radius / 2)), (int) (middleY + (Math.sin(Math.toRadians(30)) * radius / 2)), radius / 2);
        }
    }


    public static void drawImage(Graphics graphics){
        drawCircleFractiles(graphics, WIDTH / 2, HEIGHT / 2, WIDTH / 2);


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