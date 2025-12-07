package org.example.shoppingcart.service.order;

import org.example.shoppingcart.dto.OrderDto;
import org.example.shoppingcart.models.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
