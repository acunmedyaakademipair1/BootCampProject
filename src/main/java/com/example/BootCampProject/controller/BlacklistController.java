package com.example.BootCampProject.controller;

import com.example.BootCampProject.service.abstracts.BlacklistService;
import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.requests.blacklist.UpdatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetAllBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.UpdatedBlacklistResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blacklists")
@RequiredArgsConstructor
public class BlacklistController {

    private final BlacklistService blacklistService;


    @Autowired  // Constructor injection
    public BlacklistController(BlacklistService blacklistService) {
        this.blacklistService = blacklistService;
    }

    @PostMapping
    public CreatedBlacklistResponse create(@RequestBody CreatedBlacklistRequest request) {
        return blacklistService.create(request);
    }

    @GetMapping
    public List<GetAllBlacklistResponse> getAll() {
        return blacklistService.getAll();
    }

    @GetMapping("/{id}")
    public GetBlacklistResponse getById(@PathVariable int id) {
        return blacklistService.getById(id);
    }

    @PutMapping("/{id}")
    public UpdatedBlacklistResponse update(@PathVariable int id, @RequestBody UpdatedBlacklistRequest request) {
        request.setId(id);
        return blacklistService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        blacklistService.delete(id);
    }
}

