package org.example.Tema3;

public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(20);
        myCar.start();
        myCar.accelerate(50);
        myCar.accelerate(30); // Viteza ar trebui sa fie 80 km/h
        myCar.turnLeft();
        myCar.accelerate(150); // Viteza se limiteaza la 200
        myCar.turnRight();
        System.out.println("Stare finala masina:");
        System.out.println("Motor pornit: " + myCar.isStarted());
        System.out.println("Viteza: " + myCar.getSpeed() + " km/h");
        System.out.println("Directie: " + myCar.getDirection());
        myCar.stop();
    }
}
