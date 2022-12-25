package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.Order;
import mate.academy.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
