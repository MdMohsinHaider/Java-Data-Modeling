import java.util.Date;

public class Payment {
    private String id;
    private Order order;
    private String paymentMethod;
    private double amount;
    private Date paymentDate;

    // Constructors, getters, and setters
    public Payment(String id, Order order, String paymentMethod, double amount, Date paymentDate) {
        this.id = id;
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }
}
