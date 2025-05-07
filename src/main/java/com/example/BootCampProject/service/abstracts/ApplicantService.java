package com.example.BootCampProject.service.abstracts;


import com.example.BootCampProject.service.dtos.requests.applicant.CreatedApplicantRequest;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdatedApplicantRequest;
import com.example.BootCampProject.service.dtos.responses.applicant.CreatedApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdatedApplicantResponse;

import java.util.List;

public interface ApplicantService {
    CreatedApplicantResponse add(CreatedApplicantRequest requests);
    List<GetAllApplicantResponse> getAll();
    UpdatedApplicantResponse update(UpdatedApplicantRequest updatedApplicantRequests);
    void delete(String name);
    GetApplicantResponse getByName(String name);
}
