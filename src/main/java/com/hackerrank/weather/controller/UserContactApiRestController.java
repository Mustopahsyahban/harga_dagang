package com.hackerrank.weather.controller;

import com.hackerrank.weather.entity.UserContactEntity;
import com.hackerrank.weather.entity.UserEntity;
import com.hackerrank.weather.service.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userContact")
public class UserContactApiRestController {
        @Autowired
        UserContactService userContactService;

        @GetMapping("")
        public ResponseEntity<?> index() {
            List<UserContactEntity> list = userContactService.fineAll();
            return ResponseEntity.status(HttpStatus.OK).body(list);
        }
}
