package javamodule.Collections.Question3;

import java.util.ArrayList;
import java.util.List;

public class SpecialStack {
    private final int capacity;
    private final List<Integer> stack;
    private final List<Integer> trackMin;
    private int size = 0;

    public SpecialStack(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayList<>();
        this.trackMin = new ArrayList<>();
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Integer element) {
        if (isFull()) throw new IllegalStateException("SpecialStack is full.");
        if (isEmpty()) {
            stack.add(element);
            trackMin.add(element);
            size++;
            return;
        }
        Integer minElement = (trackMin.getLast().compareTo(element) <= 0) ? trackMin.getLast() : element;
        stack.add(element);
        trackMin.add(minElement);
        size++;
    }

     public Integer pop() {
        if (isEmpty()) throw new IllegalStateException("SpecialStack is empty.");
        Integer removedElement = stack.removeLast();
        trackMin.removeLast();
        size--;

        return removedElement;
     }

     public Integer getMin() {
        if (isEmpty()) throw new IllegalStateException("SpecialStack is empty");
        return trackMin.getLast();
     }

    @Override
    public String toString() {
        return stack.toString();
    }
}
