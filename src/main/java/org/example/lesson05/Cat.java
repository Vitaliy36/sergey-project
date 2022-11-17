package org.example.lesson05;

public class Cat extends Animal {

    public static int DEFAULT_FEED_SIZE = 30; // Constanta
    private AgeCategory ageCategory;



    public Cat(String name, String breed, int weight, int age) {
        super(name, breed, weight);
        super.setAge(age);
        setAgeCategory(age);
    }


    public String say() {
        return "may may";
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
            ageCategory = AgeCategory.KITTY;
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
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", breed='" + super.getBreed() + '\'' +
                ", weight=" + super.getWeight() +
                ", age=" + super.getAge() +
                ", ageCategory=" + ageCategory +
                '}';
    }
}
