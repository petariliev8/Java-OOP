package animals;

public abstract class Animal {
   private String name;
   private  String favouriteFood;

   Animal(String name, String favouriteFood){
      this.setName(name);
       this.setFavouriteFood(favouriteFood);
   }

    private void setName(String name) {
        this.name = name;
    }

    private void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String explainSelf(){
     return   String.format
                        ("I am %s and my favourite food is %s",this.getName(), this.getFavouriteFood());
    }

}
