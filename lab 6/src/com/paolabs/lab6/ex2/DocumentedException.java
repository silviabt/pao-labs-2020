package com.paolabs.lab6.ex2;

public class DocumentedException extends Exception {

    public DocumentedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocumentedException(String message) {
        super(message);
    }
}
