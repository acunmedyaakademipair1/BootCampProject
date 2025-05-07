package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Blacklist;
import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.requests.blacklist.UpdatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetAllBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.UpdatedBlacklistResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BlacklistMapper {

    @Mapping(target = "applicationId", source = "applicationId")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    Blacklist createRequestToBlacklist(CreatedBlacklistRequest request);
    Blacklist updateRequestToBlacklist(UpdatedBlacklistRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "applicationId", source = "applicationId")
    @Mapping(target = "reason", source = "reason")
    @Mapping(target = "date", source = "date")
    GetBlacklistResponse blacklistToGetResponse(Blacklist blacklist);
    GetAllBlacklistResponse blacklistToGetAllResponse(Blacklist blacklist);
    CreatedBlacklistResponse blacklistToCreateResponse(Blacklist blacklist);
    UpdatedBlacklistResponse blacklistToUpdateResponse(Blacklist blacklist);
}
