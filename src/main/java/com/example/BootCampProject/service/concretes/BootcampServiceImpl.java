package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.repository.BootcampRepository;
import com.example.BootCampProject.service.abstracts.BootcampService;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.requests.bootcamp.UpdatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetAllBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.UpdatedBootcampResponse;
import com.example.BootCampProject.service.mappers.BootcampMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootcampServiceImpl implements BootcampService {
    private final BootcampRepository bootcampRepository;
    private final BootcampMapper bootcampMapper;

    public BootcampServiceImpl(BootcampRepository bootcampRepository, BootcampMapper bootcampMapper) {
        this.bootcampRepository = bootcampRepository;
        this.bootcampMapper = bootcampMapper;
    }

    @Override
    public GetBootcampResponse getById(int id) {
        Bootcamp bootcamp = bootcampRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bootcamp not found with id: " + id));
        return bootcampMapper.bootcampToGetResponse(bootcamp);
    }

    @Override
    public List<GetAllBootcampResponse> getAll() {
        List<Bootcamp> bootcamps = bootcampRepository.findAll();
        return bootcamps.stream()
                .map(bootcampMapper::bootcampToGetAllResponse)
                .toList();
    }

    @Override
    public CreatedBootcampResponse add(CreatedBootcampRequest request) {
        Bootcamp bootcamp = bootcampMapper.createRequestToBootcamp(request);
        bootcampRepository.save(bootcamp);
        return bootcampMapper.bootcampToCreateResponse(bootcamp);
    }

    @Override
    public UpdatedBootcampResponse update(UpdatedBootcampRequest updatedBootcampRequest) {
        Bootcamp bootcamp = bootcampMapper.updateRequestToBootcamp(updatedBootcampRequest);
        bootcampRepository.save(bootcamp);
        return bootcampMapper.bootcampToUpdateResponse(bootcamp);
    }

    @Override
    public void delete(int id) {
        Bootcamp bootcamp = bootcampRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bootcamp not found with id: " + id));
        bootcampRepository.delete(bootcamp);
    }

    @Override
    public CreatedBootcampResponse create(CreatedBootcampRequest request) {
        Bootcamp bootcamp= bootcampMapper.createRequestToBootcamp(request);
        bootcampRepository.save(bootcamp);
        return bootcampMapper.bootcampToCreateResponse(bootcamp);
    }
}
