package com.gfa.redditapp.Controller;

import com.gfa.redditapp.Model.RedditPost;
import com.gfa.redditapp.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final PostService postService;
    private final int PAGE_SIZE = 10;

    @GetMapping("/")
    public String getHomepage(Model model, @RequestParam(value = "page", required = false, defaultValue = "0") int page) {

        Pageable pageable = PageRequest.of(page, PAGE_SIZE, Sort.by("rating").descending().and(Sort.by("created")));

        model.addAttribute("posts", postService.findAll(pageable));
        model.addAttribute("page", page);
        return "index";
    }

    @GetMapping("/{id}/up")
    public String updateRatingUp(@PathVariable long id) {
        postService.ratingUp(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/down")
    public String updateRatingDown(@PathVariable long id) {
        postService.ratingDown(id);
        return "redirect:/";
    }

    @GetMapping("/addpost")
    public String getAddPost(Model model, @ModelAttribute("post") RedditPost post) {
        return "addpost";
    }

    @PostMapping("/addpost")
    public String postAddPost(Model model, @ModelAttribute("post") RedditPost post) {
        postService.save(post);
        return "redirect:/";
    }

}
