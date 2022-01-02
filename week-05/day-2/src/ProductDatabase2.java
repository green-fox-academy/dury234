import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() < 201){
                System.out.println(entry.getKey());
            }
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() > 150){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
