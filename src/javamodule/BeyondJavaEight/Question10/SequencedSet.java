package javamodule.BeyondJavaEight.Question10;

import java.util.*;

public class SequencedSet {
    public static void main(String[] args) {

        SequencedCollection<String> set = new LinkedHashSet<>();

        set.addFirst("B");
        set.addLast("C");
        set.addFirst("A");
        set.addLast("D");

        System.out.println("Set: " + set);

        System.out.println("First: " + set.getFirst());
        System.out.println("Last: " + set.getLast());

        set.removeFirst();
        set.removeLast();

        System.out.println("After removals: " + set);

        System.out.println("Reversed: " + set.reversed());
    }
}

