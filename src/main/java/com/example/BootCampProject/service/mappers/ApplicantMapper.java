package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.service.dtos.requests.applicant.CreatedApplicantRequest;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdatedApplicantRequest;
import com.example.BootCampProject.service.dtos.responses.applicant.CreatedApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdatedApplicantResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ApplicantMapper {
    @Mapping(target = "applications", source = "applications")
    @Mapping(target = "about", source = "about")
    @Mapping(target = "blacklist", source = "blacklist")
    Applicant createRequestToApplicant(CreatedApplicantRequest request);
    Applicant updateRequestToApplicant(UpdatedApplicantRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applications", source = "applications")
    @Mapping(target = "about", source = "about")
    @Mapping(target = "blacklist", source = "blacklist")
    GetApplicantResponse applicantToGetResponse(Applicant applicant);
    GetAllApplicantResponse applicantToGetAllResponse(Applicant applicant);
    CreatedApplicantResponse applicantToCreateResponse(Applicant applicant);
    UpdatedApplicantResponse applicantToUpdateResponse(Applicant applicant);
}
