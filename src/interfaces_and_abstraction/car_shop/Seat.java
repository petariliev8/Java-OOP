package car;

public class Seat implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String produced;

    public Seat(String model, String color, Integer horsePower, String produced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.produced = produced;
    }

    public Seat() {

    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires"
                , this.model
                , this.produced
                , Car.TIRES);
    }
}
