package org.example.shoppingcart.service.user;

import lombok.RequiredArgsConstructor;
import org.example.shoppingcart.dto.UserDto;
import org.example.shoppingcart.exceptions.AlreadyExistsException;
import org.example.shoppingcart.exceptions.ResourceNotFoundException;
import org.example.shoppingcart.models.User;
import org.example.shoppingcart.repository.UserRepository;
import org.example.shoppingcart.request.CreateUserRequest;
import org.example.shoppingcart.request.UserUpdateRequest;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public User createUser(CreateUserRequest request) {
        return Optional.of(request)
                .filter(userRequest -> !userRepository.existsByEmail(userRequest.getEmail()))
                        .map(userRequest  ->{
                            User user = new User();
                            user.setEmail(userRequest.getEmail());
                            user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
                            user.setFirstName(userRequest.getFirstName());
                            user.setLastName(userRequest.getLastName());
                            return userRepository.save(user);
                        }).orElseThrow(() -> new AlreadyExistsException(request.getEmail() + "User already exists"));
    }

    @Override
    public User updateUser(UserUpdateRequest request, Long userId) {
        return userRepository.findById(userId).map(existingUser -> {
            existingUser.setFirstName(request.getFirstName());
            existingUser.setLastName(request.getLastName());
            return userRepository.save(existingUser);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found!"));
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.findById(userId).ifPresentOrElse(userRepository :: delete, () -> {
            throw new ResourceNotFoundException("User not found");
        });
    }

    @Override
    public UserDto convertUserToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public User getAuthenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        return userRepository.findByEmail(email);
    }
}
