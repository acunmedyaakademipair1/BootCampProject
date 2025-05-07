package com.example.BootCampProject.service.dtos.responses.instructor;

import com.example.BootCampProject.entity.Instructor;

import java.util.List;

public class GetInstructorResponse {
    private int id;
    private String  companyName;
    private List<Instructor> instructors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public GetInstructorResponse() {
    }

    public GetInstructorResponse(int id, String companyName, List<Instructor> instructors) {
        this.id = id;
        this.companyName = companyName;
        this.instructors = instructors;
    }
}
