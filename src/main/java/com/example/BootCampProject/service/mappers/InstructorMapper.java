package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Instructor;
import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InstructorMapper {
    @Mapping(target = "companyname", source = "companyname")
    @Mapping(target = "applications", source = "applications")
    Instructor createRequestToInstructor(CreatedInstructorRequest request);


    @Mapping(target = "id", source = "id")
    @Mapping(target = "companyname", source = "companyname")
    @Mapping(target = "applications", source = "applications")
    GetInstructorResponse instructorToGetResponse(Instructor instructor);

}
