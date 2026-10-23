package com.codingshuttle.projects.lovable_clone.controller;


import com.codingshuttle.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.lovable_clone.dto.member.MemberResponse;
import com.codingshuttle.projects.lovable_clone.dto.member.UpdateRoleRequest;
import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;
import com.codingshuttle.projects.lovable_clone.service.ProjectMemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectid,
            @RequestBody InviteMemberRequest inviteMemberRequest
    ){
        Long userId = 1L; // Replace with actual user ID from authentication context
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(projectid, userId, inviteMemberRequest));
    }
    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectid,
            @PathVariable Long memberId,
            @RequestBody UpdateRoleRequest request
     ){
        Long userId = 1L; // Replace with actual user ID from authentication context
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectid, memberId, request, userId));
    }


    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> removeMember(
            @PathVariable Long projectid,
            @PathVariable Long memberId
    ){
        Long userId = 1L; // Replace with actual user ID from authentication context
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectid, memberId, userId));
    }
}

//What kind of Dependency injection is used here?
// Constructor Injection is used here. Because we are using @AllArgsConstructor annotation from Lombok,
// which generates a constructor with one parameter for each field in the class.
// This allows us to inject the ProjectMemberService dependency into the ProjectMember controller.
