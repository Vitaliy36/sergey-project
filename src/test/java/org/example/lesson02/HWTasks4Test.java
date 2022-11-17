package org.example.lesson02;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HWTasks4Test {

    HWTasks4 hwTasks4 = new HWTasks4();

    //Square of number
    @Test
    public void getSquareOfNumber2() {
        int actual = hwTasks4.getSquareOf(2);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getSquareOfNumber3() {
        int actual = hwTasks4.getSquareOf(3);
        int expected = 9;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getSquareOfNumber4() {
        int actual = hwTasks4.getSquareOf(4);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getSquareOfNumber0() {
        int actual = hwTasks4.getSquareOf(0);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }




    //Symbol Position
    @Test
    public void getSymbolPosition() {
        int actual = hwTasks4.getSymbolPosition("mother", 'o');
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLastSymbolPosition() {
        int actual = hwTasks4.getSymbolPosition("mother", 'r');
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNonExistingSymbolPosition() {
        int actual = hwTasks4.getSymbolPosition("mother", 's');
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }




//Swap the last two numbers
    @Test
    public void getChangedLastTwoElements() {
        List<String> listElements = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        List<String> actual = hwTasks4.swapLastTwoElements(listElements);
        List<String> expected = Arrays.asList ("mother", "father", "brother", "sister", "mother", "daughter", "son", "daughter", "mother");
        Assert.assertEquals(expected, actual);
        Assert.assertEquals("daughter", actual.get(7));
        Assert.assertEquals("mother", actual.get(8));
    }
}