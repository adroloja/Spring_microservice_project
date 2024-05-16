package com.adroyoyo.user.domain.services.impl;

import com.adroyoyo.user.domain.dto.request.UserRequest;
import com.adroyoyo.user.domain.dto.respond.UserResponse;
import com.adroyoyo.user.domain.entities.UserEntity;
import com.adroyoyo.user.domain.repositories.UserRepository;
import com.adroyoyo.user.domain.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(UserRequest request) {

        var user = UserEntity.builder()
                .firstName(request.getFirstName())
                .email(request.getEmail())
                .role(request.getRole())
                .lastName(request.getLastName())
                .password(request.getPassword())
                .build();

        userRepository.save(user);

        log.info("User created with email: {}", request.getEmail());
    }

    @Override
    public UserResponse getUserById(long id) {

//        return userRepository.existsById(id) ? userRepository.findById(id).get() : null;
        return null;
    }
}
