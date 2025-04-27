package com.example.BootCampProject.service.abstracts;



import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.CreatedInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdatedInstructorResponse;

import java.util.List;

public interface InstructorService {
    CreatedInstructorResponse add(CreatedInstructorRequest requests);
    List<GetAllInstructorResponse> getAll();
    UpdatedInstructorResponse update(UpdatedInstructorRequest updatedInstructorRequest);
    void delete(int id);
    GetInstructorResponse getByName(String name);
}
