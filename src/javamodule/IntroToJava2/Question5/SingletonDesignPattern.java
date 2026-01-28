package javamodule.IntroToJava2.Question5;

public class SingletonDesignPattern {
    private static SingletonDesignPattern instance;

    private SingletonDesignPattern() {
        System.out.println("Instance created for the singleton class.");
    }

    public static SingletonDesignPattern getInstance() {
        if (instance == null) {
            instance = new SingletonDesignPattern();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
        SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
