package com.codingshuttle.projects.lovable_clone.controller;


import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codingshuttle.projects.lovable_clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor  //sees the final fields to generate a constructor
@RequestMapping("/api/usage")
public class UsageController {
    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getUsageToday() {
        Long userId = 1L; // Replace with actual user ID retrieval logic
        UsageTodayResponse response = usageService.getTodayUsageOfUser(userId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits() {
        Long userId = 1L; // Replace with actual user ID retrieval logic
        PlanLimitResponse response = usageService.getCurrentSubscriptionLimitsOfUser(userId);
        return ResponseEntity.ok(response);
    }
}
