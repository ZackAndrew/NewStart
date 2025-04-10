package Homework4.Task5;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public boolean isThereTwoDogsWithSameName(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getTheOldestDog(Dog[] dogs) {
        Dog theOldestDog = dogs[0];
        for (Dog d : dogs)
            if (d.getAge() > theOldestDog.getAge()) {
                theOldestDog.setAge(d.getAge());
            }
        return "Breed: " + theOldestDog.getBreed() + " Name: " + theOldestDog.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed.name() +
                ", age=" + age +
                '}';
    }
}
