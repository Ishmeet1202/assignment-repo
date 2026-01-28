package javamodule.IntroToJava2.Question4;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        }
        else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        return null;
    }
}
