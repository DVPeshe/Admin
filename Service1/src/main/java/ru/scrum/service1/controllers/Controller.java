package ru.scrum.service1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
public class Controller {

    @GetMapping
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok("Ok! Service1 is working.");
    }
}
