package com.interview.drone.controller;

import com.interview.drone.exception.BusinessLogicException;
import com.interview.drone.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@Slf4j
@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    public ResponseEntity<String> validationExceptionHandler(ValidationException ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseBody
    public ResponseEntity<String> entityNotFoundExceptionHandler(EntityNotFoundException ex) {
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BusinessLogicException.class)
    @ResponseBody
    public ResponseEntity<String> businessLogicExceptionHandler(BusinessLogicException ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity
            .internalServerError()
            .body(ex.getMessage());
    }
}
