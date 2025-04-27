package com.example.BootCampProject.service.dtos.requests.instructor;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class CreatedInstructorRequest {
    private String  companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
