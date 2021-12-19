import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> finance = new ArrayList<Integer>();
        finance.add(500);
        finance.add(1000);
        finance.add(1250);
        finance.add(175);
        finance.add(800);
        finance.add(120);

        int sum = 0;

        for (Integer integer : finance) {
            sum += integer;
        }

        System.out.println(sum);

        int max = Collections.max(finance);

        System.out.println(max);

        int min = Collections.min(finance);

        System.out.println(min);

        System.out.println((float)sum / finance.size());
    }

}
