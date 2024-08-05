package com.jatin.project_31_07;

public class ColoredBox extends Box {

	String color;

	/**
	 * @param color
	 * @param length
	 * @param width
	 * @param height
	 */
	public ColoredBox(String color, int length, int width, int height) {
		super(length, width, height);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Box [length=" + getLength() + ", width=" + getWidth() + ", height=" + getHeight() + ", color=" + color
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
