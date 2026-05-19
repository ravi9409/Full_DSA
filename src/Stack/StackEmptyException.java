package Stack;

public class StackEmptyException extends  RuntimeException{

        public StackEmptyException(String message) {
            super(message);
        }

        @Override
        public String toString() {
            return "StackEmptyException: " + getMessage();
        }
}
