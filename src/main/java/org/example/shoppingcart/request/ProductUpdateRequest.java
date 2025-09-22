package org.example.shoppingcart.request;

import lombok.Data;
import org.example.shoppingcart.models.Category;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
