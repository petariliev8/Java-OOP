package _3_working_with_abstractions_exercise._3_Cards_With_Power_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numb = sc.nextLine();
        String type = sc.nextLine();

        CardsWithPower card = CardsWithPower.valueOf(numb);

        int power = suitPower.valueOf(type).getIndex()+card.getIndex();

        System.out.printf("Card name: %s of %s; Card power: %d"
                , numb, type, power);
    }

    private enum suitPower {
        CLUBS(0),
        DIAMONDS(13),
        HEARTS(26),
        SPADES(39);

        private int index;

        suitPower(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }
}
