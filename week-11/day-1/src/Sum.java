import java.util.ArrayList;
import java.util.List;

public class Sum {
    public int sum(List<Integer> toSum) throws NullPointerException {
        int result = 0;
        try {
            for (Integer integer : toSum) {
                result += integer;
            }
        } catch (NullPointerException e) {
            System.out.println("Nothing inserted");
        }
        return result;
    }
}
