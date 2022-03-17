import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double expectedOutput = 22.0/6.0;

        OptionalDouble average = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(average);


        if (expectedOutput == average.getAsDouble())
            System.out.println("Good");
        else
            System.out.println("Bad");
    }
}
