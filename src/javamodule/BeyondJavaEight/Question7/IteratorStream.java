package javamodule.BeyondJavaEight.Question7;

import java.util.stream.Stream;

public class IteratorStream {
    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 1).limit(5).forEach(System.out::println);
    }
}
