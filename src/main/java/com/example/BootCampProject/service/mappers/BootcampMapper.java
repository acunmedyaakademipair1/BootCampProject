package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.requests.bootcamp.UpdatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.CreatedBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetAllBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import com.example.BootCampProject.service.dtos.responses.bootcamp.UpdatedBootcampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BootcampMapper {
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", constant = "PREPARING")
    Bootcamp createRequestToBootcamp(CreatedBootcampRequest request);
    Bootcamp updateRequestToBootcamp(UpdatedBootcampRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", source = "bootcampState")
    GetBootcampResponse bootcampToGetResponse(Bootcamp bootcamp);
    GetAllBootcampResponse bootcampToGetAllResponse(Bootcamp bootcamp);
    CreatedBootcampResponse bootcampToCreateResponse(Bootcamp bootcamp);
    UpdatedBootcampResponse bootcampToUpdateResponse(Bootcamp bootcamp);
}
