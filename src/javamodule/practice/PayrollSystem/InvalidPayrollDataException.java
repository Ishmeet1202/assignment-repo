package javamodule.practice.PayrollSystem;

public class InvalidPayrollDataException extends RuntimeException {
    public InvalidPayrollDataException(String message) {
        super(message);
    }
}
