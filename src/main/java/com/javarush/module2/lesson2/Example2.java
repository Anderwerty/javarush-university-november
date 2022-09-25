package com.javarush.module2.lesson2;

public class Example2 {
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 10);
//        circle.methodJustInCircle();

        circle.printInfo();
    }
}

abstract class Figure {

    private final String name;

    protected Figure(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void printInfo() {
        System.out.println(name);
        System.out.println("=========");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Circle extends Figure {
    private final double radius;

    protected Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void methodJustInCircle(){
        System.out.println("Just in circle");
    }
}