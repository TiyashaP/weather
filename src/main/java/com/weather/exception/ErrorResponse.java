package com.weather.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ErrorResponse {
    private String message;
    private HttpStatus responseCode;

    private List<String> errors;

    public ErrorResponse(String message, HttpStatus responseCode) {
        this.message = message;
        this.responseCode = responseCode;
    }

    public ErrorResponse(String message, HttpStatus responseCode, List<String> errors) {
        this.message = message;
        this.responseCode = responseCode;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getResponseCode() {
        return responseCode;
    }

    public List<String> getErrors() {
        return errors;
    }
}
