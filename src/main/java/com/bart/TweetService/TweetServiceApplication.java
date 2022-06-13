package com.bart.TweetService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TweetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetServiceApplication.class, args);
	}

}
