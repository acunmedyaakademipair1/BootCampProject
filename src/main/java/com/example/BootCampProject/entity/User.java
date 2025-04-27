package com.example.BootCampProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "idlastname")
    private String lastName;

    @Column(name = "dateOfBirth")
    private int dateOfBirth;

    @Column(name = "nationalIdentity")
    private int nationalIdentity;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;




}
