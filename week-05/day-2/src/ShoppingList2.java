import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> priceMap = new HashMap<String, Double>();
        priceMap.put("Milk", 1.07);
        priceMap.put("Rice", 1.59);
        priceMap.put("Eggs", 3.14);
        priceMap.put("Cheese", 12.60);
        priceMap.put("Chicken Breasts", 9.40);
        priceMap.put("Apples", 2.31);
        priceMap.put("Tomato", 2.58);
        priceMap.put("Potato", 1.75);
        priceMap.put("Onion", 1.10);

        HashMap<String, Integer> bobsList = new HashMap<String, Integer>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        HashMap<String, Integer> alicesList = new HashMap<String, Integer>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        Double bobPays = 0d;

        for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
            bobPays += entry.getValue() * priceMap.get(entry.getKey());
        }

        System.out.println(bobPays);

        Double alicePays = 0d;

        for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
            alicePays += entry.getValue() * priceMap.get(entry.getKey());
        }

        System.out.println(alicePays);

        if (bobsList.getOrDefault("Rice", 0) > alicesList.getOrDefault("Rice", 0)) {
            System.out.println("Bob");
        } else if (bobsList.getOrDefault("Rice", 0) < alicesList.getOrDefault("Rice", 0)) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        if (bobsList.getOrDefault("Potato", 0) > alicesList.getOrDefault("Potato", 0)) {
            System.out.println("Bob");
        } else if (bobsList.getOrDefault("Potato", 0) < alicesList.getOrDefault("Potato", 0)) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        if (bobsList.getOrDefault("Ham", 0) > alicesList.getOrDefault("Ham", 0)) {
            System.out.println("Bob");
        } else if (bobsList.getOrDefault("Ham", 0) < alicesList.getOrDefault("Ham", 0)) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        if (bobsList.getOrDefault("Apples", 0) > alicesList.getOrDefault("Apples", 0)) {
            System.out.println("Bob");
        } else if (bobsList.getOrDefault("Apples", 0) < alicesList.getOrDefault("Apples", 0)) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        if (bobsList.size() > alicesList.size()) {
            System.out.println("Bob");
        } else if (bobsList.size() < alicesList.size()) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }

        Integer sumBob = 0;
        Integer sumAlice = 0;

        for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
            sumBob += entry.getValue();
        }

        for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
            sumAlice += entry.getValue();
        }

        if (sumBob > sumAlice) {
            System.out.println("Bob");
        } else if (sumBob < sumAlice) {
            System.out.println("Alice");
        } else {
            System.out.println("no one");
        }
    }
}
