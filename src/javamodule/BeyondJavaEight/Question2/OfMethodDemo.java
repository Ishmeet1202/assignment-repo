package javamodule.BeyondJavaEight.Question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMethodDemo {
    public static void main(String[] args) {

        List<String> list = List.of("A","B");
        Set<Integer> set = Set.of(1,2);
        Map<Integer,String> map = Map.of(1,"One",2,"Two");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
