package org.example.lesson01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lesson1Test {

    Lesson1 lesson1 = new Lesson1();
    @Test
    public void concatenateWithTwoNonEmptyParams() {
        String expectedValue;
        String result = lesson1.concatinate("Hello", " World");
        assertEquals("Hello World.", result);
    }
    @Test
    public void concatenateWithOneEmptyParam() {
        String expectedValue;
        String result = lesson1.concatinate(" ", "World");
        assertEquals(" World.", result);
    }
    @Test
    public void concatenateWithNullParam() {
        String expectedValue;
        String result = lesson1.concatinate(null, " Vasia");
      //  assertEquals(null + " " + "Vasia.", result);
     //   assertEquals(null + " Vasia.", result);
        assertEquals(" Vasia.", result);

    }




    @Test
    public void returnWithTwoSameWords() {
        String result = lesson1.sameWords("Hello", "Hello");
        assertEquals("HelloHello.", result);
    }
    @Test
    public void returnWithFirstDifferentWord() {
        String result = lesson1.sameWords("World", "Hello");
        assertEquals("?Hello.", result);
    }
    @Test
    public void returnWithSecondDifferentWord() {
        String result = lesson1.sameWords("Hello", "World");
        assertEquals("Hello?.", result);
    }
    @Test
    public void returnWithTwoDifferentWord() {
        String result = lesson1.sameWords("World", "Hi");
        assertEquals("??.", result);
    }



    @Test
    public void twoWordsWithUpperCase() {
        String result = lesson1.wordsWithUpperCase("HELLO", "WORLD");
        assertEquals("HELLO WORLD.", result);
    }
    @Test
    public void oneWordWithUpperCase() {
        String result = lesson1.wordsWithUpperCase("HELLO", "World");
        assertEquals("HELLO World.", result);
    }
    @Test
    public void twoWordsWithLowerCase() {
        String result = lesson1.wordsWithUpperCase("hello", "world");
        assertEquals("hello world.", result);
    }
    @Test
    public void upperCaseWithNullParam() {
        String result = lesson1.wordsWithUpperCase(null, "world");
        assertEquals(" world.", result);
    }


    @Test
    public void wordsAreSame() {
        String result = lesson1.equalsWords("Hello", "Hello");
        assertEquals("Same", result);
    }
    @Test
    public void wordsAreDifferent() {
        String result = lesson1.equalsWords("Hello", "Word");
        assertEquals("Different", result);
    }
    @Test
    public void returnError() {
        String result = lesson1.equalsWords(null, "Word");
        assertEquals("Error", result);
    }

}