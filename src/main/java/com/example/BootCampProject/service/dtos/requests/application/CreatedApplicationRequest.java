package com.example.BootCampProject.service.dtos.requests.application;

import com.example.BootCampProject.core.ApplicationState;
import com.fasterxml.jackson.core.PrettyPrinter;


public class CreatedApplicationRequest {
    private int  applicantId;
    private int bootcampId;
    private ApplicationState applicationState;


}