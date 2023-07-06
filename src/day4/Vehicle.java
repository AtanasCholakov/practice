package day4;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
    public void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.fuelConsumption = fuelConsumption;
        }

    }
    public double getFuel() {
        return this.fuel;
    }
    public void setFuel(double fuel) {
        if (fuel < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.fuel = fuel;
        }

    }
    public int getHorsePower() {
        return this.horsePower;
    }
    public void setHorsePower(int horsePower) {
        if (horsePower < 5) {
            throw new IllegalArgumentException();
        }
        else {
            this.horsePower = horsePower;
        }

    }

    public void drive(double kilometers) {
        if (kilometers <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            double maxKilometers = (getFuel() / getFuelConsumption() * 100);
            double fuelLeft = getFuel() - (kilometers * getFuelConsumption() / 100);
            if (maxKilometers < kilometers) {
                System.out.println("You can drive max " + maxKilometers + " kilometers with " + getFuel() + " liters fuel!");
            }
            else {
                System.out.println("You will have " + fuelLeft + " liters left after you drive " + kilometers + " kilometers");
            }
        }

    }

}
