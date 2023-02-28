package com.example.virtualwhiteboard.dto;


import lombok.Data;

import java.util.Date;

@Data
public class PostDto {

    private String caption;

    private String videoLink;

    private Byte[] image;

    private long usersId;

    private Date timeStamp;

    private boolean private_toggle;

    public PostDto(){
        super();
    }
}
