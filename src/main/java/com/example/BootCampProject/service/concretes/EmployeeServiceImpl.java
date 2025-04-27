package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.service.abstracts.EmployeeService;
import com.example.BootCampProject.service.dtos.requests.employee.CreateEmployeeRequests;
import com.example.BootCampProject.service.dtos.requests.employee.UpdateEmployeeRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.employee.CreateEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponses;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public CreateEmployeeResponses add(CreateEmployeeRequests requests) {
        return null;
    }

    @Override
    public List<GetAllEmployeeResponses> getAll() {
        return null;
    }

    @Override
    public UpdateApplicantResponses update(UpdateEmployeeRequests updateUserRequests) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public GetEmployeeResponses getByName(String name) {
        return null;
    }
}
