package body.movieSystem.exception.unchecked;

public class RelatedEntityNotFoundException extends RuntimeException {
    public RelatedEntityNotFoundException(String message) {
        super(message);
    }
}