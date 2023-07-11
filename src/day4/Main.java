package day4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.eat();
        dog.bark();
        cat.meow();

        //Homework

        Vehicle golfu = new Vehicle(15, 90);
        golfu.setFuelConsumption(5);
        golfu.drive(250);

        RaceMotorcycle mt09 = new RaceMotorcycle(15, 132);
        mt09.drive(500);


    }
}
