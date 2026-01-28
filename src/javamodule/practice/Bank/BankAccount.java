package javamodule.practice.Bank;

public class BankAccount {
    private static int accountNoInitializer = 10000;
    private final int accountNo;
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.accountNo = ++accountNoInitializer;
        setName(name);
        setBalance(balance);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty or null.");
        this.name = name;
    }

    public void setBalance(int balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount cannot be negative or zero");
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient Balance !", balance);
        if (amount <= 0) throw new IllegalArgumentException("Withdrawn amount cannot be negative or zero");
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Bank Account details:\n"+"\tName: "+name+"\n"+"\tAccount No.: "+accountNo+"\n"+"\tBalance: "+balance;
    }
}
