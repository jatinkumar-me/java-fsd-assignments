package com.jatin.project_31_07;

public class Box {

	private int length;
	private int width;
	private int height;

	/**
	 * @param length
	 * @param width
	 * @param height
	 */
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return Volume of the box
	 */
	public int getVolume() {
		return height * length * width;
	}
}
