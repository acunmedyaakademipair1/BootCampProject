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
    @JoinColumn(name = "applicantId", nullable = false)
    private Applicant applicantId;

    @ManyToOne
    @JoinColumn(name = "bootcamp_id")
    private Bootcamp bootcamp;


    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false)
    private ApplicationState applicationState;

    public Application() {
    }

    public Application(int id, Applicant applicantId, Bootcamp bootcamp, ApplicationState applicationState) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootcamp = bootcamp;
        this.applicationState = applicationState;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

    public Applicant getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Applicant applicantId) {
        this.applicantId = applicantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

