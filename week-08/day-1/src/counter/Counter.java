package counter;

public class Counter {
    int counter = 0;
    int initial;
    public Counter() {
        initial = 0;
    }

    public Counter(int initialValue) {
        this.counter = initialValue;
        initial = counter;
    }

    public void add() {
        counter++;
    }

    public void add(int value) {
        counter += value;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = initial;
    }

}
