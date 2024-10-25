package com.frol.customer.api.error_handler;

import com.frol.customer.api.dto.errors.ErrorsResponse;
import com.frol.customer.util.exceptions.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorsResponse handleBadRequest(MethodArgumentNotValidException exception){

        List<Map<String, String>> errors = new ArrayList<>();

        exception.getBindingResult().getFieldErrors()
                .forEach(e -> {
                    Map<String, String> error = new HashMap<>();

                    error.put("error", e.getDefaultMessage());
                    error.put("field", e.getField());

                    errors.add(error);
                } );
        return ErrorsResponse.builder()
                .status(HttpStatus.BAD_REQUEST.name())
                .code(HttpStatus.BAD_REQUEST.value())
                .errors(errors)
                .build();
    }

    @ExceptionHandler(BadRequestException.class)
    public ErrorsResponse handleError(BadRequestException exception){

        List<Map<String, String>> errors = new ArrayList<>();

        Map<String, String> error = new HashMap<>();

        error.put("id", exception.getMessage());
        errors.add(error);

        return ErrorsResponse.builder()
                .status(HttpStatus.BAD_REQUEST.name())
                .code(HttpStatus.BAD_REQUEST.value())
                .errors(errors)
                .build();
    }

}
