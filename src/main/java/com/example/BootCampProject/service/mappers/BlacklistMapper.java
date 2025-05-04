package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Blacklist;
import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BlacklistMapper {

    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    Blacklist createBlacklistRequestToBlacklist(CreatedBlacklistRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicantId", source = "applicantId")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    GetBlacklistResponse blacklistToGetBlacklistResponse(Blacklist blacklist);
}
