package border_control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Citizen> citizens = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();

        String[] input = sc.nextLine().split("\\s+");
        while (!input[0].equals("End")) {
            if (input.length == 2) {
                String nameRobot = input[0];
                String model = input[1];
                Robot robot = new Robot(nameRobot, model);
                robots.add(robot);
            } else {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];

                Citizen citizen = new Citizen(name, age, id);
                citizens.add(citizen);

            }

            input = sc.nextLine().split("\\s+");
        }
        int num = Integer.parseInt(sc.nextLine());
        for (Citizen citizen : citizens) {
            if (citizen.getId().substring(citizen.getId().length() - String.valueOf(num).length()).equals(String.valueOf(num))) {
                System.out.println(citizen.getId());
            }
        }
        for (Robot robot : robots) {
            if (robot.getId().substring(robot.getId().length() - String.valueOf(num).length()).equals(String.valueOf(num))) {
                System.out.println(robot.getId());
            }
        }

    }
}
