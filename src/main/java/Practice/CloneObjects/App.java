package Practice.CloneObjects;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(30, "Andrii");
        Person person1 = null;
        try {
            person1 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(person);
        System.out.println(person1);
        System.out.println("==============================");
        person1.name = "Dima";
        System.out.println(person);
        System.out.println(person1);
    }
}
