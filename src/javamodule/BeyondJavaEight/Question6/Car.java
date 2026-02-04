package javamodule.BeyondJavaEight.Question6;

public sealed class Car extends Vehicle permits SportsCar {

    @Override
    public String getType() {
        return "Car";
    }
}
