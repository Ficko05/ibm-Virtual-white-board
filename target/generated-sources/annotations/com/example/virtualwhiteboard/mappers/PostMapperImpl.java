package com.example.virtualwhiteboard.mappers;

import com.example.virtualwhiteboard.dto.PostDto;
import com.example.virtualwhiteboard.entitys.PostEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-28T18:14:25+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDto toDto(PostEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PostDto postDto = new PostDto();

        postDto.setCaption( entity.getCaption() );
        postDto.setVideoLink( entity.getVideoLink() );
        postDto.setImage( byteArrayToByteArray( entity.getImage() ) );
        postDto.setUsersId( entity.getUsersId() );
        postDto.setTimeStamp( entity.getTimeStamp() );

        return postDto;
    }

    @Override
    public PostEntity formNew(PostDto dto) {
        if ( dto == null ) {
            return null;
        }

        PostEntity postEntity = new PostEntity();

        postEntity.setCaption( dto.getCaption() );
        postEntity.setVideoLink( dto.getVideoLink() );
        postEntity.setImage( byteArrayTobyteArray( dto.getImage() ) );
        postEntity.setUsersId( dto.getUsersId() );
        postEntity.setTimeStamp( dto.getTimeStamp() );

        return postEntity;
    }

    @Override
    public void replaceEntity(PostDto dto, PostEntity entity) {
        if ( dto == null ) {
            return;
        }

        entity.setCaption( dto.getCaption() );
        entity.setVideoLink( dto.getVideoLink() );
        entity.setImage( byteArrayTobyteArray( dto.getImage() ) );
        entity.setUsersId( dto.getUsersId() );
        entity.setTimeStamp( dto.getTimeStamp() );
    }

    protected Byte[] byteArrayToByteArray(byte[] byteArray) {
        if ( byteArray == null ) {
            return null;
        }

        Byte[] byteTmp = new Byte[byteArray.length];
        int i = 0;
        for ( byte byte1 : byteArray ) {
            byteTmp[i] = byte1;
            i++;
        }

        return byteTmp;
    }

    protected byte[] byteArrayTobyteArray(Byte[] byteArray) {
        if ( byteArray == null ) {
            return null;
        }

        byte[] byteTmp = new byte[byteArray.length];
        int i = 0;
        for ( Byte byte1 : byteArray ) {
            byteTmp[i] = byte1;
            i++;
        }

        return byteTmp;
    }
}
