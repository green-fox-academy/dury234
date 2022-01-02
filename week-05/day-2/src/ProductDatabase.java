import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        //Fish value
        System.out.println(products.get("Fish"));

        //The most expensive product
        String temp = "";
        Integer maxValue = 0;

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                temp = entry.getKey();
            }
        }

        System.out.println(temp);

        //Average value

        int sum = 0;

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            sum += entry.getValue();
        }

        double avg = (double) sum / products.size();

        System.out.println(avg);

        //Number of products under 300
        int numberOfProducts = 0;

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() < 300){
                numberOfProducts++;
            }
        }
        System.out.println(numberOfProducts);

        //Is there something exactly for 125
        String isThere = "no";
        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() == 125){
                isThere = "yes";
            }
        }
        System.out.println(isThere);

        //Cheapest product
        int minValue = 0;
        String temp2 = "";

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            if (entry.getValue() < minValue || minValue == 0){
                minValue = entry.getValue();
                temp2 = entry.getKey();
            }
        }
        System.out.println(temp2);
    }
}
