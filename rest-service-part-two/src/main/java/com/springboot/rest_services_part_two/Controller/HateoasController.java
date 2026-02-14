package com.springboot.rest_services_part_two.Controller;

import com.springboot.rest_services_part_two.Model.User;
import com.springboot.rest_services_part_two.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class HateoasController {

    private UserRepository repository;

    @Autowired
    public HateoasController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Husers/{id}")
    public EntityModel<User> getUser(@PathVariable Integer id) {

        Optional<User> user = repository.findById(id);

        EntityModel<User> resource = EntityModel.of(user.get());

        resource.add(linkTo(methodOn(HateoasController.class)
                .getAllUsers()).withRel("all-users"));
        return resource;
    }
    @GetMapping("/Husers")
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
