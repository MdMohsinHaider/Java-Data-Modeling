import java.util.Date;
import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private Date orderDate;
    private List<OrderItem> orderItems;
    private double totalAmount;

    // Constructors, getters, and setters
    public Order(String id, Customer customer, Date orderDate, List<OrderItem> orderItems, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.totalAmount = totalAmount;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public List<OrderItem> getOrderItems() { return orderItems; }
    public void setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
