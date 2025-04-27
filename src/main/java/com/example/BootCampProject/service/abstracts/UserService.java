package com.example.BootCampProject.service.abstracts;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.service.dtos.requests.user.CreateUserRequests;
import com.example.BootCampProject.service.dtos.requests.user.UpdateUserRequests;
import com.example.BootCampProject.service.dtos.responses.user.CreateUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.UpdateUserResponses;

import java.util.List;

public interface UserService {
   CreateUserResponses add(CreateUserRequests requests);
   List<GetAllUserResponses> getAll();
   UpdateUserResponses update(UpdateUserRequests updateUserRequests);
   void delete(int id);
   GetUserResponses findByUserName(String userName);

   User getByName(String name);
}
