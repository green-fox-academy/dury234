import java.util.Arrays;
import java.util.Collections;

public class Bubble {

    public static int[] bubble(int[] inputArray, boolean direction){
        int[] resultArray = Arrays.copyOf(inputArray,inputArray.length);

        if (direction){
            int[] helpArray = Arrays.copyOf(resultArray, resultArray.length);
            Arrays.sort(helpArray);
            int currentIndex = resultArray.length;
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = helpArray[currentIndex - 1];
                currentIndex--;
            }
        } else {
            Arrays.sort(resultArray);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        //  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        int[] arrayOne = {34, 12, 24, 9, 5};



        System.out.println(Arrays.toString(bubble(arrayOne, false)));
    }
}
