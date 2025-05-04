package com.example.BootCampProject.service.dtos.responses.bootcamp;

public class DeletedBootcampResponse {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedBootcampResponse() {
    }

    public DeletedBootcampResponse(int id) {
        this.id = id;
    }
}
