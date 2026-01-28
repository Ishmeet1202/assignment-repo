package javamodule.Collections.Question4;

import java.util.HashMap;
import java.util.Map;

public class TestEmployee {
    public static void main(String[] args) {
        Map<Employee, Double> map = new HashMap<>();

        Employee e1 = new Employee("Rahul Sharma", 23, "SDE 1");
        Employee e2 = new Employee("Sagar Gupta", 25, "SDE 1");
        Employee e3 = new Employee("Anuj Verma", 33, "SDE 2");
        Employee e4 = new Employee("Rahul Chaudhary",35, "Tech Lead");
        Employee e5 = new Employee("Rahul Sharma", 23, "SDE 1");

        map.put(e1, 35000.0);
        map.put(e2, 45000.0);
        map.put(e3, 55000.0);
        map.put(e4, 70000.0);
        map.put(e5, 40000.0);

        System.out.println(map);
    }
}
