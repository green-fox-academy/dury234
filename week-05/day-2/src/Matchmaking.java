import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {

    public static List<String> match(List<String> girlsList, List<String> boysList) {

        List<String> resultList = new ArrayList<String>();
        Integer biggerSize = 0;

        if (boysList.size() >= girlsList.size()) {
            biggerSize = boysList.size();
        } else {
            biggerSize = girlsList.size();
        }

        for (int i = 0; i < biggerSize; i++) {
            if (boysList.size() > i && girlsList.size() > i) {
                resultList.add(girlsList.get(i) + "-" + boysList.get(i));
            } else if (boysList.size() <= i) {
                resultList.add(girlsList.get(i));
            } else if (girlsList.size() <= i) {
                resultList.add(boysList.get(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }
}
