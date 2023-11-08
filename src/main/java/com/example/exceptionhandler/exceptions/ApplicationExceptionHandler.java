package com.example.exceptionhandler.exceptions;

import com.example.exceptionhandler.dto.DefaultErro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity handleException(Exception e){

        String paramentErro = String.valueOf(e.getCause());
        DefaultErro error = new DefaultErro(HttpStatus.BAD_GATEWAY.value(), "error, please enter a number and not a letter ");

        return new ResponseEntity(error, HttpStatus.BAD_GATEWAY);
    }
}
