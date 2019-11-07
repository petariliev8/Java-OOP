package _3_WORKING_WITH_ABSTRACTION_EXERCISE._6_Greedy_Times_;

import java.util.Map;

public class ValuesOfEachType {
  public static long quantity (Map<String, Map<String, Long>> bag, String type){
    return   bag.get(type).values().stream().mapToLong(e -> e).sum();
  }
}
