package com.codingshuttle.projects.lovable_clone.controller;


import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;
import com.codingshuttle.projects.lovable_clone.service.ProjectMemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectid}/members")
@AllArgsConstructor
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;
    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(       @PathVariable Long projectid        ) {

        Long userId = 1L; // Replace with actual user ID from authentication context
        List<ProjectMember> members = projectMemberService.getProjectMembers(projectid, userId);
        return ResponseEntity.ok(members);
    }

}

//What kind of Dependency injection is used here?
// Constructor Injection is used here. Because we are using @AllArgsConstructor annotation from Lombok,
// which generates a constructor with one parameter for each field in the class.
// This allows us to inject the ProjectMemberService dependency into the ProjectMember controller.
