package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.service.dtos.requests.applicant.CreatedApplicantRequest;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdatedApplicantRequest;
import com.example.BootCampProject.service.dtos.responses.applicant.CreatedApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdatedApplicantResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-07T22:44:40+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
public class ApplicantMapperImpl implements ApplicantMapper {

    @Override
    public Applicant createRequestToApplicant(CreatedApplicantRequest request) {
        if ( request == null ) {
            return null;
        }

        Applicant applicant = new Applicant();

        applicant.setAbout( request.getAbout() );
        applicant.setId( request.getId() );

        return applicant;
    }

    @Override
    public Applicant updateRequestToApplicant(UpdatedApplicantRequest request) {
        if ( request == null ) {
            return null;
        }

        Applicant applicant = new Applicant();

        applicant.setId( request.getId() );
        applicant.setAbout( request.getAbout() );

        return applicant;
    }

    @Override
    public GetApplicantResponse applicantToGetResponse(Applicant applicant) {
        if ( applicant == null ) {
            return null;
        }

        GetApplicantResponse getApplicantResponse = new GetApplicantResponse();

        getApplicantResponse.setId( applicant.getId() );
        getApplicantResponse.setAbout( applicant.getAbout() );

        return getApplicantResponse;
    }

    @Override
    public GetAllApplicantResponse applicantToGetAllResponse(Applicant applicant) {
        if ( applicant == null ) {
            return null;
        }

        GetAllApplicantResponse getAllApplicantResponse = new GetAllApplicantResponse();

        getAllApplicantResponse.setId( applicant.getId() );
        getAllApplicantResponse.setAbout( applicant.getAbout() );

        return getAllApplicantResponse;
    }

    @Override
    public CreatedApplicantResponse applicantToCreateResponse(Applicant applicant) {
        if ( applicant == null ) {
            return null;
        }

        CreatedApplicantResponse createdApplicantResponse = new CreatedApplicantResponse();

        createdApplicantResponse.setId( applicant.getId() );
        createdApplicantResponse.setAbout( applicant.getAbout() );

        return createdApplicantResponse;
    }

    @Override
    public UpdatedApplicantResponse applicantToUpdateResponse(Applicant applicant) {
        if ( applicant == null ) {
            return null;
        }

        UpdatedApplicantResponse updatedApplicantResponse = new UpdatedApplicantResponse();

        updatedApplicantResponse.setAbout( applicant.getAbout() );

        return updatedApplicantResponse;
    }
}
