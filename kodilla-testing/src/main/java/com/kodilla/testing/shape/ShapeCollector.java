package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
private ArrayList<Shape> shapes;
    public ShapeCollector() {
        shapes = new ArrayList<>();
    }
    public void addFigure (Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure (Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure (int n) {
        return shapes.get(n);
    }
    public String showFigures () {
        StringBuilder result = new StringBuilder();
        for(Shape shape : shapes) {
            result.append(shape.getClass().getSimpleName()).append(" ");
        }
        return result.toString();
    }
    public int size() {
        return shapes.size();
    }
}