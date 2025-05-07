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
    public GetApplicationResponse getById(int id) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
        return applicationMapper.applicationToGetResponse(application);
    }

    @Override
    public List<GetAllApplicationResponse> getAll() {
        List<Application> applications = applicationRepository.findAll();
        return applications.stream()
                .map(applicationMapper::applicationToGetAllResponse)
                .toList();
    }

    @Override
    public CreatedApplicationResponse add(CreatedApplicationRequest request) {
        Application application = applicationMapper.createRequestToApplication(request);
        applicationRepository.save(application);
        return applicationMapper.applicationToCreateResponse(application);
    }


    @Override
    public UpdatedApplicationResponse update(UpdatedApplicationRequest updatedApplicationRequest) {
        Application application = applicationMapper.updateRequestToApplication(updatedApplicationRequest);
        applicationRepository.save(application);
        return applicationMapper.applicationToUpdateResponse(application);
    }

    @Override
    public void delete(int id) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
        applicationRepository.delete(application);
    }
}
