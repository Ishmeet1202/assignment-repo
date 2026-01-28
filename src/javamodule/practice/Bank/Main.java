package javamodule.practice.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount("Ajay Gupta", 45000);

        while (true) {
            System.out.println("""
                    \n
                    *****MENU*****
                    1. Deposit Money
                    2. Withdraw Money
                    3. Get Account details
                    4. Exit
                    """);

            System.out.print("Choose an option(1-4): ");
            int option = sc.nextInt();

            if (option == 4) {
                System.out.println("Exited !");
                break;
            }

            try {
                int amount;
                switch (option) {
                    case 1 -> {
                        System.out.print("Enter the amount: ");
                        amount = sc.nextInt();
                        ba.deposit(amount);
                        System.out.println("Rs. "+amount+" deposited successfully.");
                    }
                    case 2 -> {
                        System.out.print("Enter the amount: ");
                        amount = sc.nextInt();
                        ba.withdraw(amount);
                        System.out.println("Rs. "+amount+" withdrawn successfully");
                    }
                    case 3 -> System.out.println("\n"+ba);
                    default -> System.out.println("\nYou have entered the wrong choice ! Please try again.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
                System.out.println("Your balance is: "+e.getBalance());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("---------------------------------------------------------------------------------");
        }
    }
}
