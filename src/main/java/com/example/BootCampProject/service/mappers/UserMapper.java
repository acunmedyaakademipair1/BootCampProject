package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.user.CreatedUserRequest;
import com.example.BootCampProject.service.dtos.requests.user.UpdatedUserRequest;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "userName", source = "userName")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "dateOfBirth", source = "dateOfBirth")
    @Mapping(target = "nationalIdentity", source = "nationalIdentity")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    User createRequestToUser(CreatedUserRequest request);
    User updateRequestToUser(UpdatedUserRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "userName", source = "userName")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "dateOfBirth", source = "dateOfBirth")
    @Mapping(target = "nationalIdentity", source = "nationalIdentity")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    GetUserResponse userToGetResponse(User user);
    GetAllUserResponse  userToGetAllResponse(User user);
    CreatedUserRequest userToCreateRequestToUser(User user);
    UpdatedUserRequest userToUpdateRequestToUser(User user);

}
