package garage;

public class Car extends VehicleImpl {
    private static final double AC = 0.9;

    public Car(double fuel, double consumption) {
        super(fuel, (consumption+AC));
    }
    @Override
    public void refuel(double fuel) {
       super.setFuelQuantity(super.getFuelQuantity()+fuel);
    }
    @Override
    public String toString(){
        return String.format("Car: "+super.toString());
    }
}
