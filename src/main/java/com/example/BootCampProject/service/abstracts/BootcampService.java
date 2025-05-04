package com.example.BootCampProject.service.abstracts;

import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.requests.bootcamp.UpdatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetAllBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.UpdatedBootcampResponse;

import java.util.List;

public interface BootcampService {
    GetBootcampResponse getById(int id);
    List<GetAllBootcampResponse> getAll();
    CreatedBootcampResponse add(CreatedBootcampRequest request);
    UpdatedBootcampResponse update(UpdatedBootcampRequest updatedBootcampRequest);
    void delete(int id);
}