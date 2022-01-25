import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void sierpinskyCarpet(Graphics graphics, int sideLength, int middleX, int middleY) {
        graphics.fillRect(middleX - sideLength / 2, middleY - sideLength / 2, sideLength, sideLength);

        if (sideLength > 5) {
            //top row
            sierpinskyCarpet(graphics, sideLength / 3, middleX - sideLength, middleY - sideLength);
            sierpinskyCarpet(graphics, sideLength / 3, middleX, middleY - sideLength);
            sierpinskyCarpet(graphics, sideLength / 3, middleX + sideLength, middleY - sideLength);

            //middle row
            sierpinskyCarpet(graphics, sideLength / 3, middleX - sideLength, middleY);
            sierpinskyCarpet(graphics, sideLength / 3, middleX + sideLength, middleY);

            //bottom row
            sierpinskyCarpet(graphics, sideLength / 3, middleX - sideLength, middleY + sideLength);
            sierpinskyCarpet(graphics, sideLength / 3, middleX, middleY + sideLength);
            sierpinskyCarpet(graphics, sideLength / 3, middleX + sideLength, middleY + sideLength);
        }
    }


    public static void drawImage(Graphics graphics) {
        sierpinskyCarpet(graphics, WIDTH / 3, WIDTH / 2, HEIGHT / 2);


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