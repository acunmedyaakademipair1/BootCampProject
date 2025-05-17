package com.example.BootCampProject.repository;

import com.example.BootCampProject.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
    Optional<Applicant> findByAbout(String name);
    Optional<Applicant>CheckIfNationalIdExists(int nationalIdentity);
    Optional<Applicant>CheckIfBlacklisted(int applicantId);
    Optional<Applicant>CheckIfApplicantExists(int applicantId);

    Object IsBlacklisted(int applicantId);

    Object GetByNationalId(int nationalIdentity);

    Object GetById(int applicantId);
}
