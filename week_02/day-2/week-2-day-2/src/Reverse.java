import java.util.Arrays;

public class Reverse {
    public static void reverseArray(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        int help = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[help];
            help--;
        }
    }


    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        reverseArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

    }
}
