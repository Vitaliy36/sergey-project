package org.example.lesson05;

public class Rectangle {
    private int sideA;
    private int sideB;

    public int calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
    public int calculateSquare() {
        return sideA * sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
