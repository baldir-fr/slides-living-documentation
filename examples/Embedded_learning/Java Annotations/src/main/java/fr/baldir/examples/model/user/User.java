package fr.baldir.examples.model.user;

import fr.baldir.examples.model.order.Order;
import fr.baldir.meta.annotations.antipatterns.AnemicDomainModel;
import fr.baldir.meta.annotations.smells.PrimitiveObsession;

import java.util.ArrayList;
import java.util.List;

@AnemicDomainModel
@PrimitiveObsession
public class User {

    private String lastName;
    private String firstName;
    private final String occupation;
    private final String description;
    private float bankAccountBalance;

    private final List<Order> orders;

    private final List<Order> ordersAsProvider;

    private final List<Order> ordersAsDeliveryMan;

    public User(String lastName, String firstName, String occupation) {
        super();


        this.lastName = lastName;
        this.firstName = firstName;
        this.occupation = occupation;
        this.bankAccountBalance = 0;

        orders = new ArrayList<>();
        ordersAsProvider = new ArrayList<>();
        ordersAsDeliveryMan = new ArrayList<>();

        this.description = "fdgfshf ";
    }


    public float getBankAccountBalance() {
        return bankAccountBalance;
    }

    @Deprecated
    @AnemicDomainModel
    public void setBankAccountBalance(float bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getDescription() {
        return description;
    }

    public String getOccupation() {
        return occupation;
    }

    public void order(Order order) {
        orders.add(order);
    }

    public void addOrderAsProvider(Order commande) {
        ordersAsProvider.add(commande);
    }


    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrdersAsProvider() {
        return ordersAsProvider;
    }

    public void addOrderAsDeliveryMan(List<Order> orders) {
        ordersAsDeliveryMan.addAll(orders);
    }

    public List<Order> getOrdersAsDeliveryMan() {
        return ordersAsDeliveryMan;
    }

}
