package com.example.BootCampProject.service.dtos.responses.blacklist;

public class DeletedBlacklistResponse {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedBlacklistResponse() {
    }

    public DeletedBlacklistResponse(int id) {
        this.id = id;
    }
}
