package com.example.BootCampProject.service.abstracts;


import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.requests.application.UpdatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetAllApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.UpdatedApplicationResponse;

import java.util.List;

public interface ApplicationService {
    GetApplicationResponse getById(int id);
    List<GetAllApplicationResponse> getAll();
    CreatedApplicationResponse add(CreatedApplicationRequest  request);
    UpdatedApplicationResponse update(UpdatedApplicationRequest updatedApplicationRequest);
    void delete(int id);
}
