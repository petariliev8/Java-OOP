public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if(toppingType == null){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        if ( !toppingType.toLowerCase().equals("meat")
                && !toppingType.toLowerCase().equals("veggies")
                && !toppingType.toLowerCase().equals("cheese")
                && !toppingType.toLowerCase().equals("sauce")) {

            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private String getToppingType() {
        return toppingType;
    }

    private double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(this.getToppingType() + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2
                * toppingCalories(this.toppingType);
    }

    private double toppingCalories(String topping) {
        double cal = 0;
        if (topping.toLowerCase().equals("meat")) {
            cal = 1.2;
        } else if (topping.toLowerCase().equals("veggies")) {
            cal = 0.8;
        } else if (topping.toLowerCase().equals("cheese")) {
            cal = 1.1;
        } else if (topping.toLowerCase().equals("sauce")) {
            cal = 0.9;
        }
        return cal;
    }

}
