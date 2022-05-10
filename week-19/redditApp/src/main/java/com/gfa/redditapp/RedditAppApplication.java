package com.gfa.redditapp;

import com.gfa.redditapp.Model.RedditPost;
import com.gfa.redditapp.Model.User;
import com.gfa.redditapp.Service.PostService;
import com.gfa.redditapp.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class RedditAppApplication implements CommandLineRunner {

    private final PostService postService;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(RedditAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("Juraj");
        user1.setPassword(passwordEncoder.encode("abc"));

        userService.save(user1);

        User user2 = new User();
        user2.setName("fero");
        user2.setPassword(passwordEncoder.encode("abc"));

        userService.save(user2);


        postService.save(new RedditPost("Hello", user1));
        postService.save(new RedditPost("Bye",user1));
        postService.save(new RedditPost("Hi",user1));
        postService.save(new RedditPost("Hello",user1));
        postService.save(new RedditPost("Bye",user1));
        postService.save(new RedditPost("Hi",user1));
        postService.save(new RedditPost("Hello",user1));
        postService.save(new RedditPost("Bye",user1));
        postService.save(new RedditPost("Hi",user1));
        postService.save(new RedditPost("Hello",user1));
        postService.save(new RedditPost("Bye",user1));
        postService.save(new RedditPost("Hi",user1));

    }
}
