package ru.scrum.service2.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/voice")
public class Controller {

    @GetMapping
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok("Do you hear a voice? Service2 is working.");
    }
}
