package Homework4.Task5;

public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Shuppy", Breed.valueOf("Poodle".trim().toUpperCase()), 19);
        Dog dog2 = new Dog("Maxy", Breed.valueOf("Poodle".trim().toUpperCase()), 19);
        Dog dog3 = new Dog("Shuppy", Breed.valueOf("Retriever".trim().toUpperCase()), 13);
        Dog[] dogs = {dog1, dog2, dog3};

        if (dog1.isThereTwoDogsWithSameName(dogs))
            System.out.println("There are two dogs with same name");
        else
            System.out.println("All names are unique");

        System.out.println("The oldest dog:\n" + dog1.getTheOldestDog(dogs));
    }
}
