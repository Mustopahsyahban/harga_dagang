package com.hackerrank.weather.controller;

import com.hackerrank.weather.entity.UserEntity;
import com.hackerrank.weather.service.UserService;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserApiRestController {
        @Autowired
        UserService userService;

        @GetMapping("")
        public ResponseEntity<?> index() {
            List<UserEntity> list = userService.fineAll();
            return ResponseEntity.status(HttpStatus.OK).body(list);
        }
}
