package hierarchy;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25 ;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle (double fuel, int horsepower){
       this.fuel = fuel;
       this.horsePower = horsepower;
       this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){
        double fuelNeeded = this.getFuelConsumption() * kilometers;
        if (this.getFuel() - fuelNeeded >= 0){
            this.setFuel(this.getFuel() - fuelNeeded);
        }
    }
}
