package javamodule.IntroToJava1.Question9;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) throws NegativeDimensionException {
        setLength(length);
        setBreadth(breadth);
    }

    public void setLength(double length) throws NegativeDimensionException {
        if (length < 0) {
            throw new NegativeDimensionException("Length cannot be negative.");
        }
        this.length = length;
    }

    public void setBreadth(double breadth) throws NegativeDimensionException {
        if (breadth < 0) {
            throw new NegativeDimensionException("Breadth cannot be negative.");
        }
        this.breadth = breadth;
    }

    public double area() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        try {
            Rectangle r = new Rectangle(5,2);
            System.out.println(r.area());
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
