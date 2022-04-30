package com.example.carerentalsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Hassan Wael
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SystemBadRequestException extends RuntimeException {
    public SystemBadRequestException() {
    }

    public SystemBadRequestException(String message) {
        super(message);
    }

    public SystemBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
