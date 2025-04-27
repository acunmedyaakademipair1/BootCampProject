package com.example.BootCampProject.service.abstracts;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.service.dtos.requests.user.CreatedUserRequest;
import com.example.BootCampProject.service.dtos.requests.user.UpdatedUserRequest;
import com.example.BootCampProject.service.dtos.responses.user.CreatedUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.UpdatedUserResponse;

import java.util.List;

public interface UserService {
   CreatedUserResponse add(CreatedUserRequest requests);
   List<GetAllUserResponse> getAll();
   UpdatedUserResponse update(UpdatedUserRequest updatedUserRequest);
   void delete(int id);
   GetUserResponse findByUserName(String userName);

   User getByName(String name);
}
