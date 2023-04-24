package me.reratos.dockerizerapplication.interfaces.controllers;

import me.reratos.dockerizerapplication.domain.exceptions.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class ControllerAdviceException {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> exceptionEntityNotFoundException(EntityNotFoundException ex) {
        return ResponseEntity
                .badRequest()
                .body(Map.of("status", 400, "message", ex.getMessage()));
    }

}
