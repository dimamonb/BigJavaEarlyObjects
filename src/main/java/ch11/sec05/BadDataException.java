package ch11.sec05;

import java.io.IOException;

public class BadDataException extends IOException {
    public BadDataException() {}
    public BadDataException(String message) {
        super(message);
    }
}
