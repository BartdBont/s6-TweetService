package com.bart.TweetService.Models;

import com.bart.TweetService.DateTimeConfiguration;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    private String content;

    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = DateTimeConfiguration.getCurrentDateTime();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = DateTimeConfiguration.getCurrentDateTime();
    }
}
