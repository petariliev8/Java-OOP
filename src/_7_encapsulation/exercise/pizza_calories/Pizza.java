import java.util.ArrayList;

import java.util.List;

public class Pizza {

    private String name;
    private Dough dought;
    private int numberOfToppings;
    private List<Topping> toppings;


    public Pizza(String name1, int numberOfToppings1) {
        this.setName(name1);
        this.setToppings(numberOfToppings1);
        this.setNumberOfToppings(numberOfToppings1) ;
    }

    private void setName(String name1) {
        if (name1 == null
                || name1.trim().length() == 0
                || name1.trim().length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name1;
    }

    private void setToppings(int numbersOfToppings) {
        if (numbersOfToppings < 0 || numbersOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }

    private void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public void setDough(Dough dough1) {
        this.dought = dough1;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping){

        if(this.toppings.size() < this.numberOfToppings){
            this.toppings.add(topping);
        }
    }

    public double getOverallCalories (){
      double sum = 0;
        for (Topping topping : this.toppings) {
           sum += topping.calculateCalories();
        }
        sum += this.dought.calculateCalories();
        return sum;
    }
    @Override
    public String toString() {
        return String.format("%s - %.2f", this.getName(), this.getOverallCalories());
    }
}

