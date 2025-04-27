package com.example.BootCampProject.service.abstracts;


import com.example.BootCampProject.service.dtos.requests.applicant.CreateApplicantRequests;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdateApplicantRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.CreateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;

import java.util.List;

public interface ApplicantService {
    CreateApplicantResponses add(CreateApplicantRequests requests);
    List<GetAllApplicantResponses> getAll();
    UpdateApplicantResponses update(UpdateApplicantRequests updateApplicantRequests);
    void delete(int id);
    GetApplicantResponses getByName(String name);
}
