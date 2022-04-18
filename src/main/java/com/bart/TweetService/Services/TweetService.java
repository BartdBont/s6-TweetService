package com.bart.TweetService.Services;

import com.bart.TweetService.Exceptions.TweetNotFoundException;
import com.bart.TweetService.Models.Tweet;
import com.bart.TweetService.Repositories.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TweetService {
    private final TweetRepository tweetRepository;

    public TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<Tweet> findAll() {
        return tweetRepository.findAll();
    }

    public Tweet findById(UUID id) {
        return tweetRepository.findById(id).orElseThrow(() -> new TweetNotFoundException());
    }
}
