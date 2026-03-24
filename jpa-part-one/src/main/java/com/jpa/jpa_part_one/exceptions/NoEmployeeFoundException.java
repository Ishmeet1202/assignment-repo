package com.jpa.jpa_part_one.exceptions;

public class NoEmployeeFoundException extends RuntimeException {
    public NoEmployeeFoundException(String message) {
        super(message);
    }
}
