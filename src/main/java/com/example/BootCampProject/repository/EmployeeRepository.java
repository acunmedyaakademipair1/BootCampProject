package com.example.BootCampProject.repository;

import com.example.BootCampProject.entity.Applicant;
import com.example.BootCampProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByName(String name);
}
