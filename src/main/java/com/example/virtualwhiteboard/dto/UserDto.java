package com.example.virtualwhiteboard.dto;


import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {

    private String userName;

    private String password;

    private String fullName;

    private int salutationsId;

    public UserDto(){
        super();
    }

}
