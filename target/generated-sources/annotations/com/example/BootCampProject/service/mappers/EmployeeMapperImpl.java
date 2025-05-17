package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Employee;
import com.example.BootCampProject.service.dtos.requests.employee.CreatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.requests.employee.UpdatedEmployeeRequest;
import com.example.BootCampProject.service.dtos.responses.employee.CreatedEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetAllEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.GetEmployeeResponse;
import com.example.BootCampProject.service.dtos.responses.employee.UpdatedEmployeeResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T20:11:36+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee createRequestToEmployee(CreatedEmployeeRequest request) {
        if ( request == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setPosition( request.getPosition() );
        employee.setId( request.getId() );

        return employee;
    }

    @Override
    public Employee updateRequestToEmployee(UpdatedEmployeeRequest request) {
        if ( request == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( request.getId() );
        employee.setPosition( request.getPosition() );

        return employee;
    }

    @Override
    public GetEmployeeResponse employeeToGetResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse();

        getEmployeeResponse.setId( employee.getId() );
        getEmployeeResponse.setPosition( employee.getPosition() );

        return getEmployeeResponse;
    }

    @Override
    public GetAllEmployeeResponse employeeToGetAllResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        GetAllEmployeeResponse getAllEmployeeResponse = new GetAllEmployeeResponse();

        getAllEmployeeResponse.setPosition( employee.getPosition() );

        return getAllEmployeeResponse;
    }

    @Override
    public CreatedEmployeeResponse employeeToCreateResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        CreatedEmployeeResponse createdEmployeeResponse = new CreatedEmployeeResponse();

        createdEmployeeResponse.setPosition( employee.getPosition() );

        return createdEmployeeResponse;
    }

    @Override
    public UpdatedEmployeeResponse employeeToUpdateResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        UpdatedEmployeeResponse updatedEmployeeResponse = new UpdatedEmployeeResponse();

        updatedEmployeeResponse.setId( employee.getId() );
        updatedEmployeeResponse.setPosition( employee.getPosition() );

        return updatedEmployeeResponse;
    }
}
