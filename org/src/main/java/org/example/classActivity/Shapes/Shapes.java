package org.example.classActivity.Shapes;

public class Shapes {
    public static void main(String[] args) {
//        org.example.Square sq = new org.example.Square();
//        sq.setSide(7);
//        {
//            System.out.println(sq.getArea());
//        }

        for(int i=1; i<=5; i++){
            Square square = new Square();
            square.setSide(i);
            System.out.println(square.getArea());
        }


    }
}
