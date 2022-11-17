package org.example.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureServiceTest {
    TemperatureService temperatureService = new TemperatureService();

    @Test
    public void coldTest() {
        String expected = "Cold";
        String actual = temperatureService.getWeather(-10);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void warmTest() {
        String expected = "Warm";
        String actual = temperatureService.getWeather(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void hotTest() {
        String expected = "Hot";
        String actual = temperatureService.getWeather(20);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minimalTemperatureTest() {
        String expected = "Error";
        String actual = temperatureService.getWeather(-274);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void maxTemperatureTest() {
        String expected = "Error";
        String actual = temperatureService.getWeather(101);
        Assert.assertEquals(expected, actual);
    }


//    @Test
//    public void winterColdTest() {
//        String expected = "Cold";
//        String actual = temperatureService.getSeasonWeather(-10, 1);
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void spring() {
//        String expected = "Spring - warm";
//        String actual = temperatureService.getSeasonWeather(5, 3);
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void summer() {
//        String expected = "Summer - hot";
//        String actual = temperatureService.getSeasonWeather(21, 8);
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void autumn() {
//        String expected = "Autumn - less hot";
//        String actual = temperatureService.getSeasonWeather(6, 10);
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void temperatureAndMonthDoesNotMatches() {
//        String expected = "Temperature and Month does not matches";
//        String actual = temperatureService.getSeasonWeather(60, 5);
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void temperatureIsImpossibleForLife() {
//        String expected = "Maximum possible temperature";
//        String actual = temperatureService.getSeasonWeather(-274, 1);
//        Assert.assertEquals(expected, actual);
//    }
}
