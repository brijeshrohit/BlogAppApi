package com.brijesh.blog.services;

import com.brijesh.blog.entities.User;
import com.brijesh.blog.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userdDto);
    UserDto updateUser(UserDto userDto, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUserById(Integer userId);
}