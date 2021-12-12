public class Sum {
    public static int sum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
        int a = 10;
        System.out.println(sum(a));

    }
}
