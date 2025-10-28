package org.example.classActivity.Shapes;

public class Square {
    public double squareSide; // latura patratului
    public void setSide ( double side)
    {
        squareSide = side;

    }
    public double getArea () {
        return squareSide * squareSide;
    }
}
