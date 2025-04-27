package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.repository.ApplicantRepository;
import com.example.BootCampProject.service.abstracts.ApplicantService;
import com.example.BootCampProject.service.dtos.requests.applicant.CreateApplicantRequests;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdateApplicantRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.CreateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;

import java.util.List;
import java.util.stream.Collectors;

public class ApplicantServiceImpl implements ApplicantService {
    private ApplicantRepository applicantRepository;
    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public CreateApplicantResponses add(CreateApplicantRequests requests) {
        Applicant applicant = new Applicant();
        applicant.setAbout(requests.getAbout());
        Applicant createdApplicant = applicantRepository.save(applicant);

        CreateApplicantResponses responses = new CreateApplicantResponses();
        responses.setId(createdApplicant.getId());
        responses.setAbout(requests.getAbout());
        return responses;
        }

    @Override
    public List<GetAllApplicantResponses> getAll() {

        return applicantRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
                    }

    @Override
    public UpdateApplicantResponses update(UpdateApplicantRequests updateUserRequests) {

       Applicant applicant = applicantRepository.findById(updateUserRequests.getId()).orElseThrow(()-> new RuntimeException("Applicant Not Found"));
       applicant.setAbout(updateUserRequests.getAbout());
       applicantRepository.save(applicant);

       UpdateApplicantResponses responses = new UpdateApplicantResponses();
       responses.setId(applicant.getId());
       responses.setAbout(updateUserRequests.getAbout());
       return responses;


    }

    @Override
    public void delete(int id) {
        applicantRepository.deleteById(id);

    }

    @Override
    public GetApplicantResponses getByName(String name) {
        return null;
    }

    private GetApplicantResponses mapToResponse(Applicant applicant) {
        GetApplicantResponses responses = new GetApplicantResponses();
        responses.setId(applicant.getId());
        responses.setAbout(applicant.getAbout());
        return responses;
    }

    private GetApplicantResponses maptoAplicentResponse(Applicant applicant) {
        GetApplicantResponses responses = new GetApplicantResponses();
        responses.setId(applicant.getId());
        responses.setAbout(applicant.getAbout());
        return responses;
    }
}


