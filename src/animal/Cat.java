package animal;

public class Cat extends Animal {
    private final static String SOUND = "Meow meow";

    public Cat(String name, int age, String gender){
        super(name, age, gender);
    }

    public String getSOUND() {
        return SOUND;
    }

    @Override
    public String produceSound(){
        return this.getSOUND();
}

}
