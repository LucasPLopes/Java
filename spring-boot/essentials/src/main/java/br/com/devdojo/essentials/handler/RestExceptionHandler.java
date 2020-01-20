package br.com.devdojo.essentials.handler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import br.com.devdojo.essentials.error.ErrorDetail;
import br.com.devdojo.essentials.error.ResourceNotFoundDetails;
import br.com.devdojo.essentials.error.ResourceNotFoundException;
import br.com.devdojo.essentials.error.ValidationErrorDetail;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
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

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(org.springframework.web.bind.MethodArgumentNotValidException manve, org.springframework.http.HttpHeaders headers, org.springframework.http.HttpStatus status, org.springframework.web.context.request.WebRequest request)
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
    @Override    
    protected ResponseEntity<Object> handleExceptionInternal(
			Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

                ErrorDetail errorDetail =  ErrorDetail.Builder.newBuilder()
                .timestamp(new Date().getTime())
                .status(status.value())
                .title("Internal Exception")
                .detail(ex.getMessage())
                .developerMessage(ex.getClass().getName())
                .build();
    
                return new ResponseEntity<>(errorDetail,headers,status);
	}
}