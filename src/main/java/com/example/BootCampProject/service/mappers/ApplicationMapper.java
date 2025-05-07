package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.requests.application.UpdatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetAllApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.UpdatedApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ApplicationMapper {

    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", constant = "PENDING")
    Application createRequestToApplication(CreatedApplicationRequest request);
    Application updateRequestToApplication(UpdatedApplicationRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", source = "applicationState")
    GetApplicationResponse applicationToGetResponse(Application application);
    GetAllApplicationResponse applicationToGetAllResponse(Application application);
    CreatedApplicationResponse applicationToCreateResponse(Application application);
    UpdatedApplicationResponse applicationToUpdateResponse(Application application);


    default Applicant map(int applicantId) {
        Applicant applicant = new Applicant();
        applicant.setId(applicantId);
        return applicant;
    }

    default Bootcamp mapBootcamp(int bootcampId) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setId(bootcampId);
        return bootcamp;
    }


}

