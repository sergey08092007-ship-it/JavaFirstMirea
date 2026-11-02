package ru.mirea.task3.s2;

public class Circle {
    private Point center;
    private double radius;
    private String color;

    public Circle(Point center, double radius, String color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

    public double getArea() { return Math.PI * radius * radius; }
    public double getLength() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return String.format("Circle[center=%s, r=%.2f, color=%s]", center, radius, color);
    }
}