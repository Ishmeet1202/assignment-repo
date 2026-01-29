package javamodule.Java8.Question3;

interface A {
    default void display() {
        System.out.println("Displaying from interface A.");
    }
}

interface B {
    default void display() {
        System.out.println("Displaying from interface B.");
    }
}

class C implements A,B {

    @Override
    public void display() {
        A.super.display();
        B.super.display();
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();

        c.display();
    }
}

