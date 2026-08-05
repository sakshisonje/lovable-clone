package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

//    @ManyToOne //many users-> one subscription
    User user;

    Plan plan;

    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubscriptionId;

    //time of subscription...
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd=false;

    Instant createdAt;
    Instant updatedAt;
}
//Hibernate ORM -- maps all the relationships in Java