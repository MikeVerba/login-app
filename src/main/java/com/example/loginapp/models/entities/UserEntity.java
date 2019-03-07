package com.example.loginapp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user_table")
@Data
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;




}
