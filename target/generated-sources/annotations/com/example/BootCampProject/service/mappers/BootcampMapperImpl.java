package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.core.BootcampState;
import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-06T22:11:27+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
)
public class BootcampMapperImpl implements BootcampMapper {

    @Override
    public Bootcamp createBootcampRequestToBootcamp(CreatedBootcampRequest request) {
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
    public GetBootcampResponse bootcampToGetBootcampResponse(Bootcamp bootcamp) {
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
}
