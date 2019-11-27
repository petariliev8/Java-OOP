package vehicles_extension;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl {
    private static final double AC_EXTRA = 1.4;
   
    private static final DecimalFormat formatter = new DecimalFormat("###.#");
    public Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel,  (consumption+AC_EXTRA), tankCapacity);
    }

    public void driveEmpty(double distance) {
        super.setConsumption(super.getConsumption() - AC_EXTRA);
        super.drive(distance);
        super.setConsumption(super.getConsumption() + AC_EXTRA);
    }


    @Override
    public String toString(){
        return String.format("Bus"+super.toString());
    }
}
