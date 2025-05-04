package com.example.BootCampProject.service.dtos.requests.bootcamp;

import com.example.BootCampProject.core.BootcampState;
import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.Instructor;

import java.util.Date;
import java.util.List;

public class UpdatedBootcampRequest {

    private int id;
    private String name;
    private Instructor instructorId;
    private Date startDate;
    private Date endDate;
    private BootcampState bootcampState;
    private List<Application> application;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Instructor instructorId) {
        this.instructorId = instructorId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BootcampState getBootcampState() {
        return bootcampState;
    }

    public void setBootcampState(BootcampState bootcampState) {
        this.bootcampState = bootcampState;
    }

    public List<Application> getApplication() {
        return application;
    }

    public void setApplication(List<Application> application) {
        this.application = application;
    }

    public UpdatedBootcampRequest() {
    }

    public UpdatedBootcampRequest(int id, String name, Instructor instructorId, Date startDate, Date endDate, BootcampState bootcampState, List<Application> application) {
        this.id = id;
        this.name = name;
        this.instructorId = instructorId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bootcampState = bootcampState;
        this.application = application;
    }
}
