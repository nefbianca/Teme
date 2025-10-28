package org.example.classActivity.School;

public class MainSchool {
        public static void main(String[] args) {
            Person person = new Person ();
            person.getAge();
            person.getName();
            person.getCNP();
            person.getAdress();

            person.displayInfo();

            Teacher teacher = new Teacher();
            teacher.displayInfo();

            Student student = new Student();
            student.displayInfo();
        }
    }
