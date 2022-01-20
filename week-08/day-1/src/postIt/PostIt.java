package postIt;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }

    public static void main(String[] args) {
        PostIt postIt = new PostIt("yellow", "Hello world", "black");
        System.out.println(postIt.getTextColor() + " \"" + postIt.getText() + "\" on the " + postIt.getBackgroundColor() + " background");
    }
}

