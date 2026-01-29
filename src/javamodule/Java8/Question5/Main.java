package javamodule.Java8.Question5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> p = (a) -> a > 5;
        Consumer<String> c = System.out::println;
        Function<Integer,Integer> f = (a) -> a * a;
        Supplier<Long> s = () -> Math.round((Math.random() * 10) + 1);

        System.out.println("Predicate: " + p.test(2));
        System.out.print("Consumer: " );
        c.accept("Ishmeet Singh");
        System.out.println("Function: " + f.apply(8));
        System.out.println("Supplier: " + s.get());
    }
}
