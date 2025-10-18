import java.util.*;

public class FilterField {

    // Person class
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Example input
        List<Person> people = Arrays.asList(
            new Person("Alice", 17),
            new Person("Bob", 20),
            new Person("Charlie", 18),
            new Person("David", 15)
        );

        // Call your method
        List<String> adultNames = getAdultNames(people);

        // Print result
        System.out.println(adultNames);
    }
    
    public static List<String> getAdultNames(List<Person> people) {
        ArrayList<String> a = new ArrayList<>();
        for (int i =0; i < people.size(); i++){
            if(people.get(i).age >= 18){
                a.add(people.get(i).name);
            }
        }
        return a;
    }
}