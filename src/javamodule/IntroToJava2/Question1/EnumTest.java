package javamodule.IntroToJava2.Question1;

// QUESTION 1
public class EnumTest {
    public static void main(String[] args) {
        House[] houses = House.values();

        for (House house : houses) {
            System.out.println(house+" : "+house.getPrice());
        }
    }
}
