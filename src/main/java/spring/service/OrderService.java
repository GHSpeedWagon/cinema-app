package spring.service;

import java.util.List;
import spring.model.Order;
import spring.model.ShoppingCart;
import spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
