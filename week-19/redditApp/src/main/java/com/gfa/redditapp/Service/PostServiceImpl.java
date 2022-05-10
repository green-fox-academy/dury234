package com.gfa.redditapp.Service;

import com.gfa.redditapp.Model.RedditPost;
import com.gfa.redditapp.Model.User;
import com.gfa.redditapp.Repository.RedditPostRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final RedditPostRepo redditPostRepo;

    @Override
    public Page<RedditPost> findAll(Pageable pageable) {
        return redditPostRepo.findAll(pageable);
    }

    @Override
    public void postAddAuthor(RedditPost redditPost, User author) {
        redditPost.setAuthor(author);
    }

    @Override
    public List<RedditPost> findAll() {
        return redditPostRepo.findAll(Sort.by("rating").and(Sort.by("created")));
    }

    @Override
    public void save(RedditPost redditPost) {
        redditPostRepo.save(redditPost);
    }

    @Override
    public void ratingUp(long id) {
        redditPostRepo.ratingUp(id);
    }

    @Override
    public void ratingDown(long id) {
        redditPostRepo.ratingDown(id);
    }

    @Override
    public RedditPost getById(long id) {
        return redditPostRepo.getById(id);
    }
}
