package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;

    Project project;

    String namespace;    //isolated resources of kubernetes
    String PodName;       //smallest unit
    String previewUrl;    //discoverable url running in POD

    PreviewStatus previewStatus;

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

}
