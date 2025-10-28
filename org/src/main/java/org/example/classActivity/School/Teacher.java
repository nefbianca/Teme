package org.example.classActivity.School;

public class Teacher extends Person {
    private String department;

    public Teacher() {
        super();
        this.department = "Math";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + this.department);
    }
}