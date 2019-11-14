package ferrari;

public class Ferrari implements Car {
   private String driverName;
   private static final String MODEL = "488-Spider";

   public Ferrari(String driverName){
       this.driverName = driverName;

   }
   public void setDriverName(String name){
       this.driverName = name;
   }

    public String getDriverName() {
        return driverName;
    }

    public String getMODEL() {
        return MODEL;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString(){
       return String.format
               ("%s/%s/%s/%s",
               this.getMODEL(),
                       this.brakes(),
                       this.gas(),
                       this.getDriverName());
    }
}
