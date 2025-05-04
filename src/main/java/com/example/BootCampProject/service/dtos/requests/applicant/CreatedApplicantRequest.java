package com.example.BootCampProject.service.dtos.requests.applicant;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreatedApplicantRequest {

    private int id;

    private String about;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getAbout() {

        return about;
    }

    public void setAbout(String about) {

        this.about = about;
    }
}
