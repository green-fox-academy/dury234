package sharpie;

public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public void use() {
        inkAmount -= 10;
    }

    public void refill() {
        inkAmount = 100;
    }

    public Sharpie(int Width, String color) {
        this.color = color;
        this.width = width;
    }

    public static void main(String[] args) {
        Sharpie s = new Sharpie(50, "red");
        s.use();
        s.use();
        s.use();
        s.use();
        System.out.println(s.inkAmount);
    }
}
