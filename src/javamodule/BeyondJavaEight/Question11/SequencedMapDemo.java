package javamodule.BeyondJavaEight.Question11;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapDemo {

    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.putLast(2, "B");
        map.putLast(3, "C");
        map.putFirst(1, "A");
        map.putLast(4, "D");

        System.out.println("Map: " + map);

        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        System.out.println("Polled First: " + map.pollFirstEntry());
        System.out.println("Polled Last: " + map.pollLastEntry());

        System.out.println("After polling: " + map);

        SequencedMap<Integer,String> reversed = map.reversed();
        System.out.println("Reversed Map: " + reversed);
    }
}
