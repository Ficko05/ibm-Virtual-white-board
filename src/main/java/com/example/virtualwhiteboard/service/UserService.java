package com.example.virtualwhiteboard.service;

import com.example.virtualwhiteboard.dto.UserDto;
import com.example.virtualwhiteboard.entitys.UserEntity;
import com.example.virtualwhiteboard.mappers.UserMapper;
import com.example.virtualwhiteboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final UserMapper userMapper = UserMapper.INSTANCE;

    @Transactional(readOnly = true)
    public UserDto get(long id){
        return userRepository.findById(id)
                .map(userMapper:: toDto)
                .orElseThrow();
    }


    @Transactional
    public UserEntity createUser(UserDto userDto) {

        UserEntity entity = UserMapper.INSTANCE.formNew(userDto);
        entity = userRepository.save(entity);

        return entity;

    }


}
