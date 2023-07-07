package day5;

public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculaterPerimeter());

        Triangle triangle = new Triangle(5, 10, 3, 4);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculaterPerimeter());
    }
}
