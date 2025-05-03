package com.example.BootCampProject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "applicants")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany
    private List<Application> applications;

    @Column(name = "about")
    private String about;

    @OneToMany
    private List<Blacklist> blacklist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Blacklist> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<Blacklist> blacklist) {
        this.blacklist = blacklist;
    }

    public Applicant() {
    }

    public Applicant(int id, List<Application> applications, String about, List<Blacklist> blacklist) {
        this.id = id;
        this.applications = applications;
        this.about = about;
        this.blacklist = blacklist;
    }
}
