package org.example.shoppingcart.repository;

import org.example.shoppingcart.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
