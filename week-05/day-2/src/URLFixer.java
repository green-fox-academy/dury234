public class URLFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!
        url = url.replace("bots","odds");

        String s1 = url.substring(0, 4);
        String s2 = url.substring(5);

        url = s1 + ":" + s2;

        System.out.println(url);

    }
}
