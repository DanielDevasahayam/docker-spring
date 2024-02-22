package com.docker.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DockerController {
    @GetMapping("/docker")
    public ResponseEntity<String> getDocker() {
        return ResponseEntity.ok("Here is the new compiled docker");
    }
}
