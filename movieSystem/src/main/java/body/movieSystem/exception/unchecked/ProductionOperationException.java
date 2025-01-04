package body.movieSystem.exception.unchecked;

public class ProductionOperationException extends RuntimeException {
    public ProductionOperationException(String message) {
        super(message);
    }
}