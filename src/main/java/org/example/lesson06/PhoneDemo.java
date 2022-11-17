package org.example.lesson06;

import java.util.List;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("7737011919", "IPhone", 200);
        Phone phone3 = new Phone("9315612693", "Samsung");
        Phone phone4 = new Phone("9315612693", "Samsung");

        Person person1 = new Person("Omar Hayam", 974);
        Person person2 = new Person("Taras Shewchenko", 208);
        Person person3 = new Person();

        person3.setFullName("Donald Trump");
        person3.setAge(76);
        System.out.println(person3.findAgeCategory());


        phone1.setNumber("78934556");
        phone1.setModel("Nokia");
        phone1.setWeight(50);

        System.out.println(phone1);
        phone1.setWeight(150);
        System.out.println(phone1);
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getWeight());
        System.out.println();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("----------sendMessage---------------");
        List<String> list = phone1.sendMessage("sout print " + "7737027465", "9315678945", "954637289", "14768946");
        System.out.println(list);


        phone1.receiveCall("Mother");
        phone2.receiveCall("Father");
        phone1.receiveCall("Brother", "7737459678");
        phone1.receiveCall("Wife", "7737450000");
        phone2.receiveCall("Sister", "7735557789");
        System.out.println("----------Person Class-----------");

        System.out.println(person3);
        person1.talk(person2.getFullName() + "\n"); // Why if sout down to this line than console print in one lone?
        person3.move();



//        Phone phone3 = new Phone();
//        phone3.number = "9315612693";
//        phone3.model = "Samsung";
//        phone3.weight = 240;

    }
}
