package com.gfa.redditapp.Repository;

import com.gfa.redditapp.Model.RedditPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RedditPostRepo extends JpaRepository<RedditPost, Long> {

    @Query ("update RedditPost rp set rp.rating = rp.rating + 1 where rp.id = ?1")
    @Transactional
    @Modifying
    public void ratingUp(long id);

    @Query ("update RedditPost rp set rp.rating = rp.rating - 1 where rp.id = ?1")
    @Transactional
    @Modifying
    public void ratingDown(long id);
}
