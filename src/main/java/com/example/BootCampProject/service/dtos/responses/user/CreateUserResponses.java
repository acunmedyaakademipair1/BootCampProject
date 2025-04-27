package com.example.BootCampProject.service.dtos.responses.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponses {

    private int id;

    private String userName;


    private String firstName;


    private String lastName;


    private int dateOfBirth;


    private int nationalIdentity;


    private String email;


    private String password;


}
