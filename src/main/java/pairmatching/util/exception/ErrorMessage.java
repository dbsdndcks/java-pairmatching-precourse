package pairmatching.util.exception;

public enum ErrorMessage {
    DD("[ERROR] ");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}