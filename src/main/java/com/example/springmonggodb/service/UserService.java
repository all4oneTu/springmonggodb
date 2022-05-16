package com.example.springmonggodb.service;



import java.util.List;

import com.example.springmonggodb.dto.UserDto;
import com.example.springmonggodb.model.User;

public interface UserService {
    User createUser(UserDto userDto);

    User findUserById(String id);
    
    List<User> getAllUsers();

    User findUserByEmail(String email);
}
