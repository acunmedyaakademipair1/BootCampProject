package com.example.BootCampProject.service.abstracts;



import com.example.BootCampProject.service.dtos.requests.instructor.CreateInstructorRequests;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdateInstructorRequests;
import com.example.BootCampProject.service.dtos.responses.instructor.CreateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdateInstructorResponses;

import java.util.List;

public interface InstructorService {
    CreateInstructorResponses add(CreateInstructorRequests requests);
    List<GetAllInstructorResponses> getAll();
    UpdateInstructorResponses update(UpdateInstructorRequests updateUserRequests);
    void delete(int id);
    GetInstructorResponses getByName(String name);
}
