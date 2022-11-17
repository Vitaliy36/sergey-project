package org.example.lesson02;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeServiceTest {

    TimeService timeService = new TimeService();

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void nightTest() {
        PartOfDay expected = PartOfDay.NIGHT;
        PartOfDay actual = timeService.getTime(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dayTest() {
        PartOfDay expected = PartOfDay.DAY;
        PartOfDay actual = timeService.getTime(13);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nonexistentTimeTest() {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("Non Existing time");
        timeService.getTime(25);
    }




    @Test
    public void shouldThrowRuntimeExceptionWhenEmployeeIDisNull() throws Exception {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("Employee ID is null");

        // do something that should throw the exception...
        System.out.println("=======Starting Exception process=======");
        throw new NullPointerException("Employee ID is null");
    }
}