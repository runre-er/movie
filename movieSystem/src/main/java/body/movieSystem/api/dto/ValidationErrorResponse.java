package body.movieSystem.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ValidationErrorResponse {
    private LocalDateTime timestamp;
    private String message;
    private int status;
    private List<String> errors;
}