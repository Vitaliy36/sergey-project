package org.example.lesson02;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

public class MyListServiseTest {

    MyListServise myListServise = new MyListServise();

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void getElementByPosition3() {
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        String actual = myListServise.getValueX(3, testList);
        String expected = "brother";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getElementByPosition4() {
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        String actual = myListServise.getValueX(4, testList);
        String expected = "sister";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getElementByPosition0ShouldThrowException() {
        expectedEx.expect(ArrayIndexOutOfBoundsException.class);
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        myListServise.getValueX(0, testList);
    }
    @Test
    public void getQuantityOfStringMother() {
        //["mother", "father", "brother", "sister", "mother", "daughter", "son", "mother" "daughter"]
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        String searchWord = "mother";
        int actual = myListServise.getQuantityOfString(testList, searchWord);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getQuantityOfStringSister() {
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        String x = "daughter";
        String actual = String.valueOf(myListServise.getQuantityOfString(testList, x));
        String expected = String.valueOf(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getQuantityOfStringGrandfather() {
        List<String> testList = Arrays.asList("mother", "father", "brother", "sister", "mother", "daughter", "son", "mother", "daughter");
        String x = "grandfather";
        String actual = String.valueOf(myListServise.getQuantityOfString(testList, x));
        String expected = String.valueOf(0);
        Assert.assertEquals(expected, actual);
    }
}