package javamodule.BeyondJavaEight.Question6;

public sealed abstract class Vehicle permits Bike, Car {
    public abstract String getType();
}
