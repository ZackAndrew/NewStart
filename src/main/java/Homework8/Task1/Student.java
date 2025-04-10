package Homework8.Task1;

public class Student extends Person  implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return "First name: " + fullName.getFirstName() + " Last name: " + fullName.getLastName() + " Age:" + age + " course: " + course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Student clone(){
        FullName clonedName = (new FullName(fullName.getFirstName(), fullName.getLastName()));
        return new Student(clonedName, age, course);
    }
}
