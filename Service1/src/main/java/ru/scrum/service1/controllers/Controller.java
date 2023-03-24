package ru.scrum.service1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
public class Controller {

    @GetMapping
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok("Ok! Service1 is working.");
    }

    @GetMapping("/{a}")
    public ResponseEntity<?> getMessage(@PathVariable int a) {
        return ResponseEntity.ok("a = " + a);
    }
}
