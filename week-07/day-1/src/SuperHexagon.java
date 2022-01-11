import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

    // function which draws one hexagon
    public static void drawHexagon(Graphics graphics, int topLeftX, int topLeftY, int sideLength) {
        int[] xPoints = {topLeftX, topLeftX + sideLength, topLeftX + sideLength + sideLength / 2, topLeftX + sideLength, topLeftX, topLeftX - sideLength / 2};
        int[] yPoints = {topLeftY, topLeftY, (int) (topLeftY + (Math.sin(Math.toRadians(60)) * sideLength)), (int) (topLeftY + 2 * (Math.sin(Math.toRadians(60)) * sideLength)), (int) (topLeftY + 2 * (Math.sin(Math.toRadians(60)) * sideLength)), (int) (topLeftY + (Math.sin(Math.toRadians(60)) * sideLength))};
        graphics.drawPolygon(xPoints, yPoints, 6);
    }

    // function that draws one vertical line of hexagons
    public static void drawVertLineOfHexs(Graphics graphics, int numberOfHexs, int topLX, int topLY, int sideLength) {
        for (int i = 0; i < numberOfHexs; i++) {
            drawHexagon(graphics, topLX, (int) (topLY + i * (2 * (Math.sin(Math.toRadians(60)) * sideLength))), sideLength);
        }
    }


    // this is little bit messy but working, draws superhexagon with customizable number of hexes in a side
    public static void drawSuperHexagon(Graphics graphics, int hexesInSide, int topLX, int topLY, int smallHexSideLength) {
        for (int i = hexesInSide, j = 3 * hexesInSide - 2, k = 0, l = 2 * hexesInSide - 2; k < 2 * hexesInSide - 1; i++, j--, k++, l--) {
            if (j > i) {
                drawVertLineOfHexs(graphics, i, (int) (topLX + k * (smallHexSideLength * 1.5)), (int) (topLY - k * (Math.sin(Math.toRadians(60)) * smallHexSideLength)), smallHexSideLength);
            } else {
                drawVertLineOfHexs(graphics, j, (int) (topLX + k * (smallHexSideLength * 1.5)), (int) (topLY - l * (Math.sin(Math.toRadians(60)) * smallHexSideLength)), smallHexSideLength);
            }
        }
    }

    public static void drawImage(Graphics graphics) {
        drawSuperHexagon(graphics, 7, 50, 120, 20);
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