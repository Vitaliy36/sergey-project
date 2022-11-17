package org.example.lesson06;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }
   public Person(String fn, int a) {
        this.fullName = fn;
        this.age = a;
    }

    public String getFullName(){
       return fullName;
    }
    public void setFullName(String fullName) {
       this.fullName = fullName;
    }
    public int getAge() {
       return age;
    }
    public void setAge(int age) {
       this.age = age;
    }

    public void move() { // Can we or can not use variable name (fullName) instead method name (namePerson3)?
        System.out.println(fullName + " still in good shape");

    }

    public void talk(String namePerson2) {
        System.out.print("Talking " + fullName + " and " + namePerson2);
    }

    public String findAgeCategory() {
        String ageCategory;
        if (age <= 100) {
            ageCategory = "Young";
        } else if (age <= 300) {
            ageCategory = "Adult";
        }
        else {
            ageCategory = "Old";
        }
        return ageCategory;
    }


    @Override
    public String toString() {
        return "Person{" + fullName + " is " +
                 age + " years old" +
                '}';
    }
}
