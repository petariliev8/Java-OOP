package _5_Jadi_Galaxy_;

import java.util.Arrays;

public class Parser {
    public static int[] parser (String input){
        return  Arrays
                .stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
