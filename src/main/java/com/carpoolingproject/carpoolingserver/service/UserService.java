package com.carpoolingproject.carpoolingserver.service;

import com.carpoolingproject.carpoolingserver.model.User;
import com.carpoolingproject.carpoolingserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
