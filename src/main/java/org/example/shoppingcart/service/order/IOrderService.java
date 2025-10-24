package org.example.shoppingcart.service.order;

import org.example.shoppingcart.models.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}
