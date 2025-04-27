package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Instructor;
import com.example.BootCampProject.repository.InstructorRepository;
import com.example.BootCampProject.service.abstracts.InstructorService;
import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.CreatedInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdatedInstructorResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public CreatedInstructorResponse add(CreatedInstructorRequest requests) {
        Instructor instructor = new Instructor();
        instructor.setCompanyName(requests.getCompanyName());
        Instructor createdInstructor = instructorRepository.save(instructor);

        CreatedInstructorResponse responses = new CreatedInstructorResponse();
        responses.setCompanyName(createdInstructor.getCompanyName());
        return responses;

    }

    @Override
    public List<GetAllInstructorResponse> getAll() {

        return instructorRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public UpdatedInstructorResponse update(UpdatedInstructorRequest requests) {
        Instructor instructor = new Instructor();
        instructor.setCompanyName(requests.getCompanyName());
        Instructor updatedInstructor = instructorRepository.save(instructor);
        UpdatedInstructorResponse responses = new UpdatedInstructorResponse();
        responses.setCompanyName(updatedInstructor.getCompanyName());
        return responses;
    }

    @Override
    public void delete(int id) {
        instructorRepository.deleteById(id);

    }

    @Override
    public GetInstructorResponse getByName(String name) {
        return null;
    }

    private GetAllInstructorResponse mapToResponse(Instructor instructor) {
        GetAllInstructorResponse responses = new GetAllInstructorResponse();
        responses.setCompanyName(instructor.getCompanyName());
        return responses;

    }

    private GetInstructorResponse mapToInstructorResponse(Instructor instructor) {
        GetInstructorResponse responses = new GetInstructorResponse();
        responses.setCompanyName(instructor.getCompanyName());
        return responses;
    }
}

