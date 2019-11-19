package garage;

public class Truck extends VehicleImpl {
    private static final double AC = 1.6;

    public Truck(double fuel, double consumption) {
        super(fuel, (consumption+AC));
    }

    @Override
    public void refuel(double fuel) {
        this.setFuelQuantity(super.getFuelQuantity()+fuel*0.95);
    }
    @Override
    public String toString(){
        return String.format("Truck: "+super.toString());
    }
}
