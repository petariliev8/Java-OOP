public class Product {
   private String name;
   private double cost;

   public Product(String name, double cost){
       this.setName(name);
       this.setCost(cost);
   }

    private void setCost(double cost1) {
        if(cost1 < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
       this.cost = cost1;
    }

    private void setName(String name1) {
        if( name1 != null && name1.trim().length() != 0 ){
            this.name = name1.trim();

        }else{
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }


    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
    @Override
    public String toString(){
       return this.getName();
    }
}
