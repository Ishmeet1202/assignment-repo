package javamodule.Collections.Question3;

public class SpecialStackTest {
    public static void main(String[] args) {
        SpecialStack ss = new SpecialStack(5);

        ss.push(5);
        ss.push(3);
        ss.push(7);

        System.out.println(ss);

        ss.pop();
//        ss.pop();

        System.out.println(ss);
        System.out.println(ss.getMin());
    }
}
