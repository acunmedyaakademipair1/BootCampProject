package com.example.BootCampProject.service.dtos.responses.blacklist;

import com.example.BootCampProject.entity.Applicant;

import java.time.LocalDate;

public class GetAllBlacklistResponse {

    private int id;
    private String reason;
    private LocalDate date;
    private Applicant applicationId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Applicant getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Applicant applicationId) {
        this.applicationId = applicationId;
    }

    public GetAllBlacklistResponse() {
    }

    public GetAllBlacklistResponse(int id, String reason, LocalDate date, Applicant applicationId) {
        this.id = id;
        this.reason = reason;
        this.date = date;
        this.applicationId = applicationId;
    }
}
