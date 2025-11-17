package org.example.shoppingcart.service.order;

import org.example.shoppingcart.models.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}
