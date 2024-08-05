package com.jatin.inheritence;

public class Bird extends Animal {

    String name;

    public Bird(String name, int noOfLegs) {
        super(noOfLegs);
        this.name = name;
    }

    public void identity() {
        System.out.println("I am a" + name + " no of legs " + this.noOfLegs);
    }
}
