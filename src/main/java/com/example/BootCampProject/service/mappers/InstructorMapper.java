package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Instructor;
import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdatedInstructorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InstructorMapper {
    @Mapping(target = "companyName", source = "companyName")
    Instructor createRequestToInstructor(CreatedInstructorRequest request);
    Instructor updateRequestToInstructor(UpdatedInstructorRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "companyName", source = "companyName")
    GetInstructorResponse instructorToGetResponse(Instructor instructor);
    GetAllInstructorResponse instructorToCreateResponse(Instructor instructor);
    UpdatedInstructorResponse instructorToUpdateResponse(Instructor instructor);

}
