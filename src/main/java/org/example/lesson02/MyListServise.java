package org.example.lesson02;

import java.util.List;

public class MyListServise {
    //3 подсчитать сколько раз встречается слово word в списке
    // List<String> int getQuantityOfNumber(List<String> inputList, String searchWord )
    //example: (“mama”, “papa”, “mama”), searchWord = “mama”
    public int getQuantityOfString(List<String> stringList, String searchWord) {
        int quantity = 0;
        for (String element : stringList) {
            if (element.equals(searchWord)) {
                quantity++;
            }
        }
        return quantity;
    }

    public String getValueX(int i, List<String> inputList) {
        return inputList.get(i-1);
    }
}
