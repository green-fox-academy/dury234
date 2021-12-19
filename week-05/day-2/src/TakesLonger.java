public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!


        //Option 1

        StringBuilder stringBuilder = new StringBuilder(quote);

        stringBuilder.insert(quote.indexOf("It") + 2, " always takes longer than");
        String quote1 = stringBuilder.toString();

        System.out.println(quote1);



        //Option 2

        StringBuilder str = new StringBuilder();
        str.append(quote.substring(0, quote.indexOf("It") + 2));
        str.append(" always takes longer than");
        str.append(quote.substring(quote.indexOf("It") + 3, quote.length() - 1));
        String quote2 = stringBuilder.toString();

        System.out.println(quote2);

    }
}
