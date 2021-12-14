import java.util.Arrays;

public class PalindromeSearcher {

    public static boolean isPalindrome(String input) {
        char[] helpArray = input.toCharArray();
        boolean result = true;
        int textLength = helpArray.length;
        for (int i = 0; i < helpArray.length / 2; i++) {
            if (helpArray[i] != helpArray[textLength - 1]) {
                result = false;
            }
            textLength--;
        }
        return result;
    }

    public static String[] searchPalindrome(String input) {
            char[] helpArray = input.toCharArray();
            String[] resultArrayOne = new String[100];
            Arrays.fill(resultArrayOne, "");
            int currentIndex = 0;
            String test = "";
        for (int i = 0; i < helpArray.length - 2; i++) {
            for (int j = 0; j < 3; j++) {
                test += helpArray[i + j];
            }

            if (isPalindrome(test)){
                resultArrayOne[currentIndex] = test;
                currentIndex++;
                test = "";
            }   else {
                test = "";
            }
        }
        String[] realResultArray = Arrays.copyOf(resultArrayOne, currentIndex);

        return realResultArray;

    }


    public static void main(String[] args) {
        //  Create a function named searchPalindrome() following your current language's style guide.
        //  It should take a string, search for palindromes that is at least 3 characters long
        //  and return a list with the found palindromes.
        System.out.println(Arrays.toString(searchPalindrome("asbhhfjdgvn jnfdkvndkjjjjjj kjmlk jkljd klfjgkfkkfdddgdgdgdgdg")));
    }
}
