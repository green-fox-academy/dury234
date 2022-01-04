import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementFinder {

    public static String containsSeven(List<Integer> inputList) {
        if (inputList.contains(7)) {
            return "Hooray";
        } else {
            return "Noooo";
        }
    }

    public static String containsSevenDifferent(List<Integer> inputList) {
        Boolean isThere = false;

        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).equals(7)) {
                isThere = true;
            }
        }

        if (isThere) {
            return "Hooray";
        } else {
            return "Noooo";
        }

    }

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Add a method called `containsSeven` that checks if the `listOfNumbers` contains the number 7
        // If it does the method should return "Hoorray" otherwise return "Noooooo"

        // The output should be "Noooooo"
        System.out.println(containsSeven(listOfNumbers));

        // Add a method called `containsSevenDifferent` which implements the same behavior differently
        // (e.g. using different list methods)

        // The output should be "Noooooo", again!
        System.out.println(containsSevenDifferent(listOfNumbers));
    }
}
