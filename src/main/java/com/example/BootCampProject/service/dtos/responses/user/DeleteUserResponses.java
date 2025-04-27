package com.example.BootCampProject.service.dtos.responses.user;

public class DeleteUserResponses {
    private int id;

    public DeleteUserResponses(int id) {
        this.id = id;
    }

    public DeleteUserResponses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
