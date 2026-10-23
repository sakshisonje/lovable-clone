package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
    Long id;
    String name;

    String sripePriceId;

    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews;   //1 preview 2 preview   when running the app, its using POD.. consuming another resource
    Boolean unlimitedAi; //unlimited access to LLM ignore maxTokenPerDay if its true

    Boolean active;
//
//    Instant createdAt;
//    Instant updatedAt;
}


//Takeaways:
//A wrapper class is a Java class that wraps a primitive data type into an object. (String, Long.. etc)
//Many Java APIs (Collections, Hibernate, Generics, Streams, etc.) work only with objects, not primitives.
//Wrapper class can be null