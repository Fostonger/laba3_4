package exceptions;

public class EmptyNameException extends Exception {
    public EmptyNameException(String name) {
        super("You have entered an empty name of " + name + "!");
    }
}
