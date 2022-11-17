package org.example.lesson02;

import java.util.List;

public class HWTasks4 {
    //4 Service в нем метод который возводит число в квадрат (извлекает корень).
    // public int getSquareOf(int x),  и написать 4 теста с разными числами

    public int getSquareOf(int x) {
        return x * x;
    }

    //4 Вернуть позицию буквы А public int getSymbolPosition(String input).
    // symbol=”o”,  ”mother” -> return 2;

    public int getSymbolPosition(String input, char symbol) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                return i +1;
            }
        }
        return -1 ;
    }

    //4 Написать метод который берет список String , и меняет два последних элемента местами.
    // ”11”,”22”, ”33” - ”11”, ”33”, ”22”
    public List<String> swapLastTwoElements(List<String> inputList) {
        int size = inputList.size();
        String temp = inputList.get(size -1);
        inputList.set(size -1, inputList.get(size -2));
        inputList.set(size -2, temp);
      //  Collections.swap(inputList, size - 1, size - 2);
        return inputList;
    }
    public void swapAB(int a, int b){
        int c = a;
        a = b;
        b = c;

    }

}
