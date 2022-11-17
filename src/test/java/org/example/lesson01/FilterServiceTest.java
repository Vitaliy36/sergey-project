package org.example.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FilterServiceTest {
    FilterService filterService = new FilterService();

    @Test
    public void removeLessThenParam() {
        List<Integer> input = Arrays.asList(1, 15, 5, 27, 10, 33);
        int maxValue = 11;
        List<Integer> result = filterService.removeLessThenParam(input, maxValue);
        Assert.assertEquals(Integer.valueOf(15), result.get(0));
        Assert.assertEquals(Integer.valueOf(27), result.get(1));
        Assert.assertEquals(Integer.valueOf(33), result.get(2));
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void getMaxElement() {
        List<Integer> input = Arrays.asList(1, 15, 5, 27, 10, 33);
        int result = filterService.getMaxElement(input);
        Assert.assertEquals(33, result);
    }
    @Test
    public void getMaxElement1() {
        List<Integer> input = Arrays.asList(1, -15, 5, 27, 3456789, 10, 33, -300, 10000);
        int result = filterService.getMaxElement(input);
        Assert.assertEquals(3456789, result);
    }
}