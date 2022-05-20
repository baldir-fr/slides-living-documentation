package fr.baldir.examples.model.order;

import fr.baldir.examples.sharedkernel.Pair;

public class OrderItem {
    private final Pair<String, Float> item;

    public OrderItem(String product, float quantity
    ) {
        item = new Pair<>(product, quantity);
    }

    public String getProduct() {
        return item.getFirst();
    }

    public Float getQuantiteCommandee() {
        return item.getSecond();
    }

    public void setQuantity(float quantity) {
        item.setSecond(quantity);
    }

}
