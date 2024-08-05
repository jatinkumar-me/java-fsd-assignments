package com.jatin.inheritence;

/**
 * InheritDemo
 */
public class InheritDemo {
    
    public static void main(String[] args) {
        Bird peacock = new Bird("Peacock", 2);
        Aquatic fish = new Aquatic("fish", 0);

        peacock.identity();
        fish.identity();
    }
}
