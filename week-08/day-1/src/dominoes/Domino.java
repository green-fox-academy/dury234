package dominoes;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final Integer left;
    private final Integer right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino d) {
        int result = this.left.compareTo(d.left);
        if (result == 0) {
            result = this.right.compareTo(d.right);
        }
        return result;
    }
}