package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.service.dtos.requests.user.CreatedUserRequest;
import com.example.BootCampProject.service.dtos.requests.user.UpdatedUserRequest;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T09:20:21+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User createRequestToUser(CreatedUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( request.getUserName() );
        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setDateOfBirth( request.getDateOfBirth() );
        user.setNationalIdentity( request.getNationalIdentity() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        user.setId( request.getId() );

        return user;
    }

    @Override
    public User updateRequestToUser(UpdatedUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setId( request.getId() );
        user.setUserName( request.getUserName() );
        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setDateOfBirth( request.getDateOfBirth() );
        user.setNationalIdentity( request.getNationalIdentity() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );

        return user;
    }

    @Override
    public GetUserResponse userToGetResponse(User user) {
        if ( user == null ) {
            return null;
        }

        GetUserResponse getUserResponse = new GetUserResponse();

        getUserResponse.setId( user.getId() );
        getUserResponse.setUserName( user.getUserName() );
        getUserResponse.setFirstName( user.getFirstName() );
        getUserResponse.setLastName( user.getLastName() );
        getUserResponse.setDateOfBirth( user.getDateOfBirth() );
        getUserResponse.setNationalIdentity( user.getNationalIdentity() );
        getUserResponse.setEmail( user.getEmail() );
        getUserResponse.setPassword( user.getPassword() );

        return getUserResponse;
    }

    @Override
    public GetAllUserResponse userToGetAllResponse(User user) {
        if ( user == null ) {
            return null;
        }

        GetAllUserResponse getAllUserResponse = new GetAllUserResponse();

        getAllUserResponse.setId( user.getId() );
        getAllUserResponse.setUserName( user.getUserName() );
        getAllUserResponse.setFirstName( user.getFirstName() );
        getAllUserResponse.setLastName( user.getLastName() );
        getAllUserResponse.setDateOfBirth( user.getDateOfBirth() );
        getAllUserResponse.setNationalIdentity( user.getNationalIdentity() );
        getAllUserResponse.setEmail( user.getEmail() );
        getAllUserResponse.setPassword( user.getPassword() );

        return getAllUserResponse;
    }

    @Override
    public CreatedUserRequest userToCreateRequestToUser(User user) {
        if ( user == null ) {
            return null;
        }

        CreatedUserRequest createdUserRequest = new CreatedUserRequest();

        createdUserRequest.setId( user.getId() );
        createdUserRequest.setUserName( user.getUserName() );
        createdUserRequest.setFirstName( user.getFirstName() );
        createdUserRequest.setLastName( user.getLastName() );
        createdUserRequest.setDateOfBirth( user.getDateOfBirth() );
        createdUserRequest.setNationalIdentity( user.getNationalIdentity() );
        createdUserRequest.setEmail( user.getEmail() );
        createdUserRequest.setPassword( user.getPassword() );

        return createdUserRequest;
    }

    @Override
    public UpdatedUserRequest userToUpdateRequestToUser(User user) {
        if ( user == null ) {
            return null;
        }

        UpdatedUserRequest updatedUserRequest = new UpdatedUserRequest();

        updatedUserRequest.setId( user.getId() );
        updatedUserRequest.setUserName( user.getUserName() );
        updatedUserRequest.setFirstName( user.getFirstName() );
        updatedUserRequest.setLastName( user.getLastName() );
        updatedUserRequest.setDateOfBirth( user.getDateOfBirth() );
        updatedUserRequest.setNationalIdentity( user.getNationalIdentity() );
        updatedUserRequest.setEmail( user.getEmail() );
        updatedUserRequest.setPassword( user.getPassword() );

        return updatedUserRequest;
    }
}
