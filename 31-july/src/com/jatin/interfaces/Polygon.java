package com.jatin.interfaces;

public interface Polygon {

    double area();

    default void sayArea() {
        System.out.println(area());
    }
}
