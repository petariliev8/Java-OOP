package _3_WORKING_WITH_ABSTRACTION_EXERCISE._6_Greedy_Times_;

public class Collect {

    public static void collector(String type, long quantity, long gold, long gems, long cash) {
        if (type.equals("Gold")) {
            gold += quantity;
        } else if (type.equals("Gem")) {
            gems += quantity;
        } else if (type.equals("Cash")) {
            cash += quantity;
        }
    }
}
