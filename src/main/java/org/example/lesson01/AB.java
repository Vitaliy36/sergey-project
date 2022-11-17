package org.example.lesson01;

public class AB {

    public String abMethod(String input) {
        //How to write code with a method ignoreCase()?
        if (input.contains("a") && input.contains("b")) {
            return "1,2";
        } else if (input.contains("a") || input.contains("A")) {
            return "1";
        } else if (input.contains("b") || input.contains("B")){
            return "2";
        }
        return "999";
    }
}
