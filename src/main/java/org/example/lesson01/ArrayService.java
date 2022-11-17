package org.example.lesson01;

public class ArrayService {
    public int maxValue(Integer[] arrayNum) {
        int maxNum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            Integer value = arrayNum[i];
            if (value == null) {
                break;
            }
            if (value > maxNum) {
                maxNum = value;
            }
        }
        return maxNum;
    }

}

