package org.example.classActivity.Shapes;

public class Shapes {
    public static void main(String[] args) {
        double sideValue = Double.parseDouble(args[0]);
        Square sq = new Square();
        sq.setSide(sideValue);
        double area = sq.getArea();

        System.out.println("Latura pătratului este: " + sideValue);
        System.out.println("Aria pătratului este: " + area);
    }
}



//  for (String currentArg : args) {
//    double sideValue = Double.parseDouble(currentArg);
//    Square sq = new Square();
//    sq.setSide(sideValue);
//    double area = sq.getArea();
//    System.out.println("---");
//    System.out.println("Latura: " + sideValue);
//    System.out.println("Aria: " + area);
//    }
//    System.out.println("---");
//
//}