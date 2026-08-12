package com.codingshuttle.projects.lovable_clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}

//record immutable
//DTO data Transfer Object
//DTOs are often just data carriers.
//