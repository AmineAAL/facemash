package com.catmash.backcatmash.mapper;

import com.catmash.backcatmash.dto.CatDto;
import com.catmash.backcatmash.model.Cat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICatEntityDtoMapper {

    CatDto entityToDto(Cat cat);
    Cat dtoToEntity(CatDto catDto);
}
