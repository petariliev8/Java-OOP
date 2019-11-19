package garage;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle  {
       private double fuelQuantity ;
       private double consumption;
       private static final DecimalFormat formatter = new DecimalFormat("#.##");


    public VehicleImpl(double fuel, double consumption) {
        this.fuelQuantity = fuel;
        this.consumption = consumption;
    }

    @Override
    public void drive(double distance) {

       if(canDrive(distance)){
           this.setFuelQuantity(this.getFuelQuantity()-this.getConsumption()*distance);
           System.out.println(getClass().getSimpleName()+" travelled "+formatter.format(distance)+" km");
       }else{
           System.out.println(String.format("%s needs refueling"
           ,getClass().getSimpleName()));
       }

    }

    public   boolean canDrive(double distance){
        return this.fuelQuantity >= this.consumption*distance;
    }


    @Override
    public void refuel(double fuel) {
       throw new IllegalArgumentException("Not implement");
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    @Override
    public String toString(){
        return String.format("%.2f", this.getFuelQuantity());
    }
}
