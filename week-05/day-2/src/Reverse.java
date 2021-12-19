public class Reverse {

    public static String reverse(String inputString){

        StringBuilder str = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            str.append(inputString.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
    }
}
