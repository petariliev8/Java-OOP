public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firtsName,String lastName,int age){
        this.firstName = firtsName;
        this. lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firtsName) {
        this.firstName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old."
        , this.firstName
        , this.lastName
        , this.age);
    }

    @Override
    public int compareTo(Person o) {
        int sComp = this.getFirstName().compareTo(o.getFirstName());

        if (sComp != 0) {
            return sComp;
        } else {
            return Integer.compare(getAge(), o.getAge());
        }

    }
}
