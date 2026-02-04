package javamodule.BeyondJavaEight.Question5;

public class RecordDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 101, 20);
        Student s2 = new Student("Alice", 101, 20);
        Student s3 = new Student("Bob", 102, 22);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(Student.getCount());
    }
}

record Student(String name, int id, int age) {

    private static int count = 0;

    public Student {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
