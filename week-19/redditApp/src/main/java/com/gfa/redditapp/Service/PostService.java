package com.gfa.redditapp.Service;


import com.gfa.redditapp.Model.RedditPost;
import com.gfa.redditapp.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {

    List<RedditPost> findAll();

    void save(RedditPost redditPost);

    void ratingUp(long id);

    void ratingDown(long id);

    RedditPost getById(long id);

    Page<RedditPost> findAll(Pageable pageable);

    void postAddAuthor(RedditPost redditPost, User author);
}
