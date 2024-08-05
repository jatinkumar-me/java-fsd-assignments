package com.jatin.inheritence;

public class Animal {
    
    int noOfLegs;

	public Animal(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

    public void legs() {
        System.out.println("No of legs: " + noOfLegs);
    }

    public void move() {
        System.out.println("I move");
    }
}

