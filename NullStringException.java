public class NullStringException extends RuntimeException{
    
    private String message;

    public NullStringException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
