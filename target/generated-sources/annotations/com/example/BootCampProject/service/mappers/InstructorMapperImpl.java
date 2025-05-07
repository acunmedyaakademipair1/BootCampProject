package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Instructor;
import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdatedInstructorResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-07T22:44:40+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
public class InstructorMapperImpl implements InstructorMapper {

    @Override
    public Instructor createRequestToInstructor(CreatedInstructorRequest request) {
        if ( request == null ) {
            return null;
        }

        Instructor instructor = new Instructor();

        instructor.setCompanyName( request.getCompanyName() );
        instructor.setId( request.getId() );

        return instructor;
    }

    @Override
    public Instructor updateRequestToInstructor(UpdatedInstructorRequest request) {
        if ( request == null ) {
            return null;
        }

        Instructor instructor = new Instructor();

        instructor.setId( request.getId() );
        instructor.setCompanyName( request.getCompanyName() );

        return instructor;
    }

    @Override
    public GetInstructorResponse instructorToGetResponse(Instructor instructor) {
        if ( instructor == null ) {
            return null;
        }

        GetInstructorResponse getInstructorResponse = new GetInstructorResponse();

        getInstructorResponse.setId( instructor.getId() );
        getInstructorResponse.setCompanyName( instructor.getCompanyName() );

        return getInstructorResponse;
    }

    @Override
    public GetAllInstructorResponse instructorToCreateResponse(Instructor instructor) {
        if ( instructor == null ) {
            return null;
        }

        GetAllInstructorResponse getAllInstructorResponse = new GetAllInstructorResponse();

        getAllInstructorResponse.setId( instructor.getId() );
        getAllInstructorResponse.setCompanyName( instructor.getCompanyName() );

        return getAllInstructorResponse;
    }

    @Override
    public UpdatedInstructorResponse instructorToUpdateResponse(Instructor instructor) {
        if ( instructor == null ) {
            return null;
        }

        UpdatedInstructorResponse updatedInstructorResponse = new UpdatedInstructorResponse();

        updatedInstructorResponse.setId( instructor.getId() );
        updatedInstructorResponse.setCompanyName( instructor.getCompanyName() );

        return updatedInstructorResponse;
    }
}
