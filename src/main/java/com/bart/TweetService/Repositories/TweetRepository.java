package com.bart.TweetService.Repositories;

import com.bart.TweetService.Models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TweetRepository extends JpaRepository<Tweet, UUID> {
}
