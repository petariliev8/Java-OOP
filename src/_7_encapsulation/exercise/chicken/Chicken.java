import java.util.IllformedLocaleException;

public class Chicken {
    private  String name;
    private int age;

    public Chicken (String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name1){
        if(name1.isEmpty() || name1.equals("\\s+") || name1 == null){
          throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name1;
    }

    private void setAge(int age1) {
        if(age1 < 0 || age1 > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age1;
    }

    public double productPerDay(){
       return calculateProductPerDay();
    }
    private double calculateProductPerDay(){
     double perDay = 0;
        if(this.age <=5){
            perDay = 2;
        }else if(this.age>5 && this.age < 12){
           perDay = 1;
        }else{
            perDay = 0.75;
        }

        return perDay;
    }

    @Override
    public String toString (){
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day."
        , this.name, this.age, this.productPerDay());
    }
}
