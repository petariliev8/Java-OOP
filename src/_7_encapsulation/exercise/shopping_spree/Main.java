import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] input = sc.nextLine().replaceAll(" ","").split(";");
        for (int i = 0; i < input.length; i++) {

            String[] data = input[i].replaceAll(" ","").split("=");

                String name = data[0];
                double money = Double.parseDouble(data[1]);
                Person person = new Person(name, money);
                people.put(name, person);


        }
        String[] input2 = sc.nextLine().replaceAll(" ","").split(";");
        for (int i = 0; i < input2.length; i++) {
            String[] data = input2[i].replaceAll(" ","").split("=");

                String name = data[0];
                double cost = Double.parseDouble(data[1]);
                Product product = new Product(name, cost);
                products.put(name, product);



        }

        String eachProduct = sc.nextLine();
        while (!eachProduct.equals("END")) {
            String[] data = eachProduct.split("\\s+");
            String currentPerson = data[0];
            String currentProduct = data[1];
                if(people.containsKey(currentPerson) && products.containsKey(currentProduct)){
                    people.get(currentPerson).buyProduct(products.get(currentProduct));
                }


            eachProduct = sc.nextLine();
        }

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getKey() +" - "+entry.getValue());
        }


    }
}
