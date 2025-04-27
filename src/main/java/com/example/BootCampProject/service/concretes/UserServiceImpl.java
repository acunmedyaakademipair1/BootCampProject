package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.repository.UserRepository;
import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.user.CreatedUserRequest;
import com.example.BootCampProject.service.dtos.requests.user.UpdatedUserRequest;
import com.example.BootCampProject.service.dtos.responses.user.CreatedUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponse;
import com.example.BootCampProject.service.dtos.responses.user.UpdatedUserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public CreatedUserResponse add(CreatedUserRequest requests){
        User user = new User();
        user.setUserName(requests.getUserName());
        user.setFirstName(requests.getFirstName());
        user.setLastName(requests.getLastName());
        user.setEmail(requests.getEmail());
        user.setDateOfBirth(requests.getDateOfBirth());
        user.setPassword(requests.getPassword());
        user.setNationalIdentity(requests.getNationalIdentity());
        User createUser = userRepository.save(user);

        CreatedUserResponse responses = new CreatedUserResponse();
        responses.setId(createUser.getId());
        responses.setUserName(createUser.getUserName());
        responses.setFirstName(createUser.getFirstName());
        responses.setLastName(createUser.getLastName());
        responses.setEmail(createUser.getEmail());
        responses.setDateOfBirth(createUser.getDateOfBirth());
        responses.setPassword(createUser.getPassword());
        responses.setNationalIdentity(createUser.getNationalIdentity());
        return responses;
    }

    @Override
    public List<GetAllUserResponse> getAll() {
        return userRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public UpdatedUserResponse update(UpdatedUserRequest updatedUserRequest) {
        User user = userRepository.findById(updatedUserRequest.getId()).orElseThrow(()-> new RuntimeException("User not found"));
        user.setFirstName(updatedUserRequest.getFirstName());
        user.setLastName(updatedUserRequest.getLastName());
        user.setUserName(updatedUserRequest.getUserName());
        user.setEmail(updatedUserRequest.getEmail());
        user.setDateOfBirth(updatedUserRequest.getDateOfBirth());
        user.setPassword(updatedUserRequest.getPassword());
        user.setNationalIdentity(updatedUserRequest.getNationalIdentity());
        User createUser = userRepository.save(user);

        UpdatedUserResponse responses = new UpdatedUserResponse();
        responses.setId(createUser.getId());
        responses.setUserName(createUser.getUserName());
        responses.setFirstName(createUser.getFirstName());
        responses.setLastName(createUser.getLastName());
        responses.setEmail(createUser.getEmail());
        responses.setDateOfBirth(createUser.getDateOfBirth());
        responses.setPassword(createUser.getPassword());
        responses.setNationalIdentity(createUser.getNationalIdentity());
        return responses;



    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);

    }

    @Override
    public GetUserResponse findByUserName(String userName) {
        return null;
    }

    @Override
    public User getByName(String name) {
        return null;
    }




    private GetAllUserResponse mapToResponse(User user) {
        GetAllUserResponse responses = new GetAllUserResponse();
        responses.setId(user.getId());
        responses.setUserName(user.getUserName());
        responses.setFirstName(user.getFirstName());
        responses.setLastName(user.getLastName());
        responses.setEmail(user.getEmail());
        responses.setDateOfBirth(user.getDateOfBirth());
        responses.setPassword(user.getPassword());
        responses.setNationalIdentity(user.getNationalIdentity());
        return responses;
    }

    private GetUserResponse mapToUserResponses(User user) {
        GetUserResponse responses = new GetUserResponse();
        responses.setId(user.getId());
        responses.setUserName(user.getUserName());
        responses.setFirstName(user.getFirstName());
        responses.setLastName(user.getLastName());
        responses.setEmail(user.getEmail());
        responses.setDateOfBirth(user.getDateOfBirth());
        responses.setPassword(user.getPassword());
        responses.setNationalIdentity(user.getNationalIdentity());
        return responses;
    }




}
