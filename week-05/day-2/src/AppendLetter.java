import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

    public static List<String> appendA(List<String> inputList) {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            resultList.add(inputList.get(i) + "a");
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> animals = Arrays.asList(
                "koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"
        );

        // Create a method called "appendA()"" that adds "a" to every string in the "animals" list
        // The method should accept a list of strings as a parameter and return an updated list of strings
        // Expected output: [koala, panda, zebra, anaconda, boa, chinchilla, cobra, gorilla, hyena, hydra, iguana, impala, puma, tarantula, pirahna]

        System.out.println(appendA(animals));
    }
}
