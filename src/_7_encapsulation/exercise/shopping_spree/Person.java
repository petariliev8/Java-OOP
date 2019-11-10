import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

private String name;
private double money;
private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name1) {
       if( name1 != null && name1.trim().length() != 0 ){
           this.name = name1.trim();

       }else{
           throw new IllegalArgumentException("Name cannot be empty");
       }

    }

    private void setMoney(double money1) {
        if(money1 < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money1;
    }

    public String getName() {
        return this.name;
    }
    public void buyProduct(Product product1){
        if(this.money - product1.getCost() < 0) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product1.getName()));
        }
      if(canIAfford(product1) ){
          this.products.add(product1);
          System.out.println(String.format("%s bought %s",this.name, product1.getName()));
          setMoney(this.money - product1.getCost());
      }else{
          System.out.println(String.format("%s can't afford %s",this.name, product1.getName()));

      }
    }

    private boolean canIAfford(Product product1) {
        return   this.money - product1.getCost() >= 0;

    }

    @Override
    public String toString(){

        String s = this.products.stream().map(Object::toString).collect(Collectors.joining(", "));

        if(s.isEmpty()){
            return "Nothing bought";
        }

        return s;
    }
}

