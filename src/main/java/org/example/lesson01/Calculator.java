package org.example.lesson01;

public class Calculator {

    //Написать класс калькулятор в котором три метода (+ * /) параметр int, в каждом методе будет два параметра.
    //И написать тесты на три метода

    public Integer sum(Integer a, Integer b) {
        if (a == null && b == null) {
            return 0;
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        return a + b;
    }


    public Integer multiple(Integer a, Integer b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        return a * b;
    }



    public String divide(Integer a, Integer b) {
        if (b == 0) {
            return "undefined";
        }
        return String.valueOf(a / b);
    }
}
