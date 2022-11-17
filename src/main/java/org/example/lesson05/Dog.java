package org.example.lesson05;

public class Dog  extends Animal {

    public static int DEFAULT_FEED_SIZE = 30; // Constanta
    private AgeCategory ageCategory;



    public Dog(String name, String breed, int weight, int age) { // This is Dog's constructor
        super(name, breed, weight); // we use (name, breed, weight) to call constructor from Animal class
        super.setAge(age); // we use .setAge to call method from Animal class
        setAgeCategory(age);
    }


    @Override  //=> This is mean polimarfizm
    public String say() {
        return "gav gav";
    }

    public String whatEat() {
        return "Meat";
    }
    public boolean canDogSwim() {
        return ageCategory == AgeCategory.ADULT;
    }


    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int age) {
        if (age <= 2) {
            ageCategory = AgeCategory.PUPPY;
        }
        else if (age <= 10) {
            ageCategory = AgeCategory.ADULT;
        }
        else {
            ageCategory = AgeCategory.OLD;
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", breed='" + super.getBreed()  + '\'' +
                ", weight=" + super.getWeight() +
                ", age=" + super.getAge() +
                ", ageCategory=" + ageCategory +
                '}';
    }
}
