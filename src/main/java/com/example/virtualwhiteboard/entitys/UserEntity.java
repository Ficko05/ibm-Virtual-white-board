package com.example.virtualwhiteboard.entitys;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Table(name = "users")
@Entity
public class UserEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name" )
    private String fullName;

    @Column(name = "salutations_id")
    private int salutationsId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id", referencedColumnName = "id")
    private List<PostEntity> post;




}
