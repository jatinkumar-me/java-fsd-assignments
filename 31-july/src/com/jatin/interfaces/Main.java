package com.jatin.interfaces;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Polygon circle = new Circle(32);
        Polygon rect = new Rectangle(32, 3);

        circle.sayArea();
        rect.sayArea();
    }
}

class Circle implements Polygon {

    int radius;

	/**
	 * @param radius
	 */
	public Circle(int radius) {
        this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Polygon {

    int length;
    int width;

	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
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


	@Override
	public double area() {
        return this.length * this.width;
	}
}
