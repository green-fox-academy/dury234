import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {

        List<String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<String>(listA);

        if (listA.contains("Durian")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        listB.remove("Durian");
        listA.add(4, "Kiwifruit");

        System.out.println(listA.equals(listB));

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll(Arrays.asList("Passion fruit", "Pomelo"));

        System.out.println(listA.get(2));

        System.out.println(listA);
        System.out.println(listB);

    }
}
