package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

// The Order class represents an order placed by a customer in the e-commerce system.
public class Order {
    // Attributes of the order
    private String orderID;  // Unique identifier for the order
    private Customer customer;  // The customer who placed the order
    private List<Product> products;  // The products in the order
    private double orderTotal;  // The total cost of the order

    // Constructor for the Order class
    public Order(String orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = calculateOrderTotal();
    }

    // Getter for orderID
    public String getOrderID() {
        return orderID;
    }

    // Setter for orderID
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter for products
    public List<Product> getProducts() {
        return products;
    }

    // Setter for products
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Getter for orderTotal
    public double getOrderTotal() {
        return orderTotal;
    }

    // Method to calculate the total cost of the order
    private double calculateOrderTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to generate an order summary
    public String generateOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(orderID).append("\n");
        summary.append("Customer: ").append(customer.getName()).append("\n");
        summary.append("Products:\n");
        for (Product product : products) {
            summary.append("- ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }
        summary.append("Total: $").append(orderTotal);
        return summary.toString();
    }
}
