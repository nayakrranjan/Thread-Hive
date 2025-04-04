package com.threadhive.exceptions;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationException extends RuntimeException {
    private Map<String, String> errors;

    public AuthenticationException(String message) {
        super(message);
        this.errors = new HashMap<>();
    }

    public AuthenticationException(String message, Map<String, String> errors) {
        super(message);
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return this.errors;
    }
}