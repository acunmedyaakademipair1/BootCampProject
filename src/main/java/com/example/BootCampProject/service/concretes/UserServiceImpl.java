package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.User;
import com.example.BootCampProject.repository.UserRepository;
import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.user.CreateUserRequests;
import com.example.BootCampProject.service.dtos.requests.user.UpdateUserRequests;
import com.example.BootCampProject.service.dtos.responses.user.CreateUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetUserResponses;
import com.example.BootCampProject.service.dtos.responses.user.UpdateUserResponses;
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
    public CreateUserResponses add(CreateUserRequests requests){
        User user = new User();
        user.setUserName(requests.getUserName());
        user.setFirstName(requests.getFirstName());
        user.setLastName(requests.getLastName());
        user.setEmail(requests.getEmail());
        user.setDateOfBirth(requests.getDateOfBirth());
        user.setPassword(requests.getPassword());
        user.setNationalIdentity(requests.getNationalIdentity());
        User createUser = userRepository.save(user);

        CreateUserResponses responses = new CreateUserResponses();
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
    public List<GetAllUserResponses> getAll() {
        return userRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public UpdateUserResponses update(UpdateUserRequests updateUserRequests) {
        User user = userRepository.findById(updateUserRequests.getId()).orElseThrow(()-> new RuntimeException("User not found"));
        user.setFirstName(updateUserRequests.getFirstName());
        user.setLastName(updateUserRequests.getLastName());
        user.setUserName(updateUserRequests.getUserName());
        user.setEmail(updateUserRequests.getEmail());
        user.setDateOfBirth(updateUserRequests.getDateOfBirth());
        user.setPassword(updateUserRequests.getPassword());
        user.setNationalIdentity(updateUserRequests.getNationalIdentity());
        User createUser = userRepository.save(user);

        UpdateUserResponses responses = new UpdateUserResponses();
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
    public GetUserResponses findByUserName(String userName) {
        return null;
    }

    @Override
    public User getByName(String name) {
        return null;
    }




    private GetAllUserResponses mapToResponse(User user) {
        GetAllUserResponses responses = new GetAllUserResponses();
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

    private GetUserResponses mapToUserResponses(User user) {
        GetUserResponses responses = new GetUserResponses();
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
