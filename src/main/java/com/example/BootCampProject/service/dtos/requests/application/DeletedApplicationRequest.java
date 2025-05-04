package com.example.BootCampProject.service.dtos.requests.application;


public class DeletedApplicationRequest {

    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedApplicationRequest(int id) {
        this.id = id;
    }

    public DeletedApplicationRequest() {
    }
}
