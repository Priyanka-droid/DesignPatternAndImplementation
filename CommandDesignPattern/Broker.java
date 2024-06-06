package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    public void addOrder(Order... orders) {
        for (Order order : orders) {
            this.orders.add(order);
        }
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
    }
}
