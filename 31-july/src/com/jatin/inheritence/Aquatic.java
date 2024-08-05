package com.jatin.inheritence;

public class Aquatic extends Animal {

	String name;

	public Aquatic(String name, int noOfLegs) {
		super(noOfLegs);
		this.name = name;
	}

	public void identity() {
		System.out.println("I am a " + name + " no of legs " + noOfLegs);
	}
}
