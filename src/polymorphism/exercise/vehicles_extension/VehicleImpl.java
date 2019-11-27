package vehicles_extension;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle  {
       private double fuelQuantity ;
       private double consumption;
       private double tankCapacity;
       private static final DecimalFormat formatter = new DecimalFormat("#.##");


    public VehicleImpl(double fuel, double consumption, double tankCapacity) {
        this.setTankCapacity(tankCapacity);
        this.setFuelQuantity(fuel);
        this.setConsumption(consumption);

    }

    protected void setTankCapacity(double capacity) {
         this.tankCapacity = capacity;
    }
    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }


    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public void drive(double distance) {
       if(canDrive(distance)){
           this.setFuelQuantity(this.getFuelQuantity() - this.getConsumption()*distance);
           System.out.println(getClass().getSimpleName()+" travelled "+formatter.format(distance)+" km");
       }else{
           System.out.println(String.format("%s needs refueling"
           , getClass().getSimpleName()));
       }
    }

    @Override
    public void refuel(double fuel) {
        if(fuel <= 0){
            System.out.println("Fuel must be a positive number");
        }else if(fuel+this.getFuelQuantity() > this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        }else {
            this.fuelQuantity += fuel;
        }
    }

    public   boolean canDrive(double distance){
        return this.fuelQuantity >= this.consumption*distance;
    }

    @Override
    public String toString(){
        return String.format(": %.2f", this.getFuelQuantity());
    }
}
