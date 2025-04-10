package Homework8.Task1;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Student(new FullName("Andrii", "Zakordonskyi"), 19, 2);
        Person person2 = new Student(new FullName("Dima", "Zakordonskyi"), 25, 8);

        // info about person1
        System.out.println(person1.info());
        System.out.println(person1.activity());

        // info about person2
        System.out.println(person2.info());
        System.out.println(person2.activity());

        // clone person 1
        Person clonedStudent = person1.clone();

        //change course
        ((Student) clonedStudent).setCourse(3);

        // output information about cloned obj
        System.out.println(clonedStudent.info());
    }
}
