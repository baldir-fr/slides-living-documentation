package fr.baldir.examples.model.order;

import fr.baldir.examples.model.user.User;

import java.util.List;

public class Delivery {

    User provider;

    List<Order> orders;

    User deliveryMan;

    public enum DeliveryStatus {
        DELIVERY_PENDING, DELIVERY_IN_PROGRESS, DELIVERED
    }

    DeliveryStatus deliveryStatus;


    private Order currentOrderToDeliver;

    public Delivery(List<Order> orders) {

        this.provider = orders.get(0).provider();

        if (!checkProviderIsUnique(orders)) {
            throw new IllegalArgumentException();
        }




        this.orders = orders;
        deliveryStatus = DeliveryStatus.DELIVERY_PENDING;

        for (Order order : orders) {
            order.addDelivery(this);
        }
    }

    private boolean checkProviderIsUnique(List<Order> orders) {
        User provider = orders.get(0).provider();

        for (Order order : orders) {
            if (order.provider() != provider) {
                return false;
            }
        }

        return true;
    }

    public void addDeliveryMan(User user) {


        this.deliveryMan = user;
        this.deliveryMan.addOrderAsDeliveryMan(this.orders);
    }


    /**
     * Lance le démarrage de la livraison
     */
    public void beginDelivery() {
        deliveryStatus = DeliveryStatus.DELIVERY_IN_PROGRESS;

        for (Order commande : orders) {
            commande.beginDelivery();
        }


        setNextOrderToDeliver();
    }


    /**
     * Indique le prochain point de livraison (prochaine commande) à livrer
     */
    private void setNextOrderToDeliver() {
        for (Order order : orders) {
            if (order.status().equals(Order.OrderStatus.DELIVERY_IN_PROGRESS)) {
                currentOrderToDeliver = order;
                return;
            }
        }
    }

    public void currentOrderHasBeenDelivered() {
        if (deliveryStatus != DeliveryStatus.DELIVERY_IN_PROGRESS) {
            throw new IllegalStateException("Pour livrer une commande en cours, la livraison doit être dans le statut LIVRAISON_EN_COURS");
        }

        if (orders.get(orders.size() - 1).equals(currentOrderToDeliver)) {
            deliveryStatus = DeliveryStatus.DELIVERED;
        }
        setNextOrderToDeliver();
    }


    public List<Order> getOrders() {
        return orders;
    }


    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }


    public Order getCurrentOrderToDeliver() {
        return currentOrderToDeliver;
    }


    public User getDeliveryMan() {
        return deliveryMan;
    }


}
