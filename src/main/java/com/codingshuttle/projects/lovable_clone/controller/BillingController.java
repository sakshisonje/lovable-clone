package com.codingshuttle.projects.lovable_clone.controller;

import com.codingshuttle.projects.lovable_clone.dto.subscription.*;
import com.codingshuttle.projects.lovable_clone.service.PlanService;
import com.codingshuttle.projects.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//requestmapping is removed
public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());

    }

    @GetMapping("api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription() {
        Long userId = 1L; // Replace with actual user ID retrieval logic
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest checkoutRequest
    ) {
        // Implement the logic to create a Stripe checkout session
        // Return the session ID or URL for the frontend to redirect the user
        Long userId = 1L; // Replace with actual user ID retrieval logic
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(userId, checkoutRequest));
    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal() {
        // Implement the logic to create a Stripe customer portal session
        // Return the session URL for the frontend to redirect the user
        Long userId = 1L; // Replace with actual user ID retrieval logic
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }
}

//Billing
//start the checkout
//and go to the stripe portal

//how will be the checkout work
