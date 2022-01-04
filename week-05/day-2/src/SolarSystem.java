import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem {

    public static List putSaturn(List<String> planetsList) {
        List<String> resultList = new ArrayList<String>();
        for (int i = 0; i < planetsList.size(); i++) {
            if (i == 5) {
                resultList.add("Saturn");
            }
            resultList.add(planetsList.get(i));
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> planetList = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune");

        // "Saturn" is missing from the planetList
        // Insert it into the correct position
        // Create a method called "putSaturn()" which has a list parameter and returns
        // the list of planets in the correct order

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
        System.out.println(putSaturn(planetList));

    }
}
