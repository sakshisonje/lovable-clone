package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectid, Long userId);
}
