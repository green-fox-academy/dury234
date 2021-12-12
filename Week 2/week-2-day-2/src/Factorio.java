public class Factorio {

    public static int calculateFactorial(int a){
        int fac = 1;

        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        // - Create a function called `calculateFactorial()`
        //    that returns the factorial of its input
        System.out.println(calculateFactorial(5));
    }
}
