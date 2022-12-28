package spring.dao;

import java.util.List;
import spring.model.Order;
import spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
