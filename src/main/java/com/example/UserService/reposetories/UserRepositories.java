package com.example.UserService.reposetories;

import com.example.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,String> {


}
