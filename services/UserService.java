package com.api.twiteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.twiteroo.DTOs.UserDTO;
import com.api.twiteroo.models.User;
import com.api.twiteroo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create(UserDTO data) {
        repository.save(new User(data));
    }

}
