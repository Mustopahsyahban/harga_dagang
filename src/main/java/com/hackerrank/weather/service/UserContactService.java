package com.hackerrank.weather.service;

import com.hackerrank.weather.entity.UserContactEntity;
import com.hackerrank.weather.repository.UserContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserContactService {

    @Autowired
    UserContactRepository userContactRepository;

    public List<UserContactEntity> fineAll() {
        List<UserContactEntity> result;
        result = userContactRepository.findAll();
        return result;
    }

}
