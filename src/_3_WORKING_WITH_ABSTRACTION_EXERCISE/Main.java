package _3_working_with_abstractions_exercise;

import _3_working_with_abstractions_exercise._1_CardSuit.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Card Suits:");

        for (CardSuit value : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n"
                    ,value.ordinal(), value);
        }

    }
}
