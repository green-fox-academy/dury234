public class SumOfElements {

    public static int SumOfElements(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements of `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        System.out.println(SumOfElements(numbers));

    }
}
