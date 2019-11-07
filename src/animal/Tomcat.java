package animal;

public class Tomcat extends Cat {
    private final static String GENDER = "Male";
    private final static String SOUND = "MEOW";
    public Tomcat(String name, int age){
        super(name, age, GENDER);
    }


    public  String getSOUND() {
        return this.SOUND;
    }

    @Override
    public String produceSound(){
        return this.getSOUND();
    }
}
