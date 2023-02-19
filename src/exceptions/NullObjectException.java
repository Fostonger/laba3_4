package exceptions;

public class NullObjectException extends RuntimeException {
    public NullObjectException() {
        super("You have passed null");
    }
}
