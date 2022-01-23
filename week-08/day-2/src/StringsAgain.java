public class StringsAgain {
    public static String deleteX(String s) {
        if (s.length() < 1) {
            return s;
        } else {
            char ch = s.charAt(0) == 'x'  ? '' : s.charAt(0);
            return ch + deleteX(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(deleteX("asdsax x asd da asxasxasxsasaxxxas"));
    }
}
