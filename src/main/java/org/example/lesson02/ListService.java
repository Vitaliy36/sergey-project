package org.example.lesson02;

import java.util.List;

public class ListService {
    public int getQuantityOfNumber(List<Integer> inputList, int x) {
        //[8, 7, 3, 7, 11, 7, 3]
        //x = 7
        int quantity = 0;
        for (Integer element : inputList) {
            if (element == x) {
                quantity++;
            }
        }
        return quantity;
    }
}
