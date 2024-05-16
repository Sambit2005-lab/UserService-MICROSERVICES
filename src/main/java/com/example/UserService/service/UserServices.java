package com.example.UserService.service;

import com.example.UserService.entities.User;

import java.util.List;

public interface UserServices {

    //create
    User saveuser(User user);

    //get all user
    List<User> getAllUser();

    // get single user of given userId

    User getUser(String userId);

}
