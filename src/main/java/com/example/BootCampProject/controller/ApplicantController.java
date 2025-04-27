package com.example.BootCampProject.controller;

import com.example.BootCampProject.repository.InstructorRepository;
import com.example.BootCampProject.service.abstracts.ApplicantService;
import com.example.BootCampProject.service.abstracts.UserService;
import com.example.BootCampProject.service.dtos.requests.applicant.CreatedApplicantRequest;
import com.example.BootCampProject.service.dtos.requests.applicant.UpdatedApplicantRequest;
import com.example.BootCampProject.service.dtos.responses.applicant.CreatedApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetAllApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.GetApplicantResponse;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdatedApplicantResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")

public class ApplicantController {
    private final ApplicantService applicantService;
    private final UserService userService;

    public ApplicantController(ApplicantService applicantService, UserService userService)
    {
        this.applicantService = applicantService;
        this.userService = userService;
    }

    @GetMapping ("/{getAllApplicants}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllApplicantResponse> getApplicants(){
        return applicantService.getAll();
    }

    @PostMapping("/{createApplicants}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedApplicantResponse add(@RequestBody CreatedApplicantRequest requests){
        return applicantService.add(requests);
    }
    @PutMapping("/{uptadeApplicants}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedApplicantResponse update(UpdatedApplicantRequest requests){
        return applicantService.update(requests);
    }

}
