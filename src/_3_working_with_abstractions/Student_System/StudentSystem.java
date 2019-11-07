package _3_working_with_abstractions.Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem()
    {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String args)
    {

        String[] input = args.split(" ");

        if (input[0].equals("Create")) {
            addStudent(input);
        }
        else if (input[0].equals("Show")) {
            showStudent(input);

        }
    }

    private void showStudent(String[] input) {
        String name = input[1];
        if (repo.containsKey(name)) {
            Student student = repo.get(name);
            print (student);
        }
    }

    private void print(Student student) {
        String view = String.format("%s is %d years old.",student.getName(),student.getAge());

        if (student.getGrade() >= 5.00)
        {
            view += " Excellent student.";
        }
        else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50)
        {
            view += " Average student.";
        }
        else
        {
            view += " Very nice person.";
        }
        System.out.println(view);
    }

    private void addStudent(String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade =Double.parseDouble(input[3]);

        Student student = new Student(name, age, grade);
        repo.putIfAbsent(name,student);
    }

}
