package _3_WORKING_WITH_ABSTRACTION_EXERCISE._6_Greedy_Times_;

import java.util.Collection;
import java.util.Map;

public class WrongInput {
    public static long outOfCapacity(Map<String, Map<String, Long>> backPack, long input){
        return backPack.values()
                .stream()
                .map(Map::values)
                .flatMap(Collection::stream)
                .mapToLong(e -> e)
                .sum() + input;

    }

}
