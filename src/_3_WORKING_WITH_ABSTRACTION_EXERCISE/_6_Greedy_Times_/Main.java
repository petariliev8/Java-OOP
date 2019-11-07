package _3_WORKING_WITH_ABSTRACTION_EXERCISE._6_Greedy_Times_;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Map<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long cash = 0;

        for (int i = 0; i < input.length; i += 2) {
            String currentElement = input[i];
            long quantity = Long.parseLong(input[i + 1]);

            String type = TypeElement.type(currentElement);

            if (type.equals("")) {
                continue;
            } else if (capacity < WrongInput.outOfCapacity(bag, quantity)) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gold")) {
                            if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (ValuesOfEachType.quantity(bag, type) + quantity > ValuesOfEachType.quantity(bag, "Gold")) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gem")) {
                            if (quantity > ValuesOfEachType.quantity(bag, "Gold")) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (ValuesOfEachType.quantity(bag, type) + quantity > ValuesOfEachType.quantity(bag, "Gem")) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(type)) {
                bag.put((type), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(type).containsKey(currentElement)) {
                bag.get(type).put(currentElement, 0L);
            }


            bag.get(type).put(currentElement, bag.get(type).get(currentElement) + quantity);

            Collect.collector(type, quantity, gold, gems, cash);
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}
