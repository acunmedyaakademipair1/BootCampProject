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
import com.example.BootCampProject.service.mappers.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {

        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public CreatedEmployeeResponse add(CreatedEmployeeRequest request) {
        Employee employee = employeeMapper.createRequestToEmployee(request);
        employeeRepository.save(employee);
        return employeeMapper.employeeToCreateResponse(employee);
    }

    @Override
    public List<GetAllEmployeeResponse> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(employeeMapper::employeeToGetAllResponse)
                .toList();
    }

    @Override
    public UpdatedEmployeeResponse update(UpdatedEmployeeRequest updatedEmployeeRequest) {

        Employee employee = employeeMapper.updateRequestToEmployee(updatedEmployeeRequest);
        employeeRepository.save(employee);
        return employeeMapper.employeeToUpdateResponse(employee);
    }


    @Override
    public void delete(int id) {
        Employee employee = employeeRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        employeeRepository.delete(employee);

    }

    @Override
    public GetEmployeeResponse getByName(String name) {
        Employee employee = employeeRepository.findByPosition(name)
                .orElseThrow(() -> new RuntimeException("Employee not found with name: " + name));
        return employeeMapper.employeeToGetResponse(employee);
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
