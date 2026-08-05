package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.ProjectRole;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
//(Project +Member)
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId id;

    Project project;
    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

    //it joins two tables
    //it does not have id
    //two primary keys

    //projectmember -> combines project id and user id together
    //it has roles
}
