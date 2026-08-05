package com.codingshuttle.projects.lovable_clone.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
//1 project -> multiple chat sessions
public class ChatSession {

    // Two PK (Unique)  //join  //user A --> part of project 1   user A --> project 2  (duplicate project1 for userA is avoided)
    Project project;

    User user;

    String title;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
