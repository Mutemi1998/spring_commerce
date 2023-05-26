# Spring v6.1.0 
Full spring api for e-commerce site
with the following endpoints

    User Authentication Endpoints:
        /api/register: Create a new user account.
        /api/login: Authenticate and generate a user session token.
        /api/logout: Invalidate the user session token.

    Product Catalog Endpoints:
        /api/products: Retrieve a list of all products.
        /api/products/{id}: Retrieve details of a specific product.
        /api/products/create: Create a new product listing.
        /api/products/{id}/update: Update an existing product listing.
        /api/products/{id}/delete: Delete a product listing.

    Shopping Cart Endpoints:
        /api/cart: Retrieve the current user's shopping cart.
        /api/cart/add: Add a product to the shopping cart.
        /api/cart/update: Update the quantity of a product in the shopping cart.
        /api/cart/remove: Remove a product from the shopping cart.
        /api/cart/clear: Clear the entire shopping cart.

    Checkout and Order Management Endpoints:
        /api/checkout: Initiate the checkout process.
        /api/orders: Retrieve a list of the user's orders.
        /api/orders/{id}: Retrieve details of a specific order.
        /api/orders/create: Create a new order.
        /api/orders/{id}/cancel: Cancel an order.

    Payment Gateway Integration Endpoints:
        /api/payment/initialize: Initialize the payment process.
        /api/payment/verify: Verify the payment status.

    User Profile and Account Management Endpoints:
        /api/profile: Retrieve the user's profile information.
        /api/profile/update: Update the user's profile information.
        /api/account: Retrieve the user's account information.
        /api/account/update: Update the user's account information.
        /api/account/password: Update the user's account password.

    Search and Filtering Endpoints:
        /api/search: Perform a search query based on various filters.
        /api/filters: Retrieve available filters for search.

    Reviews and Ratings Endpoints:
        /api/products/{id}/reviews: Retrieve reviews for a specific product.
        /api/products/{id}/reviews/create: Create a new review for a product.
