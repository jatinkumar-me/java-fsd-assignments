package com.jatin.project_31_07;

/**
 * WeightedBox
 */
public class WeightedBox extends ColoredBox {

	private int weight;

	/**
	 * @param color
	 * @param length
	 * @param width
	 * @param height
	 * @param weight
	 */
	public WeightedBox(String color, int length, int width, int height, int weight) {
		super(color, length, width, height);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getDensity() {
		return (float) weight / getVolume();
	}

	@Override
	public String toString() {
		return "WeightedBox [length=" + getLength() + ", width=" + getWidth() + ", height=" + getHeight() + ", color="
				+ color + ", density=" + getDensity() + "]";
	}
}
