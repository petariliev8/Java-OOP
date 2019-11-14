package say_hello_extended;

public class Bulgarian extends BasePerson {
    private String name;

    public Bulgarian(String name){
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
