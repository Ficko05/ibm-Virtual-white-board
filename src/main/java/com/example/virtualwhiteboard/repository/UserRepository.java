package com.example.virtualwhiteboard.repository;

import com.example.virtualwhiteboard.entitys.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
