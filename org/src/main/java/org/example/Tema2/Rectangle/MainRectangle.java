package org.example.Tema2.Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Eroare: Lungimea și lățimea trebuie sa fie argumente!");
            return;
        }

        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        Rectangle myRectangle = new Rectangle(length, width);
        System.out.println("Rezultate pentru Dreptunghi (L=" + length + ", W=" + width + ")");


        double area = myRectangle.getArea();
        System.out.printf("Aria dreptunghiului este: " + area);

        double perimeter = myRectangle.getPerimeter();
        System.out.printf(". Perimetrul dreptunghiului este: " + perimeter);

        double diagonal = myRectangle.getDiagonal();
        System.out.printf(". Diagonala dreptunghiului este: " + diagonal);
    }
}
