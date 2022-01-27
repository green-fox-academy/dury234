import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

    public static void squareGrid(Graphics graphics, int sideLength, int middleX, int middleY, int lineWidth) {
        for (int i = 0; i < lineWidth; i++) {
            graphics.drawRect(middleX - (sideLength / 2) - i, middleY - (sideLength / 2) - i, sideLength + 2 * i, sideLength + 2 * i);
        }
        if (sideLength > 5) {
            squareGrid(graphics, sideLength / 2, middleX - sideLength / 2, middleY - sideLength / 2, lineWidth / 2);
            squareGrid(graphics, sideLength / 2, middleX + sideLength / 2, middleY - sideLength / 2, lineWidth / 2);
            squareGrid(graphics, sideLength / 2, middleX - sideLength / 2, middleY + sideLength / 2, lineWidth / 2);
            squareGrid(graphics, sideLength / 2, middleX + sideLength / 2, middleY + sideLength / 2, lineWidth / 2);
        }
    }


    public static void drawImage(Graphics graphics) {

        squareGrid(graphics, WIDTH / 2, WIDTH / 2, HEIGHT / 2, 30);


    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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