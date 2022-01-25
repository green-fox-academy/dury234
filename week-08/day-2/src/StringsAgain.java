public class StringsAgain {
    public static String deleteX(String s) {
        int index = s.indexOf("x");
        if (index < 0)
            return s;
        else {
            return deleteX(s.substring(0, index) + s.substring(index + 1));
        }
    }

    public static void main(String[] args) {
        String s = "asxs sdxr xxx asdax";
        System.out.println(deleteX(s));
    }
}
