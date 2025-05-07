package com.example.BootCampProject.service.concretes;

import com.example.BootCampProject.entity.Blacklist;
import com.example.BootCampProject.repository.BlacklistRepository;
import com.example.BootCampProject.service.abstracts.BlacklistService;
import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.requests.blacklist.UpdatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetAllBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.UpdatedBlacklistResponse;
import com.example.BootCampProject.service.mappers.BlacklistMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistServiceImpl implements BlacklistService {
    private final BlacklistRepository blacklistRepository;
    private final BlacklistMapper blacklistMapper;

    public BlacklistServiceImpl(BlacklistRepository blacklistRepository, BlacklistMapper blacklistMapper) {
        this.blacklistRepository = blacklistRepository;
        this.blacklistMapper = blacklistMapper;
    }

    @Override
    public GetBlacklistResponse getById(int id) {
        Blacklist blacklist = blacklistRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blacklist not found with id: " + id));
        return blacklistMapper.blacklistToGetResponse(blacklist);
    }

    @Override
    public List<GetAllBlacklistResponse> getAll() {
        List<Blacklist> blacklists = blacklistRepository.findAll();
        return blacklists.stream()
                .map(blacklistMapper::blacklistToGetAllResponse)
                .toList();
    }

    @Override
    public CreatedBlacklistResponse add(CreatedBlacklistRequest request) {
        Blacklist blacklist = blacklistMapper.createRequestToBlacklist(request);
        blacklistRepository.save(blacklist);
        return blacklistMapper.blacklistToCreateResponse(blacklist);
    }


    @Override
    public UpdatedBlacklistResponse update(UpdatedBlacklistRequest updatedBlacklistRequest) {
        Blacklist blacklist = blacklistMapper.updateRequestToBlacklist(updatedBlacklistRequest);
        blacklistRepository.save(blacklist);
        return blacklistMapper.blacklistToUpdateResponse(blacklist);
    }

    @Override
    public void delete(int id) {
    Blacklist blacklist = blacklistRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Blacklist not found with id: " + id));
        blacklistRepository.delete(blacklist);
    }

    @Override
    public CreatedBlacklistResponse create(CreatedBlacklistRequest request) {
        Blacklist blacklist = blacklistMapper.createRequestToBlacklist(request);
        blacklistRepository.save(blacklist);
        return blacklistMapper.blacklistToCreateResponse(blacklist);
    }
}
