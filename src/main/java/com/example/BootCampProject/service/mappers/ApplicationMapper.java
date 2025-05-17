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

    @Mapping(target = "bootcampId", expression = "java(new Bootcamp(application.getBootcampId()))")
    @Mapping(target = "applicationState", constant = "PENDING")
    Application createRequestToApplication(CreatedApplicationRequest request);
    Application updateRequestToApplication(UpdatedApplicationRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "bootcampId", expression = "java(new Bootcamp(application.getBootcampId()))")
    @Mapping(target = "applicationState", source = "applicationState")
    GetApplicationResponse applicationToGetResponse(Application application);

    GetAllApplicationResponse applicationToGetAllResponse(Application application);

    CreatedApplicationResponse applicationToCreateResponse(Application application);

    UpdatedApplicationResponse applicationToUpdateResponse(Application application);

    // Applicant dönüşüm metodu
    @Mapping(target = "applicant", source = "applicantId")
    default Applicant mapApplicant(int applicantId) {
        Applicant applicant = new Applicant();
        applicant.setId(applicantId);
        return applicant;
    }

    @Mapping(target = "bootcamp",source = "bootcampId")
    default Bootcamp mapBootcamp(Application application) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setId(application.getId());
        return bootcamp;
    }
}
