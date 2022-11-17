package org.example.lesson01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    @Test
    public void nightTest() {
        Time time = new Time();
        String expected = "Night";
        String actual = time.getTime(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void morningtTest() {
        Time time = new Time();
        String expected = "Morning";
        String actual = time.getTime(7);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void dayTest() {
        Time time = new Time();
        String expected = "Day";
        String actual = time.getTime(13);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eveningTest() {
        Time time = new Time();
        String expected = "Evening";
        String actual = time.getTime(19);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nonexistentTimeTest() {
        Time time = new Time();
        String expected = "Error";
        String actual = time.getTime(25);
        Assert.assertEquals(expected, actual);
    }
}