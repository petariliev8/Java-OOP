package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls){
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < this.urls.size(); i++) {
            boolean isIt = false;
            for (int i1 = 0; i1 < this.urls.get(i).length(); i1++) {

                if(Character.isDigit(this.urls.get(i).charAt(i1))){
                    isIt = true;
                }
            }
            if(isIt){
                sc.append("Invalid URL!");
                sc.append(System.lineSeparator());
            }else{
                sc.append("Browsing: "+this.urls.get(i)+"!");
                sc.append(System.lineSeparator());
            }
        }

        return sc.toString();
    }

    @Override
    public String call() {
        StringBuilder sc = new StringBuilder();

        for (int i = 0; i < this.numbers.size(); i++) {
            boolean isIt = false;
            for (int i1 = 0; i1 < this.numbers.get(i).length(); i1++) {

                if (!Character.isDigit(this.numbers.get(i).charAt(i1))) {
                    isIt = true;
                }
            }
            if (isIt) {
                sc.append(String.format("Invalid number!%n"));
            } else {
                sc.append(String.format("Calling... %s%n", this.numbers.get(i)));
            }
        }
        return sc.toString();
    }
}

