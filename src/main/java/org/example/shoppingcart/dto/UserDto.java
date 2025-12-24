package org.example.shoppingcart.dto;

import lombok.Data;
import org.example.shoppingcart.models.Cart;
import org.hibernate.annotations.NaturalId;

import java.util.List;

@Data
public class UserDto {
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;

    private List<OrderDto> orders;
    private CartDto cart;


}
