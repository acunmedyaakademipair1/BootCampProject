package com.example.BootCampProject.service.dtos.responses.application;

import com.example.BootCampProject.core.ApplicationState;
import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.entity.Bootcamp;

public class GetApplicationResponse {
    private int id;
    private Applicant applicantId;
    private Bootcamp bootcampId;
    private ApplicationState applicationState;

    public Bootcamp getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(Bootcamp bootcampId) {
        this.bootcampId = bootcampId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Applicant getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Applicant applicantId) {
        this.applicantId = applicantId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}