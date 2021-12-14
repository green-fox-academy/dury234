import java.util.Scanner;

public class PalindromBuilder {

    public static String createPalindrome(String input){
        char[] inputStringArray = input.toCharArray();
        String result = input;
        int currentIndex = inputStringArray.length;
        for (int i = inputStringArray.length; i > 0; i--) {
            result += inputStringArray[currentIndex - 1];
            currentIndex--;
        }
        return result;
    }

    public static void main(String[] args) {
        //  Create a function named createPalindrome() following your current language's style guide. It should take a string, create a palindrome from it and then return it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();
        System.out.println(createPalindrome(input));
    }
}
