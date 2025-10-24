package org.example.shoppingcart.repository;

import org.example.shoppingcart.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order,Long> {
}
