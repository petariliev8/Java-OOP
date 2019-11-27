package vehicles_extension;

public class Truck extends VehicleImpl {
    private static final double AC = 1.6;

    public Truck(double fuel, double consumption, double capacity) {
        super(fuel, (consumption+AC),  capacity);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel*0.95);
    }
    @Override
    public String toString(){
        return String.format("Truck"+super.toString());
    }
}
