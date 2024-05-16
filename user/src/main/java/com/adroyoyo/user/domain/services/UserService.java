package com.adroyoyo.user.domain.services;

import com.adroyoyo.user.domain.dto.request.UserRequest;
import com.adroyoyo.user.domain.dto.respond.UserResponse;

public interface UserService {

    void createUser(UserRequest request);

    UserResponse getUserById(long id);
}
