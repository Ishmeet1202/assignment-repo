package javamodule.BeyondJavaEight.Question6;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle sportsCar = new SportsCar();
        Vehicle car = new Car();

        System.out.println(bike.getType());
        System.out.println(sportsCar.getType());
        System.out.println(car.getType());
    }
}
