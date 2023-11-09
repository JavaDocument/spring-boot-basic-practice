package com.practice.lkdcode.global.exception;

import com.practice.lkdcode.global.response.PostResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public PostResponse<?> catchIllegalArgumentException(IllegalArgumentException e) {
        return PostResponse.error(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public PostResponse<?> catchMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return PostResponse.error(e.getBindingResult()
                .getAllErrors()
                .get(0)
                .getDefaultMessage());
    }

}