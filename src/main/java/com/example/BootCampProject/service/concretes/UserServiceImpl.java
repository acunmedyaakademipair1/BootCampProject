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
        return null;
    }

    @Override
    public UpdateUserResponses update(UpdateUserRequests updateUserRequests) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public GetUserResponses findByUserName(String userName) {
        return null;
    }

    @Override
    public User getByName(String name) {
        return null;
    }


}
