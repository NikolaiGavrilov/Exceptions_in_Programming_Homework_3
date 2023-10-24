public class InputDataLengthException extends RuntimeException{
    
    private String message;

    public InputDataLengthException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
