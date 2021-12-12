import java.util.Arrays;

public class SubInt {

    public static boolean isDigitInNumber(int digit, int number) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == digit) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }

    public static int[] findMatchingIndexes(int searched, int[] sourceArray) {
        int currentIndex = 0;
        int[] temporaryArray = new int[sourceArray.length];
        Arrays.fill(temporaryArray, -1);
        for (int i = 0; i < sourceArray.length; i++) {
            if (isDigitInNumber(searched, sourceArray[i])){
                temporaryArray[currentIndex] = i;
                currentIndex++;
            }
        }
        for (int i = 0; i < temporaryArray.length; i++) {
            if (temporaryArray[i] == -1){
                return Arrays.copyOf(temporaryArray, i);
            }

        }
        return temporaryArray;
    }

    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of any of the integers in the array)

        //  Examples:
        //  System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        //  System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one

        int[] array1 = {1, 11, 21, 51, 61};
        System.out.println(Arrays.toString(findMatchingIndexes(9, array1)));
    }
}
