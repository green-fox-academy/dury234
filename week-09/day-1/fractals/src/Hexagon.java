import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

    public static void drawHexagon(Graphics graphics, int topLeftX, int topLeftY, int sideLength) {
        int[] xPoints = {topLeftX, topLeftX + sideLength, topLeftX + sideLength * 3 / 2, topLeftX + sideLength, topLeftX, topLeftX - sideLength / 2};
        int[] yPoints = {topLeftY, topLeftY, (int) Math.round(topLeftY + (Math.sin(Math.toRadians(60)) * sideLength)), (int) Math.round(topLeftY + 2 * (Math.sin(Math.toRadians(60)) * sideLength)), (int) Math.round(topLeftY + 2 * (Math.sin(Math.toRadians(60)) * sideLength)), (int) Math.round(topLeftY + (Math.sin(Math.toRadians(60)) * sideLength))};
        graphics.drawPolygon(xPoints, yPoints, 6);
    }

    public static void drawHexagonFractile(Graphics graphics, int topLeftX, int topLeftY, int sideLength) {
        drawHexagon(graphics, topLeftX, topLeftY, sideLength);
        int height = (int) (2 * (Math.sin(Math.toRadians(60)) * sideLength));

        if (sideLength > 10) {
            //top row (left || right)
            drawHexagonFractile(graphics, topLeftX, topLeftY, sideLength / 3);
            drawHexagonFractile(graphics, topLeftX + sideLength * 2 / 3, topLeftY, sideLength / 3);

            //middle row (left || right)
            drawHexagonFractile(graphics, topLeftX - sideLength / 3, Math.round(topLeftY + (height / 3)), sideLength / 3);
            drawHexagonFractile(graphics, topLeftX + sideLength, Math.round(topLeftY + (height / 3)), sideLength / 3);

            //bottom row (left || right)
            drawHexagonFractile(graphics, topLeftX, Math.round(topLeftY + (2 * (height / 3))), sideLength / 3);
            drawHexagonFractile(graphics, topLeftX + sideLength * 2 / 3, Math.round(topLeftY + (2 * (height / 3))), sideLength / 3);


        }
    }


    public static void drawImage(Graphics graphics){
        drawHexagonFractile(graphics, (WIDTH / 4) - 1, 5, (WIDTH / 2) - 2);


    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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