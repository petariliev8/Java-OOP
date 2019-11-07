package _3_working_with_abstractions;

import java.util.Scanner;

public class _1_Rhombus_Of_Stars_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
           printWhiteSpaces(n-i);
            printStars(i);
        }

        for (int i = n-1; i > 0; i--) {
            printWhiteSpaces(n-i);
            printStars(i);
        }
        
    }

    private static void newRow() {
        System.out.println();
    }

    private static void printWhiteSpaces(int i) {
        for (int i1 = 0; i1 < i; i1++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int i) {
        String stars = "";
        for (int i1 = 0; i1 < i; i1++) {
            stars += "* ";
        }
        System.out.println(stars);
    }


}

