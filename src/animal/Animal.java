package animal;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String produceSound(){
        return "No sound yet";
    }

    @Override

    public String toString() {
        StringBuilder st = new StringBuilder();
        return  st.append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append(this.getName()+" ").append(this.getAge()+" ").append(this.getGender()).append(System.lineSeparator())
                .append(produceSound()).toString();
    }

}
