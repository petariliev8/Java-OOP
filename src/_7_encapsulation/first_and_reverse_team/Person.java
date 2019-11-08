public class Person implements Comparable<Person> {
private String firstName;
private String lastName;
private int age;
private double salary;

public Person(){

        }
public Person(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this. lastName = lastName;
        this.age = age;
        this.salary = salary;
        }

public String getFirstName() {
        return firstName;
        }

public void setFirstName(String firstName) {
        if(firstName.length() < 3){
        throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
        }

public String getLastName() {
        return lastName;
        }

public void setLastName(String lastName) {
        if(lastName.length() < 3){
        throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
        }

public int getAge() {

        return age;
        }

public void setAge(int age) {
        if(age <= 0){
        throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
        }

public double getSalary() {
        return salary;
        }

public void setSalary(double salary) {
        if(salary < 460){
        throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
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
