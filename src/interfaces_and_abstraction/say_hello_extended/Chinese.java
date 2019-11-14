package say_hello_extended;

public class Chinese extends BasePerson {
    private String name;

    public Chinese(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
