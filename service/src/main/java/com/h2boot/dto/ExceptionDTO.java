package com.h2boot.dto;

public class ExceptionDTO {

    private String message;

    private Integer status;

    public ExceptionDTO(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatus() {
        return status;
    }
}