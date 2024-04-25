# Java E-Commerce System

This repository contains the source code for a simple e-commerce system implemented in Java. The system allows customers to browse products, add them to a shopping cart, and place orders.

## Structure

The project is organized into two packages:

- `com.ecommerce`: This package encapsulates all classes related to the e-commerce system, including `Product` and `Customer`.
- `com.ecommerce.orders`: This package is for managing orders and includes the `Order` class.

## Classes

- `Product`: Represents a product available for purchase. Includes attributes like `productID`, `name`, `price`, and has the necessary constructors, getters, and setters.
- `Customer`: Represents a customer. Includes attributes like `customerID`, `name`, and a `shoppingCart`. It also has methods to add and remove products from the shopping cart, calculate the total cost, and place orders.
- `Order`: Represents an order placed by a customer. Includes attributes like `orderID`, `customer`, `products`, and `orderTotal`. It also has methods to calculate the total cost of the order and generate an order summary.

## Usage

To use the e-commerce system:

1. Create instances of `Product`, `Customer`, and `Order`.
2. Allow customers to browse products, add them to their shopping cart, and place orders.
3. Display information about products, customers, and orders.
