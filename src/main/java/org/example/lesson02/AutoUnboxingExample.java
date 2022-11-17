package org.example.lesson02;

public class AutoUnboxingExample {
    public static void main(String[] args) {

        int primitive = 42;
        Integer wrapper;

        wrapper = new Integer(primitive); //Unboxing
        System.out.println(wrapper);
        printUnboxingNum(wrapper);
        printUnboxingNum(Integer.valueOf(10));

        primitive = wrapper.intValue(); // Autoboxing
        System.out.println(primitive);
        printNum(primitive);
        printNum(8);

    }

    public static void printNum(Integer value) {
        System.out.println("Object " + value);
        System.out.println(value.hashCode());
    }

    public static void printUnboxingNum(int number) {
        System.out.println("Primitive " + number);
    }

}
