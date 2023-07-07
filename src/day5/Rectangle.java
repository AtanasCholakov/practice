package day5;

public class Rectangle implements Shape{

    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a * b);
    }

    @Override
    public double calculaterPerimeter() {
        return ((2 * a) + (2 * b));
    }
}
