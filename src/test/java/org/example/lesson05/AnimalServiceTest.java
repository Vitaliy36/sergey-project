package org.example.lesson05;

import org.junit.Assert;
import org.junit.Test;

public class AnimalServiceTest {

    AnimalService animalService = new AnimalService();

//    @Test
//    public void getDogsWeightLabradorSuccessIfExist() {
//        System.out.println(animalService.getDogs());
//        int actual = animalService.findWeight("Labrador");
//        int expected = 25;
//        Assert.assertEquals(expected, actual);
//    }
    @Test
    public void getDogsWeightErrorIfNotExist() {
        int actual = animalService.findWeight("Chao-Chao");
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSay() {
        animalService.printAnimalSay();
    }




    @Test
    public void calculateFeedSizePomeranian() {
        int actual = animalService.calculateFeedSize(new Dog("Snow", "Pomeranian", 5, 10));
        int expected = 190;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculateFeedSizeCountryDog() {
        int actual = animalService.calculateFeedSize(new Dog("Tyzik", "Country Dog", 10, 15));
        int expected = 80;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculateFeedSizeLabrador() {
        int actual = animalService.calculateFeedSize(new Dog("Hunter", "Labrador", 25, 2));
        int expected = 160;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculateFeedSizeLabrador2() {
        int actual = animalService.calculateFeedSize(new Dog("Hunter2", "Labrador", 25, 5));
        int expected = 250;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculateFeedSizeWrongBreed() {
        int actual = animalService.calculateFeedSize(new Dog("Hunter", "Shepherd", 25, 2));
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getBreedByName() {
        String actual = animalService.findBreed("Snow");
        String expected = "Pomeranian";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenAgeCategoryPUPPY_thenDogCannotSwim() {
        boolean actual = animalService.canDogSwim(new Dog("Hunter", "Shepherd", 25, 2));
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void whenAgeCategoryADULT_thenDogCanSwim() {
        boolean actual = animalService.canDogSwim(new Dog("Snow", "Shepherd", 25, 5));
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

}