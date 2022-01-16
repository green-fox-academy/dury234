import java.util.Scanner;

public class DivideByZero {

    public static void divideTen(int divisor) {
        try {
            System.out.println(10 / divisor);
        } catch (ArithmeticException e) {
            System.err.println("Fail");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        divideTen(divisor);
    }
}
