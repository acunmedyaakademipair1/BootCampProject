package com.example.BootCampProject.service.abstracts;



import com.example.BootCampProject.service.dtos.requests.employee.CreateEmployeeRequests;
import com.example.BootCampProject.service.dtos.requests.employee.UpdateEmployeeRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.employee.CreateEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.UpdateEmployeeResponses;

import java.util.List;

public interface EmployeeService {
    CreateEmployeeResponses add(CreateEmployeeRequests requests);
    List<GetAllEmployeeResponses> getAll();
    UpdateEmployeeResponses update(UpdateEmployeeRequests updateEmployeeRequests);
    void delete(int id);
    GetEmployeeResponses getByName(String name);
}

