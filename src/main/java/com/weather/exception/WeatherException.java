package com.weather.exception;

import org.springframework.http.HttpStatus;

public class WeatherException extends RuntimeException {
    private final HttpStatus responseCode;
    private final String message;

    public HttpStatus getResponseCode() {
        return responseCode;
    }

    @Override
    public String getMessage() {
        return message;
    }


    public WeatherException(HttpStatus responseCode, String message) {
        super(message);
        this.responseCode = responseCode;
        this.message = message;
    }
}
