package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.user.CreatedUserRequest;
import com.example.BootCampProject.service.dtos.requests.user.UpdatedUserRequest;
import com.example.BootCampProject.service.dtos.responses.user.CreatedUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.UpdatedUserResponse;
import org.springframework.http.HttpStatus;
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
    public List<GetAllUserResponse> getUsers(){
        return userService.getAll();
    }
    @PostMapping("/{createUsers}")
    @ResponseStatus(HttpStatus.CREATED) //201
    public CreatedUserResponse add(@RequestBody CreatedUserRequest request){
        return userService.add(request);
    }

    @PutMapping("/{uptadeUsers}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedUserResponse update(@RequestBody UpdatedUserRequest request){
        return userService.update(request);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id){
        userService.delete(id);

    }
}
