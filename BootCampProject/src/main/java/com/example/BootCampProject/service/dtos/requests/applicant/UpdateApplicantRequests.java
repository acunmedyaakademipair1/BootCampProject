package com.example.BootCampProject.service.dtos.requests.applicant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateApplicantRequests {
    private int id;
    private String   about;

}
