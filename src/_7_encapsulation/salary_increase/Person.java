public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firtsName, String lastName, int age, double salary){
        this.firstName = firtsName;
        this. lastName = lastName;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double bonus){
        if(this.age < 30){
            setSalary(this.salary + ((bonus/100)*this.salary)/2);
        } else{
            setSalary(this.salary + (bonus/100)*this.salary);
        }

    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva"
        , this.firstName
        , this.lastName
        , this.salary);
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
