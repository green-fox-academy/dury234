import java.util.Arrays;

public class Unique {
    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)

    //  Example
    //  System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    public static int[] findUniqueItems(int[] array){
        int resultArrayLength = array.length;
        boolean[] tempArray = new boolean[array.length];
        Arrays.fill(tempArray, true);
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] == array[j]){
                    tempArray[i] = false;
                    resultArrayLength--;
                }
            }
        }
        int[] resultArray = new int[resultArrayLength];
        int currentIndex = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i]){
                resultArray[currentIndex] = array[i];
                currentIndex++;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(findUniqueItems(array1)));
    }
}
