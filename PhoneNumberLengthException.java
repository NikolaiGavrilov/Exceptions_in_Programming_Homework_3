public class PhoneNumberLengthException extends RuntimeException{
    
    private String message;

    public PhoneNumberLengthException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    } 
}
