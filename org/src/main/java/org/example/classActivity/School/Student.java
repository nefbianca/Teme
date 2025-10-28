package org.example.classActivity.School;

public class Student extends Person {
    private String clasa;

    public Student() {
        super();
        this.clasa ="VII";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Class: " + this.clasa);
    }
}