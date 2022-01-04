import java.util.List;
import java.util.Scanner;

public class Calculator2 {

    public static Integer calculate(String s) {
        List<String> list = List.of(s.split(" "));
        Integer result = 0;
        switch (list.get(0)) {
            case "+":
                result = Integer.valueOf(list.get(1)) + Integer.valueOf(list.get(2));
                break;
            case "-":
                result = Integer.valueOf(list.get(1)) - Integer.valueOf(list.get(2));
                break;
            case "*":
                result = Integer.valueOf(list.get(1)) * Integer.valueOf(list.get(2));
                break;
            case "/":
                result = Integer.valueOf(list.get(1)) / Integer.valueOf(list.get(2));
                break;
            case "%":
                result = Integer.valueOf(list.get(1)) % Integer.valueOf(list.get(2));
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        System.out.println(calculate(expression));
    }
}
