package javamodule.IntroToJava2.Question4;

public class Main {
    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("CAR");
        v1.drive();

        Vehicle v2 = factory.getVehicle("BIKE");
        v2.drive();
    }
}
