package com.ecommerce;

import com.ecommerce.orders.*;
import java.util.ArrayList;
import java.util.List;

// The Customer class represents a customer in the e-commerce system.
public class Customer {
    // Attributes of the customer
    private String customerID;  // Unique identifier for the customer
    private String name;        // Name of the customer
    private List<Product> shoppingCart;  // Shopping cart for the customer

    // Constructor for the Customer class
    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getter for customerID
    public String getCustomerID() {
        return customerID;
    }

    // Setter for customerID
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to add a product to the shopping cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    // Method to remove a product from the shopping cart
    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    // Method to calculate the total cost of the shopping cart
    public double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to place an order
    public Order placeOrder() {
        // Create a new order with the products in the shopping cart
        Order order = new Order(customerID, this, new ArrayList<>(shoppingCart));
        // Clear the shopping cart
        shoppingCart.clear();
        return order;
    }
}
