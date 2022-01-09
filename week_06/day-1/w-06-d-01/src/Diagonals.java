import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {

    public static void diagonals(Graphics graphics, int x, int y) {

        graphics.setColor(Color.red);

        if (x > y) {
            graphics.drawLine(x - y, 0, WIDTH, HEIGHT - (x - y));
        } else if (x < y) {
            graphics.drawLine(0, y - x, WIDTH - (y - x), HEIGHT);
        } else {
            graphics.setColor(Color.green);
            graphics.drawLine(0, 0, WIDTH, HEIGHT);
        }
    }

    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function
        diagonals(graphics, 50, 50);
        diagonals(graphics, 100, 60);
        diagonals(graphics, 60, 100);

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