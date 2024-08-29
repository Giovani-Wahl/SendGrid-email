package com.giovaniwahl.SendGrid.controllers;

import com.giovaniwahl.SendGrid.dto.EmailDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {
    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDto dto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
