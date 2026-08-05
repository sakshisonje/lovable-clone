package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDateTime;

//User Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE) //which makes all variables private
public class User {
    Long id;
    String email;
    String passwordHash;
    String name;

    String avatarUrl;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; //softDelete

    //will use ORM (Hibernate) which converts above camelCase into snake_case;
    //why private : encapsulation (update will be through constructors)



}
