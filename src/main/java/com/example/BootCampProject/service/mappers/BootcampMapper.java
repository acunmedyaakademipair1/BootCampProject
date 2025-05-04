package com.example.BootCampProject.service.mappers;

import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.service.dtos.requests.bootcamp.CreatedBootcampRequest;
import com.example.BootCampProject.service.dtos.responses.bootcamp.GetBootcampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BootcampMapper {
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", constant = "PREPARING")
    Bootcamp createBootcampRequestToBootcamp(CreatedBootcampRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "instructorId", source = "instructorId")
    @Mapping(target = "startDate", source = "startDate")
    @Mapping(target = "endDate", source = "endDate")
    @Mapping(target = "bootcampState", source = "bootcampState")
    GetBootcampResponse bootcampToGetBootcampResponse(Bootcamp bootcamp);
}
