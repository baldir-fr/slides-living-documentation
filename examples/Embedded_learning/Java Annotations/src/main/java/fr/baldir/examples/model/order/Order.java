package fr.baldir.examples.model.order;

import fr.baldir.examples.model.user.User;
import fr.baldir.meta.annotations.best.practices.DomainModel;
import fr.baldir.meta.annotations.smells.PrimitiveObsession;

import java.time.LocalDate;
import java.util.List;

@DomainModel
@PrimitiveObsession
public class Order {

    static int delveryNumberSequence = 1;
    private final List<OrderItem> orderItems;
    private float price;

    public enum OrderStatus {
        VALIDATION_PENDING,
        WAITING_ACCEPTATION,
        PREPARING,
        READY_FOR_DELIVERY,
        DELIVERY_IN_PROGRESS,
        READY_TO_COLLECT,
        ENDED,
        REFUSED,
        CANCELLED
    }


    private final User customer;

    private User provider;

    private OrderStatus orderStatus;

    private boolean toDeDelivered;

    private final int deliveryNumber;

    private LocalDate orderDate;

    public Order(User customer, List<OrderItem> orderItems) {
        this.orderItems = orderItems;
        this.deliveryNumber = delveryNumberSequence++;
        this.toDeDelivered = false;
        this.customer = customer;
        this.customer.order(this);

        orderDate = LocalDate.now();

        orderStatus = OrderStatus.VALIDATION_PENDING;

    }

    public void validate() {
        // Do something and change status
    }

    public void accept() {
        // Do something and change status
    }

    public void refuse() {
        // Do something and change status
    }

    public void close() {
        // Do something and change status
    }

    public void cancel() {
        // Do something and change status
    }

    public void prepareDelivery() {
        // Do something and change status
    }

    public void beginDelivery() {
        // Do something and change status
    }

    public float price() {
        return this.price;
    }

    public OrderStatus status() {
        return orderStatus;
    }

    public User customer() {
        return customer;
    }

    public User provider() {
        return provider;
    }

    public void addDelivery(Delivery delivery) {
        // Do something and change status
    }


    public boolean canBeDelivered() {
        return toDeDelivered;
    }


    public String deliveryIdentifier() {
        return String.format("%06d", deliveryNumber);
    }

    public LocalDate orderDate() {
        return orderDate;
    }


}
