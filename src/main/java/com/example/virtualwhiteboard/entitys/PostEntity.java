package com.example.virtualwhiteboard.entitys;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Table(name = "users")
@Entity
public class PostEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "caption")
    private String caption;

    @Column(name = "video_link")
    private String videoLink;

    @Column(name = "image", columnDefinition="BLOB")
    private byte[] image;

    @Column(name = "users_id")
    private long userId;

    @Column(name = "time_stamp")
    private Date timeStamp;


}
