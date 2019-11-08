import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            Person person = new Person();
            person.setFirstName(input[0]);
            person.setLastName(input[1]);
            person.setAge(Integer.parseInt(input[2]));
            person.setSalary(Double.parseDouble(input[3]));
            people.add(person);
        }


        Team team = new Team("Black eagle");
        for (Person person : people) {
            team.addPlayer(person);
        }
        System.out.println("First team have "+team.getFirstTeam().size()+" players");
        System.out.println("Reverse team have "+team.getReserveTeam().size()+" players");
    }

}
