package _3_WORKING_WITH_ABSTRACTION_EXERCISE._6_Greedy_Times_;

public class TypeElement {

    public static String type(String currentElement){
       String type = "";
        if (currentElement.length() == 3) {
            type = "Cash";
        } else if (currentElement.toLowerCase().endsWith("gem")) {
            type = "Gem";
        } else if (currentElement.toLowerCase().equals("gold")) {
            type = "Gold";
        }
        return type;
    }
}
