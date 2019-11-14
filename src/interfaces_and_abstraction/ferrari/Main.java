package ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

       Ferrari ferrari = new Ferrari(name);
        System.out.println(ferrari);



    }
}
