package exceptions;

public class EmptyNameException extends Exception {
    public EmptyNameException() {
        super("You have entered an empty name!");
    }
}
