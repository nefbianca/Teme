package org.example.classActivity.Shapes;

public class MainRectangle {
    public static void main(String[] args) {
        double length = 3;
        double width = 5;
        Rectangle rectangle1 = new Rectangle(length, width);
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Area of rectangle is: " + rectangle1.getArea());
        System.out.println("Diagonal of rectangle is: " + rectangle1.getDiagonal());
        System.out.println("Perimeter of rectangle is: " + rectangle1.getPerimeter());

        System.out.println("\n");

        rectangle2.setLength(5);
        rectangle2.setWidth(10);

        System.out.println("Area of rectangle is: " + rectangle2.getArea());
        System.out.println("Diagonal of rectangle is: " + rectangle2.getDiagonal());
        System.out.println("Perimeter of rectangle is: " + rectangle2.getPerimeter());
    }
}
