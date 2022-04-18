package com.bart.TweetService.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Tweet not found")
public class TweetNotFoundException extends RuntimeException {
}
