package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.service.abstracts.ApplicantService;
import com.example.BootCampProject.service.dtos.requests.applicant.CreateApplicantRequests;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdateApplicantRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.CreateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;

import java.util.List;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public CreateApplicantResponses add(CreateApplicantRequests requests) {
        return null;
    }

    @Override
    public List<GetAllApplicantResponses> getAll() {
        return null;
    }

    @Override
    public UpdateApplicantResponses update(UpdateApplicantRequests updateUserRequests) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public GetApplicantResponses getByName(String name) {
        return null;
    }
}
