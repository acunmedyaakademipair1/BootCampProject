package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.ApplicationService;
import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.requests.application.UpdatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetAllApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.UpdatedApplicationResponse;

import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/applications")
    public class ApplicationController {
        private final ApplicationService applicationService;

        public ApplicationController(ApplicationService applicationService) {
            this.applicationService = applicationService;
        }

        @PostMapping
        public CreatedApplicationResponse add(@RequestBody CreatedApplicationRequest request) {
            return applicationService.add(request);
        }

        @PutMapping
        public UpdatedApplicationResponse update(@RequestBody UpdatedApplicationRequest request) {
            return applicationService.update(request);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable int id) {
            applicationService.delete(id);
        }

        @GetMapping
        public List<GetAllApplicationResponse> getAll() {
            return applicationService.getAll();
        }

        @GetMapping("/{id}")
        public GetApplicationResponse getById(@PathVariable int id) {
            return applicationService.getById(id);
        }
    }


