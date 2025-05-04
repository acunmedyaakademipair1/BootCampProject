package com.example.BootCampProject.service.dtos.requests.employee;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class CreatedEmployeeRequest {
    private int id;

    private String position;
    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
