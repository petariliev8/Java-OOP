package _3_working_with_abstractions.Student_System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        while (true)
        {
            String input = scanner.nextLine();
            if (input.equals("Exit")){
                break;
            }
            studentSystem.ParseCommand(input);
        }
    }
}
