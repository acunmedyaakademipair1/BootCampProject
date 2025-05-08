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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final ApplicantMapper applicantMapper;


    @Autowired
    public ApplicantServiceImpl(ApplicantRepository applicantRepository, ApplicantMapper applicantMapper) {
        this.applicantRepository = applicantRepository;
        this.applicantMapper = applicantMapper;
    }

    @Override
    public GetApplicantResponse getByName(String name) {
        Applicant applicant = applicantRepository.findByAbout(name)
                .orElseThrow(() -> new RuntimeException("Applicant not found with name: " + name));
        return applicantMapper.applicantToGetResponse(applicant);
    }

    @Override
    public List<GetAllApplicantResponse> getAll() {
        List<Applicant> applicants = applicantRepository.findAll();
        return applicants.stream()
                .map(applicantMapper::applicantToGetAllResponse)
                .toList();
    }

    @Override
    public CreatedApplicantResponse add(CreatedApplicantRequest requests) {
        Applicant applicant = applicantMapper.createRequestToApplicant(requests);
        applicantRepository.save(applicant);
        return applicantMapper.applicantToCreateResponse(applicant);
    }

    @Override
    public UpdatedApplicantResponse update(UpdatedApplicantRequest updatedApplicantRequest) {
        Applicant applicant = applicantMapper.updateRequestToApplicant(updatedApplicantRequest);
        applicantRepository.save(applicant);
        return applicantMapper.applicantToUpdateResponse(applicant);
    }

    @Override
    public void delete(String name) {
        Applicant applicant = applicantRepository.findByAbout(name)
                .orElseThrow(() -> new RuntimeException("Applicant not found with name: " + name));
        applicantRepository.delete(applicant);
    }
}
