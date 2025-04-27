package com.example.BootCampProject.service.abstracts;



import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.employee.UpdatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.responses.employee.CreatedEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.UpdatedEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    CreatedEmployeeResponse add(CreatedEmployeeRequest requests);
    List<GetAllEmployeeResponse> getAll();
    UpdatedEmployeeResponse update(UpdatedEmployeeRequest updatedEmployeeRequests);
    void delete(int id);
    GetEmployeeResponse getByName(String name);
}

