public class NumberAdder {

    public static int numberAdder(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + numberAdder(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(numberAdder(5));
    }
}
