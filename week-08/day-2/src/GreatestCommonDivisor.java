public class GreatestCommonDivisor {


    public static int test(int a, int b) {
        if (b != 0) {
            return test(b, a % b);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(50, 525));
    }
}
