package javamodule.practice.PayrollSystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ajay Gupta", 50000,4500);
        Employee e2 = new ContractEmployee("Rahul Sharma",87, 8);

        System.out.println(e1+"\n");
        System.out.println(e2);
    }
}
