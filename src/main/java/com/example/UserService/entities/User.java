package com.example.UserService.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "micro_users")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {


    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;
    @Column(name = "DOB")
    private Integer DOB;
    @Column(name = "PHONENUMBER")
    private Integer phonenumber;

    @Transient
    private List<Rating> ratings;
}
