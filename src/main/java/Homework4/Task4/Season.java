package Homework4.Task4;

public enum Season {
    AUTUMN("First semester"),
    WINTER("Winter exams"),
    SPRING("Second semester"),
    SUMMER("Vacation period");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
