
public class SexIdentificationException extends RuntimeException{
    private String message;

    public SexIdentificationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    } 
}
