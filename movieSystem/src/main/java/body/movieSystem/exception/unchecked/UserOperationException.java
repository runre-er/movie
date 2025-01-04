package body.movieSystem.exception.unchecked;

public class UserOperationException extends RuntimeException {
    public UserOperationException(String message) {
        super(message);
    }
}