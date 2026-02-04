package javamodule.BeyondJavaEight.Question9;

import java.util.Objects;

public record Student(Integer id, String name, Integer standard) {
    public Student {
        Objects.requireNonNull(id, "id cannot be null");
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(standard, "standard cannot be null");
    }
}

