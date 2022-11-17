package command;

import command.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orders;

    public Broker() {
        orders = new ArrayList<>();
    }

    public Broker(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for( Order order : orders ) {
            order.execute();
        }
        orders.clear();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
