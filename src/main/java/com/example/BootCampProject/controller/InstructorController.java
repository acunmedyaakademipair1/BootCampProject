package com.example.BootCampProject.controller;


import com.example.BootCampProject.service.abstracts.InstructorService;
import com.example.BootCampProject.service.dtos.requests.instructor.CreateInstructorRequests;
import com.example.BootCampProject.service.dtos.requests.instructor.UpdateInstructorRequests;
import com.example.BootCampProject.service.dtos.responses.instructor.CreateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.GetAllInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.instructor.UpdateInstructorResponses;
import com.example.BootCampProject.service.dtos.responses.user.GetAllUserResponses;
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
    public List<GetAllInstructorResponses> getInstructors() {
        return instructorService.getAll();
    }

    @PostMapping("/{createInstructors}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateInstructorResponses add(@RequestBody CreateInstructorRequests requests) {return instructorService.add(requests);}

    @PutMapping("/{uptadeInstructors}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateInstructorResponses update(@RequestBody UpdateInstructorRequests request) {return instructorService.update(request);}
    @DeleteMapping(("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id){
        instructorService.delete(id);
    }
}
