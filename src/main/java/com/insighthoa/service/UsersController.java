package com.insighthoa.service;

import com.insighthoa.model.Users;
import com.insighthoa.repo.UserRepository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
public class UsersController {

    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/users")
    public Iterable<Users> getUsers() {
        Iterable<Users> us = userRepository.findAll();
        return userRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/users")
    public Users insert(@RequestBody Users user) {
        return userRepository.save(user);
    }

}
