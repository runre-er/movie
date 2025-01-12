package body.movieSystem.exception;

import body.movieSystem.api.dto.ErrorResponse;
import body.movieSystem.api.dto.ValidationErrorResponse;
import body.movieSystem.exception.unchecked.DuplicateResourceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    // Validation Exceptions
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorResponse> handleValidationException(
            MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(this::getErrorMessage)
                .collect(Collectors.toList());

        return createValidationErrorResponse(errors);
    }
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoHandlerFoundException(NoHandlerFoundException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "Endpoint not found");
        response.put("message", "The requested URL " + ex.getRequestURL() + " was not found on this server.");
        response.put("status", "404");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    // Business Logic Exceptions
    @ExceptionHandler({
            DataIntegrityViolationException.class,
            DuplicateResourceException.class
    })
    public ResponseEntity<ErrorResponse> handleDataIntegrityExceptions(RuntimeException ex) {
        String message = ex instanceof DataIntegrityViolationException ?
                "Database error occurred" : ex.getMessage();
        log.error(message, ex);
        return createErrorResponse(message, HttpStatus.CONFLICT);
    }
    // Generic Exception Handler
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex) {
        log.error(ex.getMessage(), ex);
        return createErrorResponse(
                "An unexpected error occurred",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
    // Helper Methods
    private ResponseEntity<ValidationErrorResponse> createValidationErrorResponse(List<String> errors) {
        ValidationErrorResponse response = new ValidationErrorResponse(
                LocalDateTime.now(),
                "Validation failed",
                HttpStatus.BAD_REQUEST.value(),
                errors
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    private ResponseEntity<ErrorResponse> createErrorResponse(String message, HttpStatus status) {
        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                message,
                status.value()
        );
        return new ResponseEntity<>(response, status);
    }
    private String getErrorMessage(FieldError fieldError) {
        return fieldError.getField() + ": " + fieldError.getDefaultMessage();
    }
}