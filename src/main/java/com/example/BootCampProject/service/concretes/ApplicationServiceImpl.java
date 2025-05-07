package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.repository.ApplicationRepository;
import com.example.BootCampProject.service.abstracts.ApplicationService;
import com.example.BootCampProject.service.dtos.requests.application.CreatedApplicationRequest;
import com.example.BootCampProject.service.dtos.requests.application.UpdatedApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.CreatedApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetAllApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.dtos.responses.application.UpdatedApplicationResponse;
import com.example.BootCampProject.service.mappers.ApplicationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository, ApplicationMapper applicationMapper) {
        this.applicationRepository = applicationRepository;
        this.applicationMapper = applicationMapper;
    }

    @Override
    public CreatedApplicationResponse add(CreatedApplicationRequest request) {
        Application application = applicationMapper.createRequestToApplication(request);
        applicationRepository.save(application);
        return applicationMapper.applicationToCreateResponse(application);

    }

    @Override
    public List<GetAllApplicationResponse> getAll() {
        return List.of();
    }


    @Override
    public UpdatedApplicationResponse update(UpdatedApplicationRequest updatedApplicationRequest) {
        return null;
    }

    @Override
    public void delete(int id) {
    applicationRepository.deleteById(id);
    }

    @Override
    public GetApplicationResponse getById(int id) {
        return null;
    }


    }
