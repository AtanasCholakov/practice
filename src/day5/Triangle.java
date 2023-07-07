package day5;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a * h / 2);
    }

    @Override
    public double calculaterPerimeter() {
        return (a + b + c);
    }
}