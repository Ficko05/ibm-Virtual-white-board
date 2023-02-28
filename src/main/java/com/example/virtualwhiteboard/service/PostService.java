package com.example.virtualwhiteboard.service;


import com.example.virtualwhiteboard.dto.PostDto;
import com.example.virtualwhiteboard.dto.UserDto;
import com.example.virtualwhiteboard.entitys.PostEntity;
import com.example.virtualwhiteboard.mappers.PostMapper;
import com.example.virtualwhiteboard.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {


    @Autowired
    PostRepository postRepository;


    private final PostMapper postMapper = PostMapper.INSTANCE;


    @Transactional
    public List<PostEntity> getNewsfeed() {
        return postRepository.findAll();
    }

    @Transactional(readOnly = true)
    public PostDto get(long id){
        return postRepository.findById(id)
                .map(postMapper:: toDto)
                .orElseThrow();
    }

    @Transactional
    public PostEntity createPost(PostDto dto) {

        PostEntity entity = postMapper.INSTANCE.formNew(dto);
        entity = postRepository.save(entity);

        return entity;

    }
}
