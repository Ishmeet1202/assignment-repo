package javamodule.practice.Bank;

public class InsufficientBalanceException extends RuntimeException {
    private int balance;

    public InsufficientBalanceException(String message) {
        super(message);
    }

    public InsufficientBalanceException(String message, int balance) {
        super(message);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
