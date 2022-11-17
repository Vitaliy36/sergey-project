package org.example.lesson01;

public class Lesson1 {

    public String concatinate(String a, String b) {
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        return a + b + ".";
    }


    public String sameWords(String a, String b) {
        if (!a.equals("Hello")) {
            a = "?";
        }
        if (!b.equals("Hello")) {
            b = "?";
        }
        return a + b + ".";
    }



    public String equalsWords(String a, String b) {
        if (a == null || b == null) {
            return "Error";
        }
        if (a.equals(b)) {
            return "Same";
        }
            return "Different";
    }




    public String wordsWithUpperCase(String a, String b) {
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        return a + " " + b + ".";
    }

}
