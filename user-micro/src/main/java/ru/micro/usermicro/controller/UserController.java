package ru.micro.usermicro.controller;

import org.springframework.web.bind.annotation.*;
import ru.micro.entity.model.User;
import ru.micro.usermicro.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/delete")
    public void deleteUser(@RequestBody Long userId) {
        userService.deleteUser(userId);
    }
}
