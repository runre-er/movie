package body.movieSystem.exception.unchecked;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}