package com.example.UserService.controllers;

import com.example.UserService.entities.User;
import com.example.UserService.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userService;
    @PostMapping
    //CREATE
    public ResponseEntity<User> createUser(@RequestBody User user){

        User user1=userService.saveuser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
   //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user=userService.getUser(userId);
        return ResponseEntity.ok(user);
    }
    // all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
           List<User> allUser=userService.getAllUser();
           return ResponseEntity.ok(allUser);
    }
}
