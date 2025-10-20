package org.example.Tema2.Light;

public class Main {
    public static void main(String[] args) {
        System.out.println("Light control simulation");
        Light myLight = new Light();
        myLight.displayStatus();
        System.out.println("Test turn on");
        myLight.turnOn();
        myLight.displayStatus();
        System.out.println("Test brighten");
        myLight.brighten();
        myLight.displayStatus();
        System.out.println("Test dim");
        myLight.dim();
        myLight.displayStatus();
        System.out.println("Test turn off");
        myLight.turnOff();
        myLight.displayStatus();
    }
}
