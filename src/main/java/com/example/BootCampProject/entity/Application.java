package com.example.BootCampProject.entity;
import com.example.BootCampProject.core.ApplicationState;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicantId",nullable = false)
    private Applicant applicantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bootCampId")
    private Bootcamp bootcampId;


    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false)
    private ApplicationState applicationState;


    public Application() {
    }

    public Application(int id, Applicant applicantId, Bootcamp bootcampId, ApplicationState state) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Applicant getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Applicant applicantId) {
        this.applicantId = applicantId;
    }

    public Bootcamp getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(Bootcamp bootcampId) {
        this.bootcampId = bootcampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
