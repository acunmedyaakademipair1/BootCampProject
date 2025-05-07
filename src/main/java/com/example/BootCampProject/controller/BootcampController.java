package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.BootcampService;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.requests.bootcamp.UpdatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetAllBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.UpdatedBootcampResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bootcamps")
@RequiredArgsConstructor
public class BootcampController {

    private final BootcampService bootcampService;

    @PostMapping
    public CreatedBootcampResponse create(@RequestBody CreatedBootcampRequest request) {
        return bootcampService.create(request);
    }

    @GetMapping
    public List<GetAllBootcampResponse> getAll() {
        return bootcampService.getAll();
    }

    @GetMapping("/{id}")
    public GetBootcampResponse getById(@PathVariable int id) {
        return bootcampService.getById(id);
    }

    @PutMapping("/{id}")
    public UpdatedBootcampResponse update(@PathVariable int id, @RequestBody UpdatedBootcampRequest request) {
        request.setId(id);
        return bootcampService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        bootcampService.delete(id);
    }
}
