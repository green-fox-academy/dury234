public class Strings {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars changed to 'y' chars.

    public static String rewrite(String s) {
        if (s.length() < 1) {
            return s;
        } else {
            char ch = s.charAt(0) == 'x' ? 'y' : s.charAt(0);
            return ch + rewrite(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(rewrite("raz dva tri xx styxri x sdx sdad xada"));
    }
}
