package com.example.BootCampProject.repository;


import com.example.BootCampProject.core.BootcampState;
import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BootcampRepository extends JpaRepository<Bootcamp, Integer > {
    List<Bootcamp> findByBootCampName(String name);
    List<Bootcamp> findByInstructorId(int instructorId);
    List<Bootcamp> findByBootCampState(BootcampState bootcampState);

}
