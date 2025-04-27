package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Employee;
import com.example.BootCampProject.repository.EmployeeRepository;
import com.example.BootCampProject.service.abstracts.EmployeeService;
import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.employee.UpdatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.responses.employee.CreatedEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.UpdatedEmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public CreatedEmployeeResponse add(CreatedEmployeeRequest requests) {
        Employee employee = new Employee();
        employee.setPosition(requests.getPosition());
        Employee createEmployee = employeeRepository.save(employee);

        CreatedEmployeeResponse responses = new CreatedEmployeeResponse();
        responses.setPosition(createEmployee.getPosition());
        return responses;
    }

    @Override
    public List<GetAllEmployeeResponse> getAll() {
        return employeeRepository.findAll().stream()
                .map(this::mapToResponse).collect(Collectors.toList());

    }

    @Override
    public UpdatedEmployeeResponse update(UpdatedEmployeeRequest requests) {
        Employee employee = new Employee();
        employee.setPosition(requests.getPosition());
        Employee updateEmployee = employeeRepository.save(employee);
        UpdatedEmployeeResponse responses = new UpdatedEmployeeResponse();
        responses.setPosition(updateEmployee.getPosition());
        return responses;
    }


    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public GetEmployeeResponse getByName(String name) {

        return null;
    }

    private GetAllEmployeeResponse mapToResponse(Employee employee) {
        GetAllEmployeeResponse responses = new GetAllEmployeeResponse();
        responses.setPosition(employee.getPosition());
        return responses;

    }
    private GetEmployeeResponse mapToEmployeeResponse(Employee employee) {
        GetEmployeeResponse responses = new GetEmployeeResponse();
        responses.setPosition(employee.getPosition());
        return responses;

    }
}
