package javamodule.Collections.Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSumExample {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();

        list.add(10.5f);
        list.add(20.0f);
        list.add(5.5f);
        list.add(14.2f);
        list.add(9.8f);

        Iterator<Float> iterator = list.iterator();
        float sum = 0.0f;

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum of elements in the list: " + sum);
    }
}

