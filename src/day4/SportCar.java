package day4;

public class SportCar extends Vehicle{
    final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
