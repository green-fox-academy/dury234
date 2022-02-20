package sharpie;

public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public int getInkAmount() {
        return inkAmount;
    }

    public void use() {
        inkAmount -= 10;
    }

    public void refill() {
        inkAmount = 100;
    }

    public Sharpie(int width, String color) {
        this.color = color;
        this.width = width;
    }
}
