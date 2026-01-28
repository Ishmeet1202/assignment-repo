package javamodule.IntroToJava2.Question1;

// QUESTION 1
public enum House {
    HUT(500000),
    FLAT(2500000),
    VILLA(7500000);

    private final double price;

    House(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
