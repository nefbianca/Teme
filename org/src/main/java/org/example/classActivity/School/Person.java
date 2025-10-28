package org.example.classActivity.School;

public class Person {
    public class Person {
        public String name;
        private int age;
        private double CNP;
        private String adress;


        public Person() {
            this.name = "Unknow";
            this.age = 0;
            this.CNP = 0;
            this.adress = "Unknown";
        }

        public String getName() {
            return name;
        }

        public String setName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int setAge() {
            return age;
        }

        public double getCNP() {
            return CNP;
        }

        public double setCNP() {
            return CNP;
        }

        public String getAdress() {
            return adress;
        }

        public String setAdress() {
            return adress;
        }


        public Person(String name, int age, double CNP, String adress) {
            this.name = name;
            this.age = age;
            this.CNP = CNP;
            this.adress = adress;
        }

        public void displayInfo() {
            System.out.println("Name: " + this.name + ", Age: " + this.age + ", CNP: " + this.CNP + ", Adress: ");
        }

    }
}
