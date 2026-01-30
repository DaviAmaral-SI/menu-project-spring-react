package com.example.menu_api.api.exceptionhandler;

import com.example.menu_api.domain.exception.NegocioException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(NegocioException.class)
    public ResponseEntity<String> handleException(NegocioException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
