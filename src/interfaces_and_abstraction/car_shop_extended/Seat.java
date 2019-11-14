package car;

public class Seat extends CarImpl implements Sellable  {
    private String model;
    private String color;
    private Integer horsePower;
    private String produced;
    private Double price;

    public Seat(String model, String color, Integer horsePower, String produced,Double price) {
        super(model, color, horsePower, produced);
        this.price = price;

    }
    @Override
    public Double getPrice() {
        return this.price;
    }
    @Override
    public String toString(){
        return super.toString()
                +String.format
                ("%nLeon sells for %f"
                        ,this.getPrice());
    }
}
