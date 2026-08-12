package com.codingshuttle.projects.lovable_clone.dto.auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}


// It has internal data
//Java automatically provides the constructor, accessors, equals(), hashCode(), and toString().