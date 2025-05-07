package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.repository.ApplicantRepository;
import com.example.BootCampProject.service.abstracts.ApplicantService;
import com.example.BootCampProject.service.dtos.requests.applicant.CreatedApplicantRequest;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdatedApplicantRequest;
import com.example.BootCampProject.service.dtos.responses.applicant.CreatedApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdatedApplicantResponse;
import com.example.BootCampProject.service.mappers.ApplicantMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final ApplicantMapper applicantMapper;

    public ApplicantServiceImpl(ApplicantRepository applicantRepository, ApplicantMapper applicantMapper) {
        this.applicantRepository = applicantRepository;
        this.applicantMapper = applicantMapper;
    }

    @Override
    public CreatedApplicantResponse add(CreatedApplicantRequest requests) {
        Applicant applicant = new Applicant();
        applicant.setAbout(requests.getAbout());
        Applicant createdApplicant = applicantRepository.save(applicant);

        CreatedApplicantResponse responses = new CreatedApplicantResponse();
        responses.setAbout(requests.getAbout());
        return responses;
    }


    @Override
    public List<GetAllApplicantResponse> getAll() {

        return applicantRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());
        }

    @Override
    public UpdatedApplicantResponse update(UpdatedApplicantRequest requests) {

      Applicant applicant = new Applicant();
      applicant.setAbout(requests.getAbout());
       Applicant updateApplicant = applicantRepository.save(applicant);

       UpdatedApplicantResponse responses = new UpdatedApplicantResponse();

       responses.setAbout(requests.getAbout());
       return responses;


    }


    @Override
    public void delete(int id) {
        applicantRepository.deleteById(id);

    }

    @Override
    public GetApplicantResponse getByName(String name) {
        return null;
    }

    private GetAllApplicantResponse mapToResponse(Applicant applicant) {
        GetAllApplicantResponse responses = new GetAllApplicantResponse();

        responses.setAbout(applicant.getAbout());
        return responses;
    }

    private GetApplicantResponse mapToApplicantResponse(Applicant applicant) {
        GetApplicantResponse responses = new GetApplicantResponse();

        responses.setAbout(applicant.getAbout());
        return responses;
    }
}


