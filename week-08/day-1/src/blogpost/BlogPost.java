package blogpost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publcationDate;

    public BlogPost(String authorName, String title, String text, String publcationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publcationDate = publcationDate;
    }

    public void printBlog() {
        System.out.println("\"" + title + "\" titled by " + authorName + " posted at " + publcationDate);
        System.out.println(text + "\n");
    }


    public static void main(String[] args) {
        BlogPost blogPost = new BlogPost("John Doe","Lorem Ipsum","Lorem ipsum dolor sit amet.","2000.05.04.");
        BlogPost blogPost1 = new BlogPost("Tim Urban","Wait but why","A popular long-form, stick-figure-illustrated blog about almost everything.","2010.10.10.");
        BlogPost blogPost2 = new BlogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump","Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28.");

        System.out.println("\"" + blogPost.title + "\" titled by " + blogPost.authorName + " posted at " + blogPost.publcationDate);
        System.out.println(blogPost.text + "\n");

        System.out.println("\"" + blogPost1.title + "\" titled by " + blogPost1.authorName + " posted at " + blogPost1.publcationDate);
        System.out.println(blogPost1.text + "\n");

        System.out.println("\"" + blogPost2.title + "\" titled by " + blogPost2.authorName + " posted at " + blogPost2.publcationDate);
        System.out.println(blogPost2.text + "\n");
    }

}
