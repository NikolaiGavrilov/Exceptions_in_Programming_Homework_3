public class PhoneSymbolException extends RuntimeException{
    private String message;

    public PhoneSymbolException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    } 
}
