package com.example.librarylastversion.controller;

import com.example.librarylastversion.entity.UserEntity;
import com.example.librarylastversion.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }
}
