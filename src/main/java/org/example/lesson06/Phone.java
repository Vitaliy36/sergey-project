package org.example.lesson06;

import java.util.Arrays;
import java.util.List;

public class Phone {
    static int count;

    private String number;
    private String model;
    private int weight;

    public Phone(String n, String m, int w) {
        this(n, m); // call constructor with two params. We use it for convenience
        this.weight = w;
    }

    public Phone(String n, String m) {
        this.number = n;
        this.model = m;
        count++;
    }

    public Phone() {
        count++;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " Number: " + number);
        System.out.println("My number " + this.number);

    }

//    public void sendMessage(String... phoneNumbers){
//        for (String phoneNumber : phoneNumbers) {
//            System.out.println(phoneNumber);
//        }

    public List<String> sendMessage(String... phoneNumbers) {
        List<String> list = Arrays.asList(phoneNumbers);
        return list;
    }

    public String getNumber() {
        return number;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight + '\'' +
                ", count=" + count +
                '}';
    }
}
