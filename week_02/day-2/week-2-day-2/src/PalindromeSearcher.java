import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeSearcher {

    public static boolean isPalindrome(String input) {
        char[] helpArray = input.toCharArray();
        boolean result = true;
        int textLength = helpArray.length;
        for (int i = 0; i < helpArray.length / 2; i++) {
            if (helpArray[i] != helpArray[textLength - 1]) {
                result = false;
                break;
            }
            textLength--;
        }
        return result;
    }

    public static List<String> searchPalindrome(String input) {
        List<String> resultArray = new ArrayList<>();

        for (int i = 0; i < input.length() - 1; i++) {

            for (int j = input.length() - 1; j > i; j--) {

                String test = input.substring(i, j);

                if (isPalindrome(test)) {

                    for (int k = 0; k < test.length() / 2; k++) {

                        resultArray.add(test.substring(k, test.length() - 1 - k));

                    }
                }
            }
        }

        return resultArray;

    }


    public static void main(String[] args) {
        //  Create a function named searchPalindrome() following your current language's style guide.
        //  It should take a string, search for palindromes that is at least 3 characters long
        //  and return a list with the found palindromes.

        System.out.println(searchPalindrome("log gol"));
        System.out.println(isPalindrome("gg"));


    }
}
