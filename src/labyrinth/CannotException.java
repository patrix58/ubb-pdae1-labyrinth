package labyrinth;

public class CannotException extends RuntimeException {
    public CannotException() {}

    public CannotException(String message) {
        super(message);
    }
}
