package com.example.BootCampProject.service.dtos.requests.bootcamp;

public class DeletedBootcampRequest {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedBootcampRequest() {
    }

    public DeletedBootcampRequest(int id) {
        this.id = id;
    }
}
