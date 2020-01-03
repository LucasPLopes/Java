package br.com.devdojo.essentials.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.devdojo.essentials.error.ResourceNotFoundDetails;
import br.com.devdojo.essentials.error.ResourceNotFoundException;

import java.util.Date;


@ControllerAdvice
public class RestExceptionHandler{
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnf){
        ResourceNotFoundDetails rnfDetails =  ResourceNotFoundDetails.Builder.newBuilder()
            .timestamp(new Date().getTime())
            .status(HttpStatus.NOT_FOUND.value())
            .title("Resource not found")
            .detail(rnf.getMessage())
            .developerMessage(rnf.getClass().getName())
            .build();

            return new ResponseEntity<>(rnfDetails,HttpStatus.NOT_FOUND);
    }

}