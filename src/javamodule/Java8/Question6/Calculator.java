package javamodule.Java8.Question6;

public interface Calculator {
    int add(int a, int b);

    default void showType() {
        System.out.println("This is a Calculator interface");
    }

    static void info() {
        System.out.println("Static method inside Calculator interface");
    }
}
