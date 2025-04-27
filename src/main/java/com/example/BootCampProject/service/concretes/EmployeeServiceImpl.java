package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Employee;
import com.example.BootCampProject.repository.EmployeeRepository;
import com.example.BootCampProject.service.abstracts.EmployeeService;
import com.example.BootCampProject.service.dtos.requests.employee.CreateEmployeeRequests;
import com.example.BootCampProject.service.dtos.requests.employee.UpdateEmployeeRequests;
import com.example.BootCampProject.service.dtos.responses.applicant.UpdateApplicantResponses;
import com.example.BootCampProject.service.dtos.responses.employee.CreateEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponses;
import com.example.BootCampProject.service.dtos.responses.employee.UpdateEmployeeResponses;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public CreateEmployeeResponses add(CreateEmployeeRequests requests) {
        Employee employee = new Employee();
        employee.setId(requests.getId());
        employee.setPosition(requests.getPosition());
        Employee createEmployee = employeeRepository.save(employee);

        CreateEmployeeResponses responses = new CreateEmployeeResponses();
        responses.setId(createEmployee.getId());
        responses.setPosition(createEmployee.getPosition());
        return responses;
    }

    @Override
    public List<GetAllEmployeeResponses> getAll() {
        return employeeRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());

    }

    @Override
    public UpdateEmployeeResponses update(UpdateEmployeeRequests updateUserRequests) {

        Employee employee = employeeRepository.findById(updateUserRequests.getId()).orElseThrow(() ->new RuntimeException("Employee not found"));
        employee.setPosition(updateUserRequests.getPosition());
        Employee updateEmployee = employeeRepository.save(employee);

        UpdateEmployeeResponses responses = new UpdateEmployeeResponses();
        responses.setId(updateUserRequests.getId());
        responses.setPosition(updateUserRequests.getPosition());
        return responses;

    }


    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public GetEmployeeResponses getByName(String name) {

        return null;
    }

    private GetAllEmployeeResponses mapToResponse(Employee employee) {
        GetAllEmployeeResponses responses = new GetAllEmployeeResponses();
        responses.setId(employee.getId());
        responses.setPosition(employee.getPosition());
        return responses;

    }
    private GetEmployeeResponses mapToEmployeeResponse(Employee employee) {
        GetEmployeeResponses responses = new GetEmployeeResponses();
        responses.setId(employee.getId());
        responses.setPosition(employee.getPosition());
        return responses;

    }
}
