package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Blacklist;
import com.example.BootCampProject.service.dtos.requests.blacklist.CreatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.requests.blacklist.UpdatedBlacklistRequest;
import com.example.BootCampProject.service.dtos.responses.blacklist.CreatedBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetAllBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.GetBlacklistResponse;
import com.example.BootCampProject.service.dtos.responses.blacklist.UpdatedBlacklistResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T09:20:21+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
public class BlacklistMapperImpl implements BlacklistMapper {

    @Override
    public Blacklist createRequestToBlacklist(CreatedBlacklistRequest request) {
        if ( request == null ) {
            return null;
        }

        Blacklist blacklist = new Blacklist();

        blacklist.setApplicationId( request.getApplicationId() );
        blacklist.setReason( request.getReason() );
        blacklist.setDate( request.getDate() );
        blacklist.setId( request.getId() );

        return blacklist;
    }

    @Override
    public Blacklist updateRequestToBlacklist(UpdatedBlacklistRequest request) {
        if ( request == null ) {
            return null;
        }

        Blacklist blacklist = new Blacklist();

        blacklist.setId( request.getId() );
        blacklist.setReason( request.getReason() );
        blacklist.setDate( request.getDate() );
        blacklist.setApplicationId( request.getApplicationId() );

        return blacklist;
    }

    @Override
    public GetBlacklistResponse blacklistToGetResponse(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        GetBlacklistResponse getBlacklistResponse = new GetBlacklistResponse();

        getBlacklistResponse.setId( blacklist.getId() );
        getBlacklistResponse.setApplicationId( blacklist.getApplicationId() );
        getBlacklistResponse.setReason( blacklist.getReason() );
        getBlacklistResponse.setDate( blacklist.getDate() );

        return getBlacklistResponse;
    }

    @Override
    public GetAllBlacklistResponse blacklistToGetAllResponse(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        GetAllBlacklistResponse getAllBlacklistResponse = new GetAllBlacklistResponse();

        getAllBlacklistResponse.setId( blacklist.getId() );
        getAllBlacklistResponse.setReason( blacklist.getReason() );
        getAllBlacklistResponse.setDate( blacklist.getDate() );
        getAllBlacklistResponse.setApplicationId( blacklist.getApplicationId() );

        return getAllBlacklistResponse;
    }

    @Override
    public CreatedBlacklistResponse blacklistToCreateResponse(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        CreatedBlacklistResponse createdBlacklistResponse = new CreatedBlacklistResponse();

        createdBlacklistResponse.setId( blacklist.getId() );
        createdBlacklistResponse.setReason( blacklist.getReason() );
        createdBlacklistResponse.setDate( blacklist.getDate() );
        createdBlacklistResponse.setApplicationId( blacklist.getApplicationId() );

        return createdBlacklistResponse;
    }

    @Override
    public UpdatedBlacklistResponse blacklistToUpdateResponse(Blacklist blacklist) {
        if ( blacklist == null ) {
            return null;
        }

        UpdatedBlacklistResponse updatedBlacklistResponse = new UpdatedBlacklistResponse();

        updatedBlacklistResponse.setId( blacklist.getId() );
        updatedBlacklistResponse.setReason( blacklist.getReason() );
        updatedBlacklistResponse.setDate( blacklist.getDate() );
        updatedBlacklistResponse.setApplicationId( blacklist.getApplicationId() );

        return updatedBlacklistResponse;
    }
}
