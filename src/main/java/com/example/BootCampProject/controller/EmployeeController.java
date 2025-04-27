package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.EmployeeService;
import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.employee.UpdatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.responses.employee.CreatedEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.UpdatedEmployeeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping ("/{getAllEmployees}")
    @ResponseStatus (HttpStatus.OK)
    public List<GetAllEmployeeResponse>  getAllEmployees(){
        return employeeService.getAll();
    }

    @PostMapping ("/{createEmployees}")
    @ResponseStatus (HttpStatus.OK)
    public CreatedEmployeeResponse add(@RequestBody CreatedEmployeeRequest requests){
        return employeeService.add(requests);
    }
    @PutMapping ("/{uptadeEmployees}")
    @ResponseStatus (HttpStatus.OK)
    public UpdatedEmployeeResponse update(@RequestBody UpdatedEmployeeRequest request){
        return employeeService.update(request);
    }
}
