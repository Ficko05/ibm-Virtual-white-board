package com.example.virtualwhiteboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/whiteboard")
public class WhiteBoardController {


    @GetMapping("/feed")
    public Optional<List<String>> getNewsFeed(){

        return null;
    }
}
