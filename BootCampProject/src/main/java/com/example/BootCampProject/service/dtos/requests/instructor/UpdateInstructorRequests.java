package com.example.BootCampProject.service.dtos.requests.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInstructorRequests {
    private int id;
    private String   companyName;
}
