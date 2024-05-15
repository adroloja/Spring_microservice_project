package com.adroyoyo.sell.domain.controller;

import com.adroyoyo.sell.domain.dto.request.UserRequest;
import com.adroyoyo.sell.domain.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserRequest request){

        this.userService.createUser(request);
    }
}
