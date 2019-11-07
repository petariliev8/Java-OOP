package _3_working_with_abstractions_exercise._3_Cards_With_Power_;

public enum  CardsWithPower {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX (6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    public int index;

     CardsWithPower(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
