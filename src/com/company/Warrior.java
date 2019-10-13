package com.company;

public class Warrior extends Boss implements Printible {
    String attackType;

    @Override
    public void printible() {
        System.out.println("Phisical");
    }
}
