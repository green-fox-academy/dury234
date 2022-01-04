import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

    public static String mostFreqWord(String input){
        String temp = input.replaceAll("\\p{P}","");
        String[] arrOfStrings = temp.split(" ");
        HashMap<String, Integer> numberOfWords = new HashMap<String, Integer>();
        for (int i = 0; i < arrOfStrings.length; i++) {
            numberOfWords.put(arrOfStrings[i], numberOfWords.getOrDefault(arrOfStrings[i], 0) +1);
        }

        String result = "";
        Integer maxValue = 0;

        for (Map.Entry<String, Integer> entry : numberOfWords.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String test = "a (a) a, b b c";

        System.out.println(mostFreqWord(test));
    }
}
