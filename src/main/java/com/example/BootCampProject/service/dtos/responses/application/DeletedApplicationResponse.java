package com.example.BootCampProject.service.dtos.responses.application;

public class DeletedApplicationResponse {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedApplicationResponse() {
    }

    public DeletedApplicationResponse(int id) {
        this.id = id;
    }
}
