package org.example.classActivity.Shapes;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle() {

    }

    public Rectangle (double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double lenght){
        this.lenght = lenght;
    }

    public double getArea() {
        return width * lenght;
    }

    public double getPerimeter() {
        return 2 * (width + lenght);

    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(1,2));
    }
}
