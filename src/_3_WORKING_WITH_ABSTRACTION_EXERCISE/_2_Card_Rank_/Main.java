package _3_working_with_abstractions_exercise._2_Card_Rank_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Card Ranks:");

        for (CardRank value : CardRank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n"
            , value.ordinal(), value.toString());
        }
    }
}
