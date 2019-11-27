package vehicles_extension;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String,Vehicle > garage = new HashMap<>();
        garage.put("Car", newVehicleData("Car", sc.nextLine()));
        garage.put("Truck", newVehicleData("Truck", sc.nextLine()));
        garage.put("Bus", newVehicleData("Bus", sc.nextLine()));

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String type = input[1];
            switch (input[0]){
                case "Drive":
                    double distance = Double.parseDouble(input[2]);
                    garage.get(type).drive(distance);
                    break;
                case "Refuel":
                    double fuel = Double.parseDouble(input[2]);
                    garage.get(type).refuel(fuel);
                    break;
                case "DriveEmpty":
                        double distance1 = Double.parseDouble(input[2]);
                        garage.get("Bus").drive(distance1);

                    break;

            }
        }
        System.out.println(garage.get("Car"));
        System.out.println(garage.get("Truck"));
        System.out.println(garage.get("Bus"));
    }

    private static Vehicle newVehicleData(String kindCar, String nextLine) {
        String[] carInfo = nextLine.split("\\s+");
        double fuel = Double.parseDouble(carInfo[1]);
        double consumption = Double.parseDouble(carInfo[2]);
        double tankCapacity = Double.parseDouble(carInfo[3]);
      Vehicle current;
        if(kindCar.equals("Car")){
            current = new Car(fuel, consumption, tankCapacity);
        }else if(kindCar.equals("Truck")) {
            current = new Truck(fuel, consumption, tankCapacity);
        }else{
            current = new Bus(fuel, consumption, tankCapacity);

        }
        return current;

    }


}
