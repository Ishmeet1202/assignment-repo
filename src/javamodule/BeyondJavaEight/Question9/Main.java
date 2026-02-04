package javamodule.BeyondJavaEight.Question9;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ram", 10);
        Student s2 = new Student(1, "Ram", 10);

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
    }
}

