package com.adroyoyo.sell.domain.service.impl;

import com.adroyoyo.sell.domain.dto.request.UserRequest;
import com.adroyoyo.sell.domain.entity.UserEntity;
import com.adroyoyo.sell.domain.repository.UserRepository;
import com.adroyoyo.sell.domain.service.UserService;
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
}
