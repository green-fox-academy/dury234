public class SwapElemets {
    public static void SwapItems(String [] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`
        String[] orders = {"first", "second", "third"};
        SwapItems(orders,0,2);
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }

}
