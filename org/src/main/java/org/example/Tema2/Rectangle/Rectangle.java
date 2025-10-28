package org.example.Tema2.Rectangle;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.length, 2));
    }
}
