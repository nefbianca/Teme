package org.example.Tema2.Light;

public class Main {
    public static void main(String[] args) {
        Light myLight = new Light();

        System.out.println("Stare inițială: ON = " + myLight.isOn() + ", Intensitate = " + myLight.getIntensity());

        myLight.turnOn();
        myLight.brighten(30); // 50 + 30 = 80
        myLight.dim(40);      // 80 - 40 = 40
        myLight.brighten(70); // 40 + 70 = 110 (se limiteaza la 100)
        myLight.dim(99);      // 100 - 99 = 1 (se limiteaza la 1)
        myLight.turnOff();
        myLight.dim(10);      // Nu se poate dim, e stins

        System.out.println("Stare finală: ON = " + myLight.isOn() + ", Intensitate = " + myLight.getIntensity());
    }
}
