package food_shortage;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String , Buyer> people = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input =
                    sc.nextLine().split("\\s+");

            if (input.length == 3) {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String group = input[2];

                Buyer rebel = new Rebel(name, age, group);
                people.put(name, rebel);
            } else {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];
                String birthDate = input[3];

                Buyer current = new Citizen
                        (name, age, id, birthDate);
                people.put(name, current);
            }


        }
        int allFood = 0;
        String names = sc.nextLine();
        while (!names.equals("End")){
//            c = (a < b) ? a : b;
        if(people.containsKey(names)){
            people.get(names).buyFood();
            allFood = people.get(names).getFood();
        }

            names = sc.nextLine();
        }

        int food =
                people.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(food);


    }

}
