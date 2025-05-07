package com.example.BootCampProject.service.abstracts;

import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.requests.blacklist.UpdatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetAllBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.UpdatedBlacklistResponse;

import java.util.List;

public interface BlacklistService {
    GetBlacklistResponse getById(int id);
    List<GetAllBlacklistResponse> getAll();
    CreatedBlacklistResponse add(CreatedBlacklistRequest request);
    UpdatedBlacklistResponse update(UpdatedBlacklistRequest updatedBlacklistRequest);
    void delete(int id);

    CreatedBlacklistResponse create(CreatedBlacklistRequest request);
}

