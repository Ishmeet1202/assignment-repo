package com.springboot.rest_services_part_two.repositories;

import com.springboot.rest_services_part_two.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private static List<User> users = new ArrayList<>();
    private static Integer count = 0;

    static {
        users.add(new User(++count,"Rahul","rahul@example.com","rahul@123"));
        users.add(new User(++count,"Anuj","anuj@example.com","anuj@123"));
        users.add(new User(++count,"Bharat","bharat@example.com","bharat@123"));
    }


    public Optional<User> findById(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        users.add(new User(++count, user.getName(), user.getEmail(), user.getPassword()));
        return users.getLast();
    }

    public void deleteById(Integer id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
