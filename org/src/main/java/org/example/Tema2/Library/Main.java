package org.example.Tema2.Library;

public class Main {
    public static void main(String[] args) {

        Author nikolas = new Author("Nikolas Sparks", "nikolas.sparks@yahoo.com");
        System.out.println("Autor creat: " + nikolas.toString());

        Book love = new Book("Love", 2025, nikolas, 70);

        String bookName = love.getName();
        double bookPrice = love.getPrice();
        String authorName = love.getAuthor().getName();
        int bookYear = love.getYear();

        System.out.println("Detaliile Cartii: ");
    }
}
