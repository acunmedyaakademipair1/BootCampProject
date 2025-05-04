package com.example.BootCampProject.service.dtos.requests.blacklist;

public class DeletedBlacklistRequest {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeletedBlacklistRequest() {
    }

    public DeletedBlacklistRequest(int id) {
        this.id = id;
    }
}
