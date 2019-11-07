package animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("Beast!")){
            String[] arr = sc.nextLine().split("\\s+");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = "";
            if(age>0) {



                if (arr.length == 2) {
                    name = arr[0];

                    if (input.equals("Kitten")) {

                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                    } else if (input.equals("Tomcat")) {

                        Tomcat tom = new Tomcat(name, age);
                        System.out.println(tom);
                    } else {
                        System.out.println("Invalid input!");
                    }
                } else if (arr.length == 3) {
                    name = arr[0];
                    age = Integer.parseInt(arr[1]);
                    gender = arr[2];


                    switch (input) {
                        case "Dog":
                            Dog dog = new Dog(name, age, gender);
                            System.out.println(dog);

                            break;
                        case "Cat":
                            Cat cat = new Cat(name, age, gender);
                            System.out.println(cat.toString());
                            break;
                        case "Frog":
                            Frog frog = new Frog(name, age, gender);
                            System.out.println(frog);
                            break;
                        case "Tomcat":
                            Tomcat tom = new Tomcat(name, age);
                            System.out.println(tom);
                            break;
                        case "Kitten":
                            Kitten kitty = new Kitten(name, age);
                            System.out.println(kitty);
                            break;


                    }


                } else {
                    System.out.println("Invalid input!");

                }


            }else{
                System.out.println("Invalid input!");
            }
            input = sc.nextLine();
        }
    }
}
