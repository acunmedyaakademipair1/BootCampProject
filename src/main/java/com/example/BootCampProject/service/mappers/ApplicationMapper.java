package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ApplicationMapper {

    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", constant = "PENDING")
    Application createRequestToApplication(CreatedApplicationRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "bootcampId", source = "bootcampId")
    @Mapping(target = "applicationState", source = "applicationState")
    GetApplicationResponse applicationToGetApplicationResponse(Application application);



    CreatedApplicationResponse applicationToCreateResponse(Application application);

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

