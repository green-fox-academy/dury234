package blog;

import blogpost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    ArrayList<BlogPost> listOfBlogPosts;

    public Blog() {
        listOfBlogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        listOfBlogPosts.add(blogPost);
    }

    public void delete(int i) {
        listOfBlogPosts.remove(i);
    }

    public void update(int i, BlogPost blogPost) {
        delete(i);
        listOfBlogPosts.add(i, blogPost);
    }

    public void printAllBlogs() {
        for (int i = 0; i < listOfBlogPosts.size(); i++) {
            listOfBlogPosts.get(i).printBlog();
        }
    }


    public static void main(String[] args) {

        BlogPost blogPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost blogPost1 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost blogPost2 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        Blog blog = new Blog();

        blog.add(blogPost);
        blog.add(blogPost1);
        blog.add(blogPost2);

        blog.printAllBlogs();

        BlogPost blogPost3 = new BlogPost("Juraj Džama", "I don't know", "I told you, I don't know.", "2021.01.20.");

        // blog.add(blogPost3);

        // blog.printAllBlogs();

        blog.update(2, blogPost3);

        blog.printAllBlogs();

    }
}
