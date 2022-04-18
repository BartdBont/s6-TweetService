package com.bart.TweetService.Controllers;

import com.bart.TweetService.Models.Tweet;
import com.bart.TweetService.Services.TweetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    private final TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @GetMapping
    public List<Tweet> findAll() {
        return tweetService.findAll();
    }

    @GetMapping("/{id}")
    public Tweet findById(@PathVariable UUID id) {
        return tweetService.findById(id);
    }
}
