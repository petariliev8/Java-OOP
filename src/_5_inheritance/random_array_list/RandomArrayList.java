package _5_inheritance.random_array_list;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList <T>{
private Random random = new Random();

    public  T getRandomElement(){
        int index = this.random.nextInt(super.size());
        T element = super.get(index);
        super.remove(index);
        return element;
    }
}
