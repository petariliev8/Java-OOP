package _3_working_with_abstractions_exercise._Jardi_Galaxy_;

import java.util.Arrays;

public class InputParser {
    public static int[] parseIntegerArray(String input) {
        return Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
