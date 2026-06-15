package Stack.Implementation;

public class StackFullException extends RuntimeException {

    public StackFullException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "StackFullException: " + getMessage();
    }
}
