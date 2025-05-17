package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.core.BootcampState;
import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.requests.bootcamp.UpdatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetAllBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.UpdatedBootcampResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T20:11:36+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
public class BootcampMapperImpl implements BootcampMapper {

    @Override
    public Bootcamp createRequestToBootcamp(CreatedBootcampRequest request) {
        if ( request == null ) {
            return null;
        }

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName( request.getName() );
        bootcamp.setInstructorId( request.getInstructorId() );
        bootcamp.setStartDate( request.getStartDate() );
        bootcamp.setEndDate( request.getEndDate() );
        bootcamp.setId( request.getId() );
        List<Application> list = request.getApplication();
        if ( list != null ) {
            bootcamp.setApplication( new ArrayList<Application>( list ) );
        }

        bootcamp.setBootcampState( BootcampState.PREPARING );

        return bootcamp;
    }

    @Override
    public Bootcamp updateRequestToBootcamp(UpdatedBootcampRequest request) {
        if ( request == null ) {
            return null;
        }

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setId( request.getId() );
        bootcamp.setName( request.getName() );
        bootcamp.setInstructorId( request.getInstructorId() );
        bootcamp.setStartDate( request.getStartDate() );
        bootcamp.setEndDate( request.getEndDate() );
        bootcamp.setBootcampState( request.getBootcampState() );
        List<Application> list = request.getApplication();
        if ( list != null ) {
            bootcamp.setApplication( new ArrayList<Application>( list ) );
        }

        return bootcamp;
    }

    @Override
    public GetBootcampResponse bootcampToGetResponse(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        GetBootcampResponse getBootcampResponse = new GetBootcampResponse();

        getBootcampResponse.setId( bootcamp.getId() );
        getBootcampResponse.setName( bootcamp.getName() );
        getBootcampResponse.setInstructorId( bootcamp.getInstructorId() );
        getBootcampResponse.setStartDate( bootcamp.getStartDate() );
        getBootcampResponse.setEndDate( bootcamp.getEndDate() );
        getBootcampResponse.setBootcampState( bootcamp.getBootcampState() );
        List<Application> list = bootcamp.getApplication();
        if ( list != null ) {
            getBootcampResponse.setApplication( new ArrayList<Application>( list ) );
        }

        return getBootcampResponse;
    }

    @Override
    public GetAllBootcampResponse bootcampToGetAllResponse(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        GetAllBootcampResponse getAllBootcampResponse = new GetAllBootcampResponse();

        getAllBootcampResponse.setId( bootcamp.getId() );
        getAllBootcampResponse.setName( bootcamp.getName() );
        getAllBootcampResponse.setInstructorId( bootcamp.getInstructorId() );
        getAllBootcampResponse.setStartDate( bootcamp.getStartDate() );
        getAllBootcampResponse.setEndDate( bootcamp.getEndDate() );
        getAllBootcampResponse.setBootcampState( bootcamp.getBootcampState() );
        List<Application> list = bootcamp.getApplication();
        if ( list != null ) {
            getAllBootcampResponse.setApplication( new ArrayList<Application>( list ) );
        }

        return getAllBootcampResponse;
    }

    @Override
    public CreatedBootcampResponse bootcampToCreateResponse(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        CreatedBootcampResponse createdBootcampResponse = new CreatedBootcampResponse();

        createdBootcampResponse.setId( bootcamp.getId() );
        createdBootcampResponse.setName( bootcamp.getName() );
        createdBootcampResponse.setInstructorId( bootcamp.getInstructorId() );
        createdBootcampResponse.setStartDate( bootcamp.getStartDate() );
        createdBootcampResponse.setEndDate( bootcamp.getEndDate() );
        createdBootcampResponse.setBootcampState( bootcamp.getBootcampState() );
        List<Application> list = bootcamp.getApplication();
        if ( list != null ) {
            createdBootcampResponse.setApplication( new ArrayList<Application>( list ) );
        }

        return createdBootcampResponse;
    }

    @Override
    public UpdatedBootcampResponse bootcampToUpdateResponse(Bootcamp bootcamp) {
        if ( bootcamp == null ) {
            return null;
        }

        UpdatedBootcampResponse updatedBootcampResponse = new UpdatedBootcampResponse();

        updatedBootcampResponse.setId( bootcamp.getId() );
        updatedBootcampResponse.setName( bootcamp.getName() );
        updatedBootcampResponse.setInstructorId( bootcamp.getInstructorId() );
        updatedBootcampResponse.setStartDate( bootcamp.getStartDate() );
        updatedBootcampResponse.setEndDate( bootcamp.getEndDate() );
        updatedBootcampResponse.setBootcampState( bootcamp.getBootcampState() );
        List<Application> list = bootcamp.getApplication();
        if ( list != null ) {
            updatedBootcampResponse.setApplication( new ArrayList<Application>( list ) );
        }

        return updatedBootcampResponse;
    }
}
