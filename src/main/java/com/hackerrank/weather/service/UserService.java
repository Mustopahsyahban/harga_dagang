package com.hackerrank.weather.service;

import com.hackerrank.weather.entity.UserEntity;

import com.hackerrank.weather.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> fineAll() {
        List<UserEntity> result;
        result = userRepository.findAll();
        return result;
    }

}
