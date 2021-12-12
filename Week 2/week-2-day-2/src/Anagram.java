import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String a, String b){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        //  System.out.println(Arrays.toString(arrayA));
        //  System.out.println(Arrays.toString(arrayB));

        return Arrays.equals(arrayA, arrayB);
    }


    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";
        System.out.println(isAnagram(str2,str1));

    }
}
