package com.codingshuttle.projects.lovable_clone.dto.subscription;

public record CheckoutResponse(
        String checkoutUrl
) {
}

//it only has checkout URL because the checkout session is created on the backend and the frontend only needs the URL to redirect the user to the Stripe checkout page.