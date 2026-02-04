package javamodule.BeyondJavaEight.Question10;

import java.util.*;

public class SequencedList {
    public static void main(String[] args) {

        SequencedCollection<Integer> list = new ArrayList<>();

        list.addFirst(20);
        list.addLast(40);
        list.addFirst(10);
        list.addLast(50);

        System.out.println("List: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("After removals: " + list);

        SequencedCollection<Integer> reversed = list.reversed();
        System.out.println("Reversed: " + reversed);
    }
}

