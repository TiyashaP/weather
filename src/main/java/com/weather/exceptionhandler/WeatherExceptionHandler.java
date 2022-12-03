package com.weather.exceptionhandler;

import com.weather.exception.ErrorResponse;
import com.weather.exception.WeatherException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class WeatherExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(WeatherException.class)
    public ResponseEntity<Object> handleWeatherException(WeatherException ex, WebRequest webRequest){
        ErrorResponse errorResponse=new ErrorResponse(ex.getMessage(),ex.getResponseCode());
        return handleExceptionInternal(ex,errorResponse,null,ex.getResponseCode(),webRequest);

    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());

        ErrorResponse errorResponse=new ErrorResponse(ex.getMessage(),status,errors);
        return handleExceptionInternal(ex,errorResponse,headers,status,request);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex, WebRequest webRequest){
        ErrorResponse errorResponse=new ErrorResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);

    }

}


