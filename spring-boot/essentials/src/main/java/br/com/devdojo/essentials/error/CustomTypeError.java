package br.com.devdojo.essentials.error;

public class CustomTypeError {
    private final String message;

    public CustomTypeError(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}