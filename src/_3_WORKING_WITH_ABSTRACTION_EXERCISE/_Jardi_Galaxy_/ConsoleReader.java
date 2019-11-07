package _3_working_with_abstractions_exercise._Jardi_Galaxy_;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader() {
        this.scanner = new Scanner(System.in);
    }

    public String readLine() {
        return this.scanner.nextLine();
    }
}
