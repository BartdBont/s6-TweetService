package com.bart.TweetService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.function.Consumer;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TweetServiceApplication {
	private static final Logger log = LoggerFactory.getLogger(TweetServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TweetServiceApplication.class, args);
	}

	@Bean
	Consumer<UUID> userDeleted() {
		return id -> {
			log.info(id.toString());
		};
	}

}
