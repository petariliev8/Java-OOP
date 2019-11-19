package garage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String[] carInfo = sc.nextLine().split("\\s+");
        double carFuel = Double.parseDouble(carInfo[1]);
        double carConsumption = Double.parseDouble(carInfo[2]);

        Vehicle car = new Car(carFuel, carConsumption);

        String[] truckInfo = sc.nextLine().split("\\s+");
        double truckFuel = Double.parseDouble(truckInfo[1]);
        double truckConsumption = Double.parseDouble(truckInfo[2]);

        Vehicle truck = new Truck(truckFuel, truckConsumption);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");

            switch (input[0]){
                case "Drive":
                    if(input[1].equals("Car")){
                        double distance = Double.parseDouble(input[2]);
                        car.drive(distance);
                    }else{
                        double distance = Double.parseDouble(input[2]);
                        truck.drive(distance);
                    }

                    break;
                case "Refuel":
                    if(input[1].equals("Car")){
                        double fuel = Double.parseDouble(input[2]);
                        car.refuel(fuel);
                    }else{
                        double fuel = Double.parseDouble(input[2]);
                        truck.refuel(fuel);
                    }
                    break;


            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
