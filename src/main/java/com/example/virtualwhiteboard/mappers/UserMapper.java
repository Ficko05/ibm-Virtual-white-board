package com.example.virtualwhiteboard.mappers;

import com.example.virtualwhiteboard.dto.UserDto;
import com.example.virtualwhiteboard.entitys.UserEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    //mapper class
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(UserEntity entity);

    @Mapping(target = "id", ignore = true)
    UserEntity formNew(UserDto dto);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    void replaceEntity(UserDto dto, @MappingTarget UserEntity entity);

}
