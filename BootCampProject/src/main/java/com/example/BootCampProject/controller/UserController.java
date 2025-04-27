package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.user.CreateUserRequests;
import com.example.BootCampProject.service.dtos.requests.user.UpdateUserRequests;
import com.example.BootCampProject.service.dtos.responses.user.CreateUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.DeleteUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.UpdateUserResponses;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/{getAllUsers}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllUserResponses> getUsers(){
        return userService.getAll();
    }
    @PostMapping("/{createUsers}")
    @ResponseStatus(HttpStatus.CREATED) //201
    public CreateUserResponses add(@RequestBody CreateUserRequests request){
        return userService.add(request);
    }

    @PutMapping("/{uptadeUsers}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateUserResponses update(@RequestBody UpdateUserRequests request){
        return userService.update(request);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id){
        userService.delete(id);

    }
}
