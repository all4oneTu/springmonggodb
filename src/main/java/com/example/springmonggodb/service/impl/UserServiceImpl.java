package com.example.springmonggodb.service.impl;



import java.util.List;

import com.example.springmonggodb.dto.UserDto;
import com.example.springmonggodb.model.User;
import com.example.springmonggodb.repository.UserRepository;
import com.example.springmonggodb.service.UserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
       
        return userRepository.findById(id).get();
    }
    @Override
    public List<User> getAllUsers() {
        
        return userRepository.findAll();
    }
    @Override
    public User findUserByEmail(String email) {
        // TODO Auto-generated method stub
        return userRepository.findByEmail(email);
    }
   

   
    
}
