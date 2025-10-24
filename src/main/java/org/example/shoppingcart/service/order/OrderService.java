package org.example.shoppingcart.service.order;

import lombok.RequiredArgsConstructor;
import org.example.shoppingcart.exceptions.ResourceNotFoundException;
import org.example.shoppingcart.models.Order;
import org.example.shoppingcart.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order placeOrder(Long userId) {
        return null;
    }

    @Override
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
    }
}
