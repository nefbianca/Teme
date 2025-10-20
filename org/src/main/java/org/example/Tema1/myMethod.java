package org.example.Tema1;

public class myMethod {
    public static void main(String[] args) {

        if (args.length == 2) {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            drawFullShape(width, height);
        } else if (args.length == 1) {
            int size = Integer.parseInt(args[0]);
            drawFullShape(size,size);
        } else if (args.length == 0) {
            System.out.println("Utilizare: java RectangleDrawer <latime> <inaltime>");
            System.out.println("Examplu 1: java Main 5 3  → dreptunghi");
            System.out.println("Examplu 2: java Main 4    → patrat");
        }
    }

    // Original rectangle method
    public static void drawFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
