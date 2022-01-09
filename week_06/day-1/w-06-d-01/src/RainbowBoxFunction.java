import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void rainbowBox(int size, Color fillColor, Graphics graphics) {
        graphics.setColor(fillColor);

        graphics.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
    }

    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        int size = WIDTH;

        Color fillColor = Color.black;
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    fillColor = Color.red;
                    break;
                case 1:
                    fillColor = Color.orange;
                    break;
                case 2:
                    fillColor = Color.yellow;
                    break;
                case 3:
                    fillColor = Color.green;
                    break;
                case 4:
                    fillColor = Color.blue;
                    break;
                case 5:
                    fillColor = new Color(75, 0, 130);
                    break;
                case 6:
                    fillColor = new Color(143, 0, 255);
                    break;
            }
            rainbowBox(size, fillColor, graphics);
            size -= WIDTH / 8;
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