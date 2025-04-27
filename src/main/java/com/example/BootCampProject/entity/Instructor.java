package com.example.BootCampProject.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ınstructors")

public class Instructor extends User{



    @Column(name = "companyname")
    private String companyName;

    public Instructor() {}

    public Instructor(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
