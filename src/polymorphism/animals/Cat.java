package animals;

public class Cat extends Animal {

    Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
            return String
                    .format("%s%n%s",super.explainSelf(),"MEEOW");
    }
}
