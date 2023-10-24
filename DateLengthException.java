public class DateLengthException extends RuntimeException {
    
    private String message;

    public DateLengthException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
