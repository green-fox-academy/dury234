import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<String>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (shoppingList.contains("bananas")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
