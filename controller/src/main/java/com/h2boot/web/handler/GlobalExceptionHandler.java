package com.h2boot.web.handler;

import com.h2boot.dto.ExceptionDTO;
import com.h2boot.exception.BadRequestException;
import com.h2boot.exception.ContentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ContentNotFoundException.class)
    public ResponseEntity<ExceptionDTO> contentNotFound(ContentNotFoundException e){
        ExceptionDTO exceptionDTO = new ExceptionDTO(e.getValue(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(exceptionDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDTO> badRequest(BadRequestException e){
        ExceptionDTO exceptionDTO = new ExceptionDTO(e.getValue(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

}
