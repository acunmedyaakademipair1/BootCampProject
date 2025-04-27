package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Instructor;
import com.example.BootCampProject.repository.InstructorRepository;
import com.example.BootCampProject.service.abstracts.InstructorService;
import com.example.BootCampProject.service.dtos.requests.instructor.CreateInstructorRequests;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdateInstructorRequests;
import com.example.BootCampProject.service.dtos.responses.instructor.CreateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponses;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public CreateInstructorResponses add(CreateInstructorRequests requests) {
        Instructor instructor = new Instructor();
        instructor.setId(requests.getId());
        instructor.setCompanyName(requests.getCompanyName());
        Instructor createdInstructor = instructorRepository.save(instructor);

        CreateInstructorResponses responses = new CreateInstructorResponses();
        responses.setId(createdInstructor.getId());
        responses.setCompanyName(createdInstructor.getCompanyName());
        return responses;

    }

    @Override
    public List<GetAllInstructorResponses> getAll() {

        return instructorRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public UpdateInstructorResponses update(UpdateInstructorRequests updateUserRequests) {
        Instructor instructor = instructorRepository.findById(updateUserRequests.getId()).orElseThrow(()-> new RuntimeException("Instructor not found"));
        instructor.setCompanyName(updateUserRequests.getCompanyName());
        Instructor updatedInstructor = instructorRepository.save(instructor);


        UpdateInstructorResponses responses = new UpdateInstructorResponses();
        responses.setId(updatedInstructor.getId());
        responses.setCompanyName(updateUserRequests.getCompanyName());
        return responses;
    }

    @Override
    public void delete(int id) {
        instructorRepository.deleteById(id);

    }

    @Override
    public GetInstructorResponses getByName(String name) {
        return null;
    }

    private GetAllInstructorResponses mapToResponse(Instructor instructor) {
        GetAllInstructorResponses responses = new GetAllInstructorResponses();
        responses.setId(instructor.getId());
        responses.setCompanyName(instructor.getCompanyName());
        return responses;

    }

    private GetInstructorResponses mapToInstructorResponse(Instructor instructor) {
        GetInstructorResponses responses = new GetInstructorResponses();
        responses.setId(instructor.getId());
        responses.setCompanyName(instructor.getCompanyName());
        return responses;
    }
}

