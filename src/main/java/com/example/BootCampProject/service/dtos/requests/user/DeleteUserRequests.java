package com.example.BootCampProject.service.dtos.requests.user;

public class DeleteUserRequests {
    private int id;

    public DeleteUserRequests(int id ) {
        this.id = id;

    }
    public DeleteUserRequests(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
