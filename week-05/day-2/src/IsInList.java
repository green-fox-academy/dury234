import java.util.Arrays;
import java.util.List;

public class IsInList {

    public static Boolean checkNumbers(List<Integer> input) {
        if (input.contains(4) && input.contains(8) && input.contains(12) && input.contains(16)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean checkAllNumbers(List<Integer> haystack, List<Integer> needles) {
        Boolean resultValue = true;

        for (int i = 0; i < needles.size(); i++) {
            Boolean temp = false;
            for (int j = 0; j < haystack.size(); j++) {
                if (needles.get(i) == haystack.get(j)) {
                    temp = true;
                    break;
                }
            }
            if (!temp) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);

        // Write a method called `checkNumbers` (with a list of numbers as a parameter), which will return `true`
        // if the list `numbers` contains all the following elements: 4, 8, 12, 16; `false` otherwise.

        // The output should be "true"
        System.out.println(checkNumbers(numbers));

        // Bonus: write a method called `checkAllNumbers` with 2 lists as parameters, which will return `true`
        // if the first list contains all the elements of the second list; `false` otherwise.
        List<Integer> haystack = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
        List<Integer> needles = Arrays.asList(1, 3, 13);

        // The output should be "true"
        System.out.println(checkAllNumbers(haystack, needles));
    }
}
