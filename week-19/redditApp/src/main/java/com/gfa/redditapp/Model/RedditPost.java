package com.gfa.redditapp.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class RedditPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private int rating;

    private String author;

    @CreationTimestamp
    private LocalDateTime created;

    public RedditPost(String content, String author) {
        this.content = content;
        this.author = author;
        rating = 0;
    }

    public void rateUp() {
        rating++;
    }

    public void rateDown() {
        rating--;
    }
}
