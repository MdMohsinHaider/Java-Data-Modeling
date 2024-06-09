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
