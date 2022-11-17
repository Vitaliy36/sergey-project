package org.example.lesson01;

import java.util.ArrayList;
import java.util.List;

public class FilterService {

    public List<Integer> removeLessThenParam(List<Integer> input, int minValue) {
        List<Integer> result = new ArrayList<>();
        for (Integer element : input) {
            if (element >= minValue) {
                result.add(element);
            }
        }
        return result;
    }

    // список int, найти макс элемент int getMaxElement(List<Integer input);
    public int getMaxElement(List<Integer> input) {
        int maxElement = 0;
        for (Integer element : input) {
            if (element >= maxElement) {
                maxElement = element;
            }
        }
        maxElement = input.get(input.size()-1);
        return maxElement;
    }
}
