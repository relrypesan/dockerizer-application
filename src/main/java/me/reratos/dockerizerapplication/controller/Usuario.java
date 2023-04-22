package me.reratos.dockerizerapplication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class Usuario {

    @PostMapping
    public ResponseEntity<Object> criar(Map<String, Object> usuarioDto) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
