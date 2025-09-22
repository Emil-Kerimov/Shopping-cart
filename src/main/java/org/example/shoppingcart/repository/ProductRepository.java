package org.example.shoppingcart.repository;

import org.example.shoppingcart.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
