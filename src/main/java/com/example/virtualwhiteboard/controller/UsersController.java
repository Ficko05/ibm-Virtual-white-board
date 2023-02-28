package com.example.virtualwhiteboard.controller;


import com.example.virtualwhiteboard.dto.UserDto;
import com.example.virtualwhiteboard.entitys.UserEntity;
import com.example.virtualwhiteboard.repository.UserRepository;
import com.example.virtualwhiteboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired UserRepository userRepository;

    @Autowired
    UserService userService;

    // returns a list of all users
    @GetMapping("/users")
    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    // finds user by id
    @GetMapping("user/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable long userId){
        return ResponseEntity.ok(userService.get(userId));
    }

    //create a user
    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserDto dto){

        var result = userService.createUser(dto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .location(URI.create("/users/user"+ result.getId()))
                .body(result);

    }



}
