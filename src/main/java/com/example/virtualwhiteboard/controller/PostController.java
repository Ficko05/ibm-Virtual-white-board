package com.example.virtualwhiteboard.controller;

import com.example.virtualwhiteboard.dto.PostDto;
import com.example.virtualwhiteboard.entitys.PostEntity;
import com.example.virtualwhiteboard.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feed")
public class PostController {

    @Autowired
    PostService postService;

    // get all posts
    @GetMapping("/")
    public Optional<List<PostEntity>> getNewsFeed(){
        return Optional.ofNullable(postService.getNewsfeed());
    }

    // finds post by id
    @GetMapping("/post/{postId}")
    public ResponseEntity<PostDto> getPostById(@PathVariable long postId) {
        return ResponseEntity.ok(postService.get(postId));
    }

    // create a post
    @PostMapping("/post/{userId}")
    public ResponseEntity<PostEntity> postOnFeed(@RequestBody PostDto dto,
                                                 @PathVariable long userId){

        var result = postService.createPost(dto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .location(URI.create("/feed/post" + result.getId()))
                .body(result);
    }


}
