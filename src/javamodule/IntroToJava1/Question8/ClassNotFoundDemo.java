package javamodule.IntroToJava1.Question8;

public class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
            Class.forName("NotFoundClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred");
        }
    }
}

