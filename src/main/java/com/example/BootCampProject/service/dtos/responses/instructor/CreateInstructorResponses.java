package com.example.BootCampProject.service.dtos.responses.instructor;

public class CreateInstructorResponses {
    private int id;
    private String companyName;

    public CreateInstructorResponses(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public CreateInstructorResponses() {
    }

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
}
