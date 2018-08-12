package screenplay.exceptions;

public class CannotAuthenticateException extends Exception {

    public CannotAuthenticateException(String actorName) {

        super("The actor " + actorName + " does not have the ability to browse the web");
    }
}
