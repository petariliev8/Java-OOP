package _3_working_with_abstractions.Hotel_Reservation_with_ENUM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

        PriceCalculator calculator  = new PriceCalculator(pricePerDay, days, season, discountType);
        calculator.calculate();


    }
}
