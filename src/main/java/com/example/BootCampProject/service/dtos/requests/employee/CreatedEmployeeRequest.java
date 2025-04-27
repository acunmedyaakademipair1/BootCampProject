package com.example.BootCampProject.service.dtos.requests.employee;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class CreatedEmployeeRequest {

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
