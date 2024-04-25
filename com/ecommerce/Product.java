package com.ecommerce;

// The Product class represents a product available for purchase in the e-commerce system.
public class Product {
    // Attributes of the product
    private String productID;  // Unique identifier for the product
    private String name;       // Name of the product
    private double price;      // Price of the product

    // Constructor for the Product class
    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Getter for productID
    public String getProductID() {
        return productID;
    }

    // Setter for productID
    public void setProductID(String productID) {
        this.productID = productID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}
