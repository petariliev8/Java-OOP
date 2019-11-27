package vehicles_extension;

public class Car extends VehicleImpl {
    private static final double AC = 0.9;

    public Car(double fuel, double consumption, double capacity) {
        super(fuel, (consumption+AC), capacity);
    }
    @Override
    public String toString(){
        return String.format("Car"+super.toString());
    }
}
