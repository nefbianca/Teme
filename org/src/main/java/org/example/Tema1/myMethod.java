package org.example.Tema1;

public class myMethod {
    public static void main(String[] args) {

            if (args.length == 2) {

                int width = Integer.parseInt(args[0]);
                int height = Integer.parseInt(args[1]);

                drawFullShape(width, height);

            } else {
                System.out.println("Utilizare: java myMethod <latime> <inaltime>");
            }
        }

        public static void drawFullShape(int width, int height) {

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }