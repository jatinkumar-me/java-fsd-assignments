package com.jatin.project_31_07;

public class Main {

	public static void main(String[] args) {
		Box myBox = new Box(32, 32, 3);
		System.out.println("Box1 volume: " + myBox.getVolume());

		ColoredBox coloredBox = new ColoredBox("red", 31, 3, 5);
		WeightedBox weightedBox = new WeightedBox("white", 32, 2, 4, 9);

		System.out.println("Box2 color " + coloredBox.getColor());
		System.out.println("Box3 Density: " + weightedBox.getDensity());
	}
}
