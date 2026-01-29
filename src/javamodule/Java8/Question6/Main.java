package javamodule.Java8.Question6;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();

        // Abstract Method
        System.out.println(calc.add(10, 20));

        // Default Name
        calc.showType();

        // Static Name
        Calculator.info();
    }
}

