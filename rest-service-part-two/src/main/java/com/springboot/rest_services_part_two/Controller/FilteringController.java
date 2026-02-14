package com.springboot.rest_services_part_two.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.springboot.rest_services_part_two.Model.User;
import com.springboot.rest_services_part_two.repositories.UserRepository;
import com.springboot.rest_services_part_two.views.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilteringController {

    private UserRepository repository;

    @Autowired
    public FilteringController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/users-static")
    public User saveUserStatic(@RequestBody User user) {
        return repository.save(user);
    }


    @PostMapping("/users-dynamic")
    @JsonView(Views.View1.class)
    public User saveUserDynamic(@RequestBody User user) {
        return repository.save(user);
    }

}
