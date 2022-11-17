package org.example.lesson05;

import java.util.Arrays;
import java.util.List;

import static org.example.lesson05.Dog.DEFAULT_FEED_SIZE;

public class AnimalService {
    private List<Animal> animals;
    public AnimalService() {
        createDemoData();
    }

    private void createDemoData() {
        animals = Arrays.asList(
                new Dog("Tyzik", "Country Dog", 10, 9),
                new Dog("Hunter", "Labrador", 25, 2),
                new Dog("Snow", "Pomeranian", 5, 8),
                new Cat("Tom", "Siam", 5, 8),
                new Cat("Mursik", "Country Cat", 5, 8));
    }

    public void printAnimalSay() {
        // lines 25 & 26 are Polimorfizm
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.say());
        }
    }


    // Added method
    public boolean canDogSwim(Dog dog) {
        return dog.canDogSwim();
    }

    //Added method
    public String findBreed(String name) {
        for (Animal dog : animals){
            if (dog.getName().equals(name)) {
                return dog.getBreed();
            }
        }
        return "Breed not founded";
    }


    public int findWeight(String breed) {
        for (Animal dog : animals) {
            if (dog.getBreed().equals(breed)) {
                return dog.getWeight();
            }
        }
        return -1;
    }

//    public List<Dog> getDogs() {
//        return dogs;
//    }


    // Added comparison calculateFeedSizeWrongBreed
    public int calculateFeedSize(Dog dog) {

        if (!dog.getBreed().equals("Labrador")
                && !dog.getBreed().equals("Pomeranian")
                && !dog.getBreed().equals("Country Dog")) {
            return -1;
        }
        int feedSize = 0;
        if (dog.getBreed().equals("Labrador")){
            feedSize = DEFAULT_FEED_SIZE * 5;
        }
        else if (dog.getBreed().equals("Pomeranian")) {
            feedSize = DEFAULT_FEED_SIZE * 3;
        } else if (dog.getBreed().equals("Country Dog")) {
            feedSize = DEFAULT_FEED_SIZE * 2;
        }
        if (dog.getAgeCategory().equals(AgeCategory.PUPPY)) {
            feedSize += 10;
        } else if (dog.getAgeCategory().equals(AgeCategory.ADULT)) {
            feedSize += 100;
        } else if (dog.getAgeCategory().equals(AgeCategory.OLD)) {
            feedSize += 20;
        }
        return feedSize;
    }

}