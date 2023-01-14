package com.interview.drone.controller;

import com.interview.drone.exception.DroneModelException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DroneModelException.class)
    @ResponseBody
    public ResponseEntity<String> validationExceptionHandler(DroneModelException ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }

}