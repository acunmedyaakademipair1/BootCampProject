package com.example.BootCampProject.service.dtos.responses.instructor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInstructorResponses {
    private int id;
    private String companyName;

}