package com.example.BootCampProject.service.dtos.requests.instructor;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class CreatedInstructorRequest {
    private int id;
    private String  companyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
