package javamodule.BeyondJavaEight.Question1;

import java.util.Optional;

public class OptionalToStream {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Ishmeet");

        opt.stream().forEach(System.out::println);
    }
}

