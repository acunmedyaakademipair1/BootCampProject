package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.core.ApplicationState;
import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.requests.application.UpdatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetAllApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.UpdatedApplicationResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T07:52:15+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public Application createRequestToApplication(CreatedApplicationRequest request) {
        if (request == null) {
            return null;
        }

        Application application = new Application();

        // applicantId ve bootcampId'yi doğru şekilde ayarlayın
        application.setApplicantId(request.getApplicantId());
        application.setBootcampId(request.getBootcampId());

        application.setApplicationState(ApplicationState.PENDING);

        return application;
    }

    @Override
    public Application updateRequestToApplication(UpdatedApplicationRequest request) {
        if (request == null) {
            return null;
        }

        Application application = new Application();

        application.setId(request.getId());
        application.setApplicantId(request.getApplicantId());
        application.setBootcampId(request.getBootcampId());
        application.setApplicationState(request.getApplicationState());

        return application;
    }

    @Override
    public GetApplicationResponse applicationToGetResponse(Application application) {
        if (application == null) {
            return null;
        }

        GetApplicationResponse getApplicationResponse = new GetApplicationResponse();

        getApplicationResponse.setId(application.getId());
        getApplicationResponse.setApplicantId(application.getApplicantId());
        getApplicationResponse.setBootcampId(application.getBootcampId());
        getApplicationResponse.setApplicationState(application.getApplicationState());

        return getApplicationResponse;
    }

    @Override
    public GetAllApplicationResponse applicationToGetAllResponse(Application application) {
        if (application == null) {
            return null;
        }

        GetAllApplicationResponse getAllApplicationResponse = new GetAllApplicationResponse();

        getAllApplicationResponse.setId(application.getId());
        getAllApplicationResponse.setApplicantId(application.getApplicantId());
        getAllApplicationResponse.setBootcampId(application.getBootcampId());
        getAllApplicationResponse.setApplicationState(application.getApplicationState());

        return getAllApplicationResponse;
    }

    @Override
    public CreatedApplicationResponse applicationToCreateResponse(Application application) {
        if (application == null) {
            return null;
        }

        CreatedApplicationResponse createdApplicationResponse = new CreatedApplicationResponse();

        createdApplicationResponse.setId(application.getId());
        createdApplicationResponse.setApplicantId(application.getApplicantId());
        createdApplicationResponse.setBootcampId(application.getBootcampId());
        createdApplicationResponse.setApplicationState(application.getApplicationState());

        return createdApplicationResponse;
    }

    @Override
    public UpdatedApplicationResponse applicationToUpdateResponse(Application application) {
        if (application == null) {
            return null;
        }

        UpdatedApplicationResponse updatedApplicationResponse = new UpdatedApplicationResponse();

        updatedApplicationResponse.setId(application.getId());
        updatedApplicationResponse.setApplicantId(application.getApplicantId());
        updatedApplicationResponse.setBootcampId(application.getBootcampId());
        updatedApplicationResponse.setApplicationState(application.getApplicationState());

        return updatedApplicationResponse;
    }

}
