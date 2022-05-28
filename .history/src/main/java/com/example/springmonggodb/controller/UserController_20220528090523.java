package com.example.springmonggodb.controller;

import java.util.List;

import com.example.springmonggodb.dto.UserDto;
import com.example.springmonggodb.model.User;
import com.example.springmonggodb.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="https://react-font-end.vercel.app/", allowedHeaders="*")
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("add")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(userDto);
        return ResponseEntity.ok(user);
    }
    @GetMapping("find")
    public ResponseEntity<User> findUserById(@RequestParam("id") String id) {
        User user = userService.findUserById(id);
        return ResponseEntity.ok(user);
    }
    @GetMapping("gettAll")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }
    @GetMapping("findByEmail")
    public ResponseEntity<User> findUserByEmail(@RequestParam("email") String email) {
        User user = userService.findUserByEmail(email);
        return ResponseEntity.ok(user);
    }
}
