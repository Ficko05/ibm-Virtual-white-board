package com.example.virtualwhiteboard.repository;

import com.example.virtualwhiteboard.entitys.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
