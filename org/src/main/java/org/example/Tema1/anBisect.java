package org.example.Tema1;
//definim clasa Scanner
import java.util.Scanner;
public class anBisect {
    public static void main(String[] args){
        //Pentru a citi de la tastatura
        Scanner scanner = new Scanner(System.in);
        //Citim anul
        System.out.println("Introduceti un an intre 1900 si 2016:");
        int an = scanner.nextInt();
        // Verificare interval ani
        if (an < 1900 || an > 2016) {
            System.out.println("Anul introdus " + an + " este in afara intervalului.");
            return;
        }
        // Verificare daca e bisect, adica divizibil cu 4 si 400, dar nu si cu 100
        boolean AnBisect = (an % 4 == 0) || ((an % 400 == 0) && (an % 100 != 0));
        int zileFebruarie;

        if (AnBisect) {
            zileFebruarie = 29;
        } else {
            zileFebruarie = 28;
        }
        System.out.println("In anul " + an + " luna Februarie are " + zileFebruarie + " zile.");
        scanner.close();

    }
}
