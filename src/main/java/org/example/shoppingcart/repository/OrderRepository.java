package org.example.shoppingcart.repository;

import org.example.shoppingcart.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository  extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long attr0);
}
