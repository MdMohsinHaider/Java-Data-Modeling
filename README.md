# E-Commerce Data Model

This repository contains a simple Java-based data model for an e-commerce business. It includes classes to represent customers, products, orders, order items, and payments. The model is designed to illustrate the core entities and relationships within an e-commerce system.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates the core structure of an e-commerce business model in Java. It includes the following entities:

- `Customer`
- `Product`
- `Order`
- `OrderItem`
- `Payment`

These entities are designed to reflect the typical data structure of an e-commerce application, with basic relationships and data handling.

## Features

- Define and manage customer information.
- Define products with details like description, price, and stock quantity.
- Create and manage orders containing multiple order items.
- Handle payments associated with orders.

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/ecommerce-data-model.git
    ```
2. Navigate to the project directory:
    ```sh
    cd ecommerce-data-model
    ```
3. Compile the Java files:
    ```sh
    javac src/*.java
    ```

## Usage

Here's a simple example of how to use the data model to create an order:

```java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("p1", "Laptop", "High-performance laptop", 999.99, 10);
        Product product2 = new Product("p2", "Smartphone", "Latest model smartphone", 499.99, 20);

        // Create a customer
        Customer customer = new Customer("c1", "John Doe", "john@example.com", "123 Main St", "555-1234");

        // Create order items
        OrderItem item1 = new OrderItem(product1, 1, 999.99);
        OrderItem item2 = new OrderItem(product2, 2, 499.99);

        // Create a list of order items
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(item1);
        orderItems.add(item2);

        // Create an order
        Order order = new Order("o1", customer, new Date(), orderItems, 1999.97);

        // Create a payment
        Payment payment = new Payment("pay1", order, "Credit Card", 1999.97, new Date());

        // Display order and payment details
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Payment Date: " + payment.getPaymentDate());
    }
}
