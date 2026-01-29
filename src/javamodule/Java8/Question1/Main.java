package javamodule.Java8.Question1;

public class Main {
    public static void main(String[] args) {
        CompareIntegers ci = (a, b) -> a > b;
        Incrementer i = (a) -> a + 1;
        StringConcatenator sc = (s1, s2) -> s1.concat(s2);
        StringUpperCaseConverter uc = (s) -> s.toUpperCase();

        System.out.println(ci.compareInt(3,1));
        System.out.println(i.incrementByOne(3));
        System.out.println(sc.concatenation("Hel", "lo"));
        System.out.println(uc.upperCase("hello"));


    }
}
