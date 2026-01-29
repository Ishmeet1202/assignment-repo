package javamodule.Java8.Question8;

import java.util.Optional;

public class OptionalDemo {

    static Optional<String> getEmail() {
        String email = null;   // simulate missing value
        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {

        Optional<String> emailOptional = getEmail();

        if (emailOptional.isPresent()) {
            System.out.println(emailOptional.get());
        } else {
            System.out.println("Email not available");
        }

        String email1 = emailOptional.orElse("default@email.com");
        System.out.println(email1);

        String email2 = emailOptional.orElseGet(() -> "name@email.com");
        System.out.println(email2);

        emailOptional.ifPresent(e -> System.out.println(e.toLowerCase()));
    }
}

