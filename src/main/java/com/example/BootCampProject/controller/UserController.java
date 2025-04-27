package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.user.CreateUserRequests;
import com.example.BootCampProject.service.dtos.responses.user.CreateUserResponses;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService brandService) {
        this.userService = brandService;
    }
    @PostMapping("/createusers")
    @ResponseStatus(HttpStatus.CREATED) //201
    public CreateUserResponses add(@RequestBody CreateUserRequests request){
        return userService.add(request);
    }
}
