import java.util.Arrays;
import java.util.List;

public class QuoteSwap {

    public static String swapQuote(List<String> input) {
        String result = "";

        for (int i = 0; i < input.size() - 1; i++) {
            if (i == 2){
                result += input.get(5) + " ";
            } else if (i == 5) {
                result += input.get(2) +" ";
            } else {
                result += input.get(i) +" ";
            }
        }
        result += input.get(input.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");

        // Accidentally, I messed up this quote from Richard Feynman - two words are out of place,
        // Your task is to fix it by swapping the right words in your code
        // To do this, create a method called "swapQuote()" which takes the `list` as a parameter,
        // fixes the order of the words and returns the words joined in a single string with spaces between them.

        // Expected output: "What I cannot create, I do not understand."
        System.out.println(swapQuote(list));
    }
}
