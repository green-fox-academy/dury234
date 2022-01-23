public class MaximumFinder {
    // Write a function which returns the largest element of an array using recursion.

    public static int findMax(int[] arr, int n) {

        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return arr[0];
        } else {
            return Math.max(arr[n - 1], findMax(arr, n - 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 12, 3};

        System.out.println(findMax(arr, 10));
    }
}
