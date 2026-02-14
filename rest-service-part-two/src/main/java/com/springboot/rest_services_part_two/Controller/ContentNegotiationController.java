package com.springboot.rest_services_part_two.Controller;


import com.springboot.rest_services_part_two.Model.User;
import com.springboot.rest_services_part_two.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class ContentNegotiationController {

    private UserRepository repository;

    @Autowired
    public ContentNegotiationController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping()
    public List<User> getUsers() {
        return repository.findAll();
    }
}
