
public class DateWrongSymbolsException extends RuntimeException {

    private String message;

    public DateWrongSymbolsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
