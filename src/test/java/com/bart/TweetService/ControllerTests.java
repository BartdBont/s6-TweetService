package com.bart.TweetService;

import com.bart.TweetService.Controllers.TweetController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ControllerTests {

    @Autowired
    private TweetController tweetController;

    @Test
    public void contextLoadsController() {
         assertNotNull(tweetController);
    }
}
