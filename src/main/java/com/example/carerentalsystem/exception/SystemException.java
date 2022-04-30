package com.example.carerentalsystem.exception;

/**
 * @author Hassan Wael
 */
public class SystemException extends Exception {
    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
