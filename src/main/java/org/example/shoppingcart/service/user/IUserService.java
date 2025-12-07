package org.example.shoppingcart.service.user;

import org.example.shoppingcart.dto.UserDto;
import org.example.shoppingcart.models.User;
import org.example.shoppingcart.request.CreateUserRequest;
import org.example.shoppingcart.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
