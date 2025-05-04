package com.example.BootCampProject.service.dtos.requests.application;

import com.example.BootCampProject.core.ApplicationState;


public class CreatedApplicationRequest {
    private int applicantId;
    private int bootcampId;
    private ApplicationState applicationState;

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    public CreatedApplicationRequest() {
    }

    public CreatedApplicationRequest(int applicantId, int bootcampId, ApplicationState applicationState) {
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = applicationState;
    }
}