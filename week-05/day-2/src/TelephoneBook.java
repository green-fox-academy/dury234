import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telBook = new HashMap<String, String>();
        telBook.put("William A. Lathan","405-709-1865");
        telBook.put("John K. Miller","402-247-8568");
        telBook.put("Hortensia E. Foster","606-481-6467");
        telBook.put("Amanda D. Newland","319-243-5613");
        telBook.put("Brooke P. Askew","307-687-2982");

        System.out.println(telBook.get("John K. Miller"));

        for (Map.Entry<String, String> entry : telBook.entrySet()) {
            if (entry.getValue() == "307-687-2982"){
                System.out.println(entry.getKey());
                break;
            }
        }

        if (telBook.containsKey("Chris E. Myer")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
