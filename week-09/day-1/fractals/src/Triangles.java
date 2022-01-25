import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void drawTriangleRev(Graphics graphics, int leftX, int leftY, int sideLength) {
        int[] x = {leftX, leftX + sideLength, leftX + (sideLength / 2)};
        int[] y = {leftY, leftY, (int) (leftY + (Math.sin(Math.toRadians(60)) * sideLength))};
        graphics.drawPolygon(x, y, 3);
    }

    public static void drawTrianglesFractal(Graphics graphics, int leftX, int leftY, int sideLength) {

        int[] x = {leftX, leftX + sideLength, leftX + (sideLength / 2)};
        int[] y = {leftY, leftY, (int) (leftY - (Math.sin(Math.toRadians(60)) * sideLength))};
        graphics.drawPolygon(x, y, 3);

        if (sideLength > 10) {
            drawTrianglesFractal(graphics, leftX - (sideLength / 4), (int) (leftY - (Math.sin(Math.toRadians(60)) * sideLength) / 2), sideLength / 2);
            drawTrianglesFractal(graphics, leftX + (sideLength * 3 / 4), (int) (leftY - (Math.sin(Math.toRadians(60)) * sideLength) / 2), sideLength / 2);
            drawTrianglesFractal(graphics, leftX + (sideLength / 4), (int) (leftY + (Math.sin(Math.toRadians(60)) * sideLength) / 2), sideLength / 2);
        }
    }


    public static void drawImage(Graphics graphics){

        drawTrianglesFractal(graphics, WIDTH / 4, HEIGHT / 2, WIDTH / 2);
        drawTriangleRev(graphics, 0, (int) ((HEIGHT / 2) - Math.sin(Math.toRadians(60)) * (WIDTH / 2)), WIDTH);

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