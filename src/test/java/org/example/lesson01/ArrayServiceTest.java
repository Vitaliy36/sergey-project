package org.example.lesson01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    private ArrayService arrayService = new ArrayService();

    @Test
    public void maxValueTest() {
        Integer [] testArray = {45, 23, 100, 6, 1, 23, 789};
        Integer expected = 789;
        Integer actual = arrayService.maxValue(testArray);
        assertEquals(expected, actual);
    }

}