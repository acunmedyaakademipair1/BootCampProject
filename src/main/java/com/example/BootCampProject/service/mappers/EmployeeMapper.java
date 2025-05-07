package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Employee;
import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.employee.UpdatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.responses.employee.CreatedEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.UpdatedEmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {
    @Mapping(target = "position", source = "position")
    Employee createRequestToEmployee(CreatedEmployeeRequest request);
    Employee updateRequestToEmployee(UpdatedEmployeeRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "position", source = "position")
    GetEmployeeResponse employeeToGetResponse(Employee employee);
    GetAllEmployeeResponse employeeToGetAllResponse(Employee employee);
    CreatedEmployeeResponse employeeToCreateResponse(Employee employee);
    UpdatedEmployeeResponse employeeToUpdateResponse(Employee employee);
}
