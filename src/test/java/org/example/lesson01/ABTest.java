package org.example.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class ABTest {
    AB ab = new AB();

    @Test
    public void inputContainsA() {
        String actual = ab.abMethod("Training");
        Assert.assertEquals("1", actual);
    }
    @Test
    public void inputContainsB() {
        String actual = ab.abMethod("book");
        Assert.assertEquals("2", actual);
    }
    @Test
    public void inputNotContainsAorB() {
        String actual = ab.abMethod("Revere");
        Assert.assertEquals("999", actual);
    }
    @Test
    public void inputContainsAandB() {
        String actual = ab.abMethod("Abashedly");
        Assert.assertEquals("1,2", actual);
    }
}
