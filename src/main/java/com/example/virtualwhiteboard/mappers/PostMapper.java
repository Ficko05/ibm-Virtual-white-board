package com.example.virtualwhiteboard.mappers;

import com.example.virtualwhiteboard.dto.PostDto;
import com.example.virtualwhiteboard.entitys.PostEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostMapper {

    //mapper class

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    PostDto toDto(PostEntity entity);

    @Mapping(target = "id", ignore = true)
    PostEntity formNew(PostDto dto);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    void replaceEntity(PostDto dto, @MappingTarget PostEntity entity);


}
