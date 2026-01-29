package javamodule.Java8.Question2;

public class Main {
    public static void main(String[] args) {
        IntegerOperations integerOperations = new IntegerOperations();

        ArithmeticOperations aoAdd = integerOperations::add;
        ArithmeticOperations aoSubtract = integerOperations::subtract;
        ArithmeticOperations aoMultiply = IntegerOperations::multiply;


        System.out.println("Addition: "+aoAdd.operation(2,3));
        System.out.println("Subtraction: "+aoSubtract.operation(2,3));
        System.out.println("Multiplication: "+aoMultiply.operation(2,3));
    }
}
