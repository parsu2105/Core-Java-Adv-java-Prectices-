package com.Revijan;
abstract class Shap {
    abstract void calculateArea();
}

class Circle extends Shap {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Area of Circle = " + 3.14 * radius * radius);
    }
}

class Rectangle extends Shap {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle = " + length * breadth);
    }
}

public class Shape {
    public static void main(String[] args) {
        Shap s1 = new Circle(5);
        s1.calculateArea();

        Shap s2 = new Rectangle(4, 6);
        s2.calculateArea();
    }
}
