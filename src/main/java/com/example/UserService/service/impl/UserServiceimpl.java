package com.example.UserService.service.impl;

import com.example.UserService.entities.User;
import com.example.UserService.exception.ResourceNotFoundException;
import com.example.UserService.reposetories.UserRepositories;
import com.example.UserService.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UserServiceimpl implements UserServices {

    @Autowired
    private UserRepositories userRepositories;
    @Override
    public User saveuser(User user) {
        //GENERATE UNIQUE USER ID
       String randomUserId= UUID.randomUUID().toString();
       user.setUserId(randomUserId);

        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepositories.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server "));
    }
}
