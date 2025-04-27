package com.example.BootCampProject.controller;


import com.example.BootCampProject.service.abstracts.InstructorService;
import com.example.BootCampProject.service.dtos.requests.instructor.CreatedInstructorRequest;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdatedInstructorRequest;
import com.example.BootCampProject.service.dtos.responses.instructor.CreatedInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponse;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdatedInstructorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ınstructors")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/{getAllInstructors}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllInstructorResponse> getInstructors() {

        return instructorService.getAll();
    }

    @PostMapping("/{createInstructors}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedInstructorResponse add(@RequestBody CreatedInstructorRequest requests) {
        return instructorService.add(requests);}

    @PutMapping("/{uptadeInstructors}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedInstructorResponse update(@RequestBody UpdatedInstructorRequest request) {
        return instructorService.update(request);}


}
