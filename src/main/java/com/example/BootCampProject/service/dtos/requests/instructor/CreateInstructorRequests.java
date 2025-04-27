package com.example.BootCampProject.service.dtos.requests.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInstructorRequests {
    private int id;
    private int  companyName;
}
