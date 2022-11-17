package org.example.lesson02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListServiceTest {

    ListService listService = new ListService();

    @Test
    public void getQuantityOfNumber7() {
       //[8, 7, 3, 7, 11, 7, 3]
        //x = 7
        List<Integer> testList = Arrays.asList(8, 7, 3, 7, 11, 7, 3);
        int x = 7;
        int actual = listService.getQuantityOfNumber(testList, x);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void getQuantityOfNumber3() {
        List<Integer> testList = Arrays.asList(8, 7, 3, 7, 11, 7, 3);
        int x = 3;
        int actual = listService.getQuantityOfNumber(testList, x);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void getQuantityOfNumber9() {
        List<Integer> testList = Arrays.asList(8, 7, 3, 7, 11, 7, 3);
        int x = 9;
        int actual = listService.getQuantityOfNumber(testList, x);
        int expected = 0;
        assertEquals(expected, actual);
    }
}