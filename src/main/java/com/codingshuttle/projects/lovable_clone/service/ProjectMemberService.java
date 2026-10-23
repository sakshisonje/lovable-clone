package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.lovable_clone.dto.member.MemberResponse;
import com.codingshuttle.projects.lovable_clone.dto.member.UpdateRoleRequest;
import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectid, Long userId);

    MemberResponse inviteMember(Long projectid, Long userId, InviteMemberRequest inviteMemberRequest);

    MemberResponse updateMemberRole(Long projectid, Long memberId, UpdateRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectid, Long memberId, Long userId);
}
