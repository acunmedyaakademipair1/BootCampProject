package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.service.abstracts.InstructorService;
import com.example.BootCampProject.service.dtos.requests.instructor.CreateInstructorRequests;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdateInstructorRequests;
import com.example.BootCampProject.service.dtos.responses.instructor.CreateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdateInstructorResponses;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {
    @Override
    public CreateInstructorResponses add(CreateInstructorRequests requests) {
        return null;
    }

    @Override
    public List<GetAllInstructorResponses> getAll() {
        return null;
    }

    @Override
    public UpdateInstructorResponses update(UpdateInstructorRequests updateUserRequests) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public GetInstructorResponses getByName(String name) {
        return null;
    }
}
