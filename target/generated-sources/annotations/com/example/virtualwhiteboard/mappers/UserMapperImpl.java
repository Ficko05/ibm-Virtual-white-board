package com.example.virtualwhiteboard.mappers;

import com.example.virtualwhiteboard.dto.UserDto;
import com.example.virtualwhiteboard.entitys.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-28T15:00:35+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserName( entity.getUserName() );
        userDto.setPassword( entity.getPassword() );
        userDto.setFullName( entity.getFullName() );
        userDto.setSalutationsId( entity.getSalutationsId() );

        return userDto;
    }

    @Override
    public UserEntity formNew(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUserName( dto.getUserName() );
        userEntity.setPassword( dto.getPassword() );
        userEntity.setFullName( dto.getFullName() );
        userEntity.setSalutationsId( dto.getSalutationsId() );

        return userEntity;
    }

    @Override
    public void replaceEntity(UserDto dto, UserEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setUserName( dto.getUserName() );
        entity.setPassword( dto.getPassword() );
        entity.setFullName( dto.getFullName() );
        entity.setSalutationsId( dto.getSalutationsId() );
    }
}
