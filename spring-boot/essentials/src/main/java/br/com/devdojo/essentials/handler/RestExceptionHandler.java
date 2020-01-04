package br.com.devdojo.essentials.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.devdojo.essentials.error.ResourceNotFoundDetails;
import br.com.devdojo.essentials.error.ResourceNotFoundException;
import br.com.devdojo.essentials.error.ValidationErrorDetail;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.validation.FieldError;


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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationErrorException(
        MethodArgumentNotValidException manve    )
    {

        List<FieldError> fieldErrors =manve.getBindingResult().getFieldErrors();
        String field =fieldErrors.stream().map(FieldError::getField).collect( Collectors.joining(","));
        String fieldMessages =fieldErrors.stream().map(FieldError::getDefaultMessage).collect( Collectors.joining(","));
        // System.out.println(fieldErrors);
        ValidationErrorDetail rnfDetails =  ValidationErrorDetail.Builder.newBuilder()
            .timestamp(new Date().getTime())
            .status(HttpStatus.BAD_REQUEST.value())
            .title("Field validation error")
            .detail("Field validation error")
            .developerMessage(manve.getClass().getName())
            .field(field)
            .messageField(fieldMessages)
            .build();

            return new ResponseEntity<>(rnfDetails,HttpStatus.BAD_REQUEST);
    }

}